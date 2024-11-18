package jsxm.testAdapters;

import org.jsxm.program.HealthcareSystem;

public class HealthcareSystemAdapter {

    HealthcareSystem healthcareSystem = new HealthcareSystem();

    public String pacientListInput() {
        try {
            String result = healthcareSystem.pacientList();
            return "pacientListOutput_" + result;
        } catch (Exception e) {
            return "pacientListInput_Error";
        }
    }

    public String addPacientInput(String id) {
        try {
            String result = healthcareSystem.addPacient(id);
            return "addPacientOutput_" + result;
        } catch (Exception e) {
            return "addPacientInput_Error";
        }
    }

    public String removePacientInput(String id) {
        try {
            String result = healthcareSystem.removePacient(id);
            return "removePacientOutput_" + result;
        } catch (Exception e) {
            return "removePacientInput_Error";
        }
    }

    public String assignPrescriptionInput(String prescriptionString) {
        try {
            healthcareSystem.assignPrescription(prescriptionString);
            return "assignPrescriptionOutput";
        } catch (Exception e) {
            return "assignPrescriptionInput_Error";
        }
    }

    public String consultInput(String id) {
        try {
            healthcareSystem.consult(id);
            return "consultOutput";
        } catch (Exception e) {
            return "consultInput_Error";
        }
    }

    public String finishInput() {
        try {
            healthcareSystem.finish();
            return "finishOutput";
        } catch (Exception e) {
            return "finishInput_Error";
        }
    }

    public String informationsInput() {
        try {
            String result = healthcareSystem.informations();
            return "informationsOutput_" + result;
        } catch (Exception e) {
            return "informationsInput_Error";
        }
    }
}
