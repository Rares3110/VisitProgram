package jsxm.testAdapters;

import org.jsxm.program.Prescription;

public class PrescriptionAdapter {

    Prescription prescription = new Prescription();

    public String addItemInput(String name, int quantity) {
        try {
            String result = prescription.addItem(name, quantity);
            return "addItemOutput_" + result;
        } catch (Exception e) {
            return "addItemInput_Error";
        }
    }

    public String closeInput() {
        try {
            prescription.close();
            return "closeOutput";
        } catch (Exception e) {
            return "closeInput_Error";
        }
    }

    public String getContentInput() {
        try {
            String result = prescription.getContent();
            return "getContentOutput_" + result;
        } catch (Exception e) {
            return "getContentInput_Error";
        }
    }

    public String isUsedInput() {
        try {
            boolean result = prescription.isUsed();
            return "isUsedOutput_" + result;
        } catch (Exception e) {
            return "isUsedInput_Error";
        }
    }

    public String useInput() {
        try {
            boolean result = prescription.use();
            return "useOutput_" + result;
        } catch (Exception e) {
            return "useInput_Error";
        }
    }
}
