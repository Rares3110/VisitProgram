package org.jsxm.program;

import java.util.*;

public class HealthcareSystem {
    HashMap<String, List<Prescription>> pacients = new HashMap<String, List<Prescription>>();
    String activePacientId;
    boolean isFinished = false;
    boolean isListOpen = false;
    boolean isIdle = true;

    private boolean isPrescriptionStringValid(String input) {
        String[] parts = input.split(";");

        if (parts.length % 2 != 0)
            return false;

        for (int i = 0; i < parts.length - 1; i += 2) {
            if (!parts[i + 1].matches("\\d+"))
                return false;
        }

        return true;
    }

    private Prescription convertToPrescription(String input) {
        String[] parts = input.split(";");
        Prescription prescription = new Prescription();

        for (int i = 0; i < parts.length - 1; i += 2) {
            prescription.addItem(parts[i], Integer.parseInt(parts[i + 1]));
        }

        prescription.close();
        return prescription;
    }

    public String pacientList() {
        if ((isIdle == true || activePacientId != null) && isFinished == false) {
            isIdle = false;
            activePacientId = null;
            isListOpen = true;
            return "{" + String.join(";", pacients.keySet()) + "}";
        } else {
            throw new RuntimeException();
        }
    }

    public String addPacient(String id) {
        if (!pacients.containsKey(id) && isListOpen == true) {
            pacients.put(id, new ArrayList<Prescription>());
            return "{" + String.join(";", pacients.keySet()) + "}";
        } else {
            throw new RuntimeException();
        }
    }

    public String removePacient(String id) {
        if (pacients.containsKey(id) && isListOpen == true) {
            pacients.remove(id);
            return "{" + String.join(";", pacients.keySet()) + "}";
        } else {
            throw new RuntimeException();
        }
    }

    public void assignPrescription(String prescriptionString) {
        if (isPrescriptionStringValid(prescriptionString) && activePacientId != null) {
            pacients.get(activePacientId).add(convertToPrescription(prescriptionString));
        } else {
            throw new RuntimeException();
        }
    }

    public void consult(String id) {
        if (pacients.containsKey(id) && (isIdle == true || isListOpen == true) && activePacientId == null
                && isFinished == false) {
            isIdle = false;
            isListOpen = false;
            activePacientId = id;
        } else {
            throw new RuntimeException();
        }
    }

    public void finish() {
        if (isIdle == false && isFinished == false) {
            isListOpen = false;
            isFinished = true;
            activePacientId = null;
        } else {
            throw new RuntimeException();
        }
    }

    public String informations() {
        if (activePacientId != null) {
            List<Prescription> prescriptions = pacients.get(activePacientId);
            String allPrescriptions = "";

            for (Prescription prescription : prescriptions) {
                allPrescriptions = allPrescriptions + prescription.getContent();
            }

            return allPrescriptions;
        } else {
            throw new RuntimeException();
        }
    }
}
