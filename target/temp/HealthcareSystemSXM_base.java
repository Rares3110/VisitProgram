/** * JSXM CONFIDENTIAL*
*  __________________
Unpublished Copyright*
* © 2009-2013 Dimitris Dranidis, 
* All Rights Reserved.
*
* NOTICE:  All information contained herein is, and remains the property of Dimitris Dranidis .
*
* The intellectual and technical concepts contained herein are proprietary to the owner
* Dimitris Dranidis and may be covered by U.S and Foreign Patents, patents in process,
* and are protected by trade secret or copyright law. Dissemination of this information or
* reproduction of this material is strictly forbidden unless prior written permission is
* obtained from Dimitris Dranidis. Access to the source code contained herein is hereby
* forbidden to anyone except the owner.Confidentiality and Non-disclosure agreements 
* explicitly covering such access.


*The copyright notice above does not evidence any actual or intended publication 
* or disclosure  of  this source code, which includes information that is confidential 
* and/or proprietary, and is a trade secret, of  Dimitris Dranidis. ANY REPRODUCTION, 
* MODIFICATION, DISTRIBUTION, PUBLIC  PERFORMANCE, OR PUBLIC DISPLAY OF OR THROUGH USE  OF 
* THIS  SOURCE CODE  WITHOUT  THE EXPRESS WRITTEN CONSENT OF COMPANY IS STRICTLY PROHIBITED, 
* AND IN VIOLATION OF APPLICABLE LAWS AND INTERNATIONAL TREATIES.  THE RECEIPT OR POSSESSION OF 
* THIS SOURCE CODE AND/OR RELATED INFORMATION DOES NOT CONVEY OR IMPLY ANY RIGHTS  
* TO REPRODUCE, DISCLOSE OR DISTRIBUTE ITS CONTENTS, OR TO MANUFACTURE, USE, OR SELL 
* ANYTHING THAT IT  MAY DESCRIBE, IN WHOLE OR IN PART.
* 
*/
package org.jsxm.jsxmcore.types;

import org.jsxm.jsxmcore.core.*;
import org.jsxm.jsxmcore.types.*;
import org.jsxm.jsxmcore.exceptions.*;

public abstract class HealthcareSystemSXM_base extends SXM{
    // this file was generated with the following specification
    public String getSpecification() {
       return "C:\\Users\\Rares\\Desktop\\VisitProgram\\src\\spec\\org\\jsxm\\program\\HealthcareSystem\\specification\\HealthcareSystem.xml";
    }

    // create the associated Sxm object
    {
        Sxm sxm = new Sxm(this);
    }
    
    
    // STATES
    State idle = new State("idle");
    { states.add(idle); }
    State pacient = new State("pacient");
    { states.add(pacient); }
    State allpacients = new State("allpacients");
    { states.add(allpacients); }
    State finished = new State("finished");
    { states.add(finished); }
    {
        setInitialState(idle);
    }
    //   
    //  PROCESSING FUNCTIONS (ABSTRACT CLASSES) 
    //   
    
    protected abstract class Function_consult_id extends Function {
        public Function_consult_id() {
            super("consult", new Input("consultInput", new Type[]{new Str()}, new String[]{"id"}));
        }
    
        protected Input_consultInput consultInput = new Input_consultInput(this);

        public void evaluateArguments() {
            consultInput.id = ((Str) getArg(0)).getValue();
        }
    
    
        protected Output_consultOutput consultOutput = new Output_consultOutput();
        public Output getResponse() { 
            return consultOutput.createOutput();
        }
    
        public State[] preStates() {
            State[] p = { idle, allpacients };
            return p;
        }
    
        public State postState(State preState) {
            if (preState == idle) return pacient;
            else if (preState == allpacients) return pacient;
            else throw new RuntimeException("Function 'consult'. No applicable postState!!");
        }
    }
    
    protected abstract class Function_pacientList extends Function {
        public Function_pacientList() {
            super("pacientList", new Input("pacientListInput", new Type[]{}, new String[]{}));
        }
        
    
        protected Output_pacientListOutput pacientListOutput = new Output_pacientListOutput();
        public Output getResponse() { 
            return pacientListOutput.createOutput();
        }
    
        public State[] preStates() {
            State[] p = { idle, pacient };
            return p;
        }
    
        public State postState(State preState) {
            if (preState == idle) return allpacients;
            else if (preState == pacient) return allpacients;
            else throw new RuntimeException("Function 'pacientList'. No applicable postState!!");
        }
    }
    
    protected abstract class Function_addPacient_id extends Function {
        public Function_addPacient_id() {
            super("addPacient", new Input("addPacientInput", new Type[]{new Str()}, new String[]{"id"}));
        }
    
        protected Input_addPacientInput addPacientInput = new Input_addPacientInput(this);

        public void evaluateArguments() {
            addPacientInput.id = ((Str) getArg(0)).getValue();
        }
    
    
        protected Output_addPacientOutput addPacientOutput = new Output_addPacientOutput();
        public Output getResponse() { 
            return addPacientOutput.createOutput();
        }
    
        public State[] preStates() {
            State[] p = { allpacients };
            return p;
        }
    
        public State postState(State preState) {
            if (preState == allpacients) return allpacients;
            else throw new RuntimeException("Function 'addPacient'. No applicable postState!!");
        }
    }
    
    protected abstract class Function_removePacient_id extends Function {
        public Function_removePacient_id() {
            super("removePacient", new Input("removePacientInput", new Type[]{new Str()}, new String[]{"id"}));
        }
    
        protected Input_removePacientInput removePacientInput = new Input_removePacientInput(this);

        public void evaluateArguments() {
            removePacientInput.id = ((Str) getArg(0)).getValue();
        }
    
    
        protected Output_removePacientOutput removePacientOutput = new Output_removePacientOutput();
        public Output getResponse() { 
            return removePacientOutput.createOutput();
        }
    
        public State[] preStates() {
            State[] p = { allpacients };
            return p;
        }
    
        public State postState(State preState) {
            if (preState == allpacients) return allpacients;
            else throw new RuntimeException("Function 'removePacient'. No applicable postState!!");
        }
    }
    
    protected abstract class Function_assignPrescription_prescriptionString extends Function {
        public Function_assignPrescription_prescriptionString() {
            super("assignPrescription", new Input("assignPrescriptionInput", new Type[]{new Str()}, new String[]{"prescriptionString"}));
        }
    
        protected Input_assignPrescriptionInput assignPrescriptionInput = new Input_assignPrescriptionInput(this);

        public void evaluateArguments() {
            assignPrescriptionInput.prescriptionString = ((Str) getArg(0)).getValue();
        }
    
    
        protected Output_assignPrescriptionOutput assignPrescriptionOutput = new Output_assignPrescriptionOutput();
        public Output getResponse() { 
            return assignPrescriptionOutput.createOutput();
        }
    
        public State[] preStates() {
            State[] p = { pacient };
            return p;
        }
    
        public State postState(State preState) {
            if (preState == pacient) return pacient;
            else throw new RuntimeException("Function 'assignPrescription'. No applicable postState!!");
        }
    }
    
    protected abstract class Function_informations extends Function {
        public Function_informations() {
            super("informations", new Input("informationsInput", new Type[]{}, new String[]{}));
        }
        
    
        protected Output_informationsOutput informationsOutput = new Output_informationsOutput();
        public Output getResponse() { 
            return informationsOutput.createOutput();
        }
    
        public State[] preStates() {
            State[] p = { pacient };
            return p;
        }
    
        public State postState(State preState) {
            if (preState == pacient) return pacient;
            else throw new RuntimeException("Function 'informations'. No applicable postState!!");
        }
    }
    
    protected abstract class Function_finish extends Function {
        public Function_finish() {
            super("finish", new Input("finishInput", new Type[]{}, new String[]{}));
        }
        
    
        protected Output_finishOutput finishOutput = new Output_finishOutput();
        public Output getResponse() { 
            return finishOutput.createOutput();
        }
    
        public State[] preStates() {
            State[] p = { pacient, allpacients };
            return p;
        }
    
        public State postState(State preState) {
            if (preState == pacient) return finished;
            else if (preState == allpacients) return finished;
            else throw new RuntimeException("Function 'finish'. No applicable postState!!");
        }
    }
    //   
    //  PUBLIC METHODS for Interaction 
    //   
    
    public Output_addPacientOutput addPacientInput(java.lang.String id) {
        Input input = new Input("addPacientInput", new Type[]{new Str(id)}, new String[]{"id"});
        Output output = null;
        try {
            output = animateStep(input, SXM.CONTINUE_ON_ERROR);
        } catch (Exception e) {
            System.err.println("animation of input addPacientInput("+id+") failed!");
            e.printStackTrace();
            System.exit(-1);
        }
        if (output instanceof Fault)
        throw new RuntimeException("\n*** Fault:" + output + " on input: " + input +
        		"\n*** Probably an error in the specification.  \n"+
        		"*** Either the precondition or the effect of a function\n"+
        		"*** produced a Fault instead of an Output during an interaction.");
        return new Output_addPacientOutput(output);
    }
    
    public Output_informationsOutput informationsInput() {
        Input input = new Input("informationsInput", new Type[]{}, new String[]{});
        Output output = null;
        try {
            output = animateStep(input, SXM.CONTINUE_ON_ERROR);
        } catch (Exception e) {
            System.err.println("animation of input informationsInput() failed!");
            e.printStackTrace();
            System.exit(-1);
        }
        if (output instanceof Fault)
        throw new RuntimeException("\n*** Fault:" + output + " on input: " + input +
        		"\n*** Probably an error in the specification.  \n"+
        		"*** Either the precondition or the effect of a function\n"+
        		"*** produced a Fault instead of an Output during an interaction.");
        return new Output_informationsOutput(output);
    }
    
    public Output_removePacientOutput removePacientInput(java.lang.String id) {
        Input input = new Input("removePacientInput", new Type[]{new Str(id)}, new String[]{"id"});
        Output output = null;
        try {
            output = animateStep(input, SXM.CONTINUE_ON_ERROR);
        } catch (Exception e) {
            System.err.println("animation of input removePacientInput("+id+") failed!");
            e.printStackTrace();
            System.exit(-1);
        }
        if (output instanceof Fault)
        throw new RuntimeException("\n*** Fault:" + output + " on input: " + input +
        		"\n*** Probably an error in the specification.  \n"+
        		"*** Either the precondition or the effect of a function\n"+
        		"*** produced a Fault instead of an Output during an interaction.");
        return new Output_removePacientOutput(output);
    }
    
    public Output_assignPrescriptionOutput assignPrescriptionInput(java.lang.String prescriptionString) {
        Input input = new Input("assignPrescriptionInput", new Type[]{new Str(prescriptionString)}, new String[]{"prescriptionString"});
        Output output = null;
        try {
            output = animateStep(input, SXM.CONTINUE_ON_ERROR);
        } catch (Exception e) {
            System.err.println("animation of input assignPrescriptionInput("+prescriptionString+") failed!");
            e.printStackTrace();
            System.exit(-1);
        }
        if (output instanceof Fault)
        throw new RuntimeException("\n*** Fault:" + output + " on input: " + input +
        		"\n*** Probably an error in the specification.  \n"+
        		"*** Either the precondition or the effect of a function\n"+
        		"*** produced a Fault instead of an Output during an interaction.");
        return new Output_assignPrescriptionOutput(output);
    }
    
    public Output_consultOutput consultInput(java.lang.String id) {
        Input input = new Input("consultInput", new Type[]{new Str(id)}, new String[]{"id"});
        Output output = null;
        try {
            output = animateStep(input, SXM.CONTINUE_ON_ERROR);
        } catch (Exception e) {
            System.err.println("animation of input consultInput("+id+") failed!");
            e.printStackTrace();
            System.exit(-1);
        }
        if (output instanceof Fault)
        throw new RuntimeException("\n*** Fault:" + output + " on input: " + input +
        		"\n*** Probably an error in the specification.  \n"+
        		"*** Either the precondition or the effect of a function\n"+
        		"*** produced a Fault instead of an Output during an interaction.");
        return new Output_consultOutput(output);
    }
    
    public Output_pacientListOutput pacientListInput() {
        Input input = new Input("pacientListInput", new Type[]{}, new String[]{});
        Output output = null;
        try {
            output = animateStep(input, SXM.CONTINUE_ON_ERROR);
        } catch (Exception e) {
            System.err.println("animation of input pacientListInput() failed!");
            e.printStackTrace();
            System.exit(-1);
        }
        if (output instanceof Fault)
        throw new RuntimeException("\n*** Fault:" + output + " on input: " + input +
        		"\n*** Probably an error in the specification.  \n"+
        		"*** Either the precondition or the effect of a function\n"+
        		"*** produced a Fault instead of an Output during an interaction.");
        return new Output_pacientListOutput(output);
    }
    
    public Output_finishOutput finishInput() {
        Input input = new Input("finishInput", new Type[]{}, new String[]{});
        Output output = null;
        try {
            output = animateStep(input, SXM.CONTINUE_ON_ERROR);
        } catch (Exception e) {
            System.err.println("animation of input finishInput() failed!");
            e.printStackTrace();
            System.exit(-1);
        }
        if (output instanceof Fault)
        throw new RuntimeException("\n*** Fault:" + output + " on input: " + input +
        		"\n*** Probably an error in the specification.  \n"+
        		"*** Either the precondition or the effect of a function\n"+
        		"*** produced a Fault instead of an Output during an interaction.");
        return new Output_finishOutput(output);
    }
    //   
    //  INNER CLASSES FOR INPUTS 
    //   
    protected class Input_addPacientInput{
    
    // inputs have private access to their atributes 
    // set_ and get_ methods are used for access.
    
        protected Function function;
        public Input_addPacientInput(Function f) {
            function = f;
        }
        private java.lang.String id;

        public void set_id(java.lang.String arg) throws DefinitionNotFoundException {
        //    the following assignment is not necessary
        //    since evaluatearguments is called at the end
        //    of setArg which causes input attributes to be set.
        //    this.id = arg;
              function.setArgValue(0, new Str(arg));
              this.id = arg;
        }
    
        public java.lang.String get_id() {
             return id;
        }
    }
    protected class Input_informationsInput{
    
    // inputs have private access to their atributes 
    // set_ and get_ methods are used for access.
    
        protected Function function;
        public Input_informationsInput(Function f) {
            function = f;
        }
    }
    protected class Input_removePacientInput{
    
    // inputs have private access to their atributes 
    // set_ and get_ methods are used for access.
    
        protected Function function;
        public Input_removePacientInput(Function f) {
            function = f;
        }
        private java.lang.String id;

        public void set_id(java.lang.String arg) throws DefinitionNotFoundException {
        //    the following assignment is not necessary
        //    since evaluatearguments is called at the end
        //    of setArg which causes input attributes to be set.
        //    this.id = arg;
              function.setArgValue(0, new Str(arg));
              this.id = arg;
        }
    
        public java.lang.String get_id() {
             return id;
        }
    }
    protected class Input_assignPrescriptionInput{
    
    // inputs have private access to their atributes 
    // set_ and get_ methods are used for access.
    
        protected Function function;
        public Input_assignPrescriptionInput(Function f) {
            function = f;
        }
        private java.lang.String prescriptionString;

        public void set_prescriptionString(java.lang.String arg) throws DefinitionNotFoundException {
        //    the following assignment is not necessary
        //    since evaluatearguments is called at the end
        //    of setArg which causes input attributes to be set.
        //    this.prescriptionString = arg;
              function.setArgValue(0, new Str(arg));
              this.prescriptionString = arg;
        }
    
        public java.lang.String get_prescriptionString() {
             return prescriptionString;
        }
    }
    protected class Input_consultInput{
    
    // inputs have private access to their atributes 
    // set_ and get_ methods are used for access.
    
        protected Function function;
        public Input_consultInput(Function f) {
            function = f;
        }
        private java.lang.String id;

        public void set_id(java.lang.String arg) throws DefinitionNotFoundException {
        //    the following assignment is not necessary
        //    since evaluatearguments is called at the end
        //    of setArg which causes input attributes to be set.
        //    this.id = arg;
              function.setArgValue(0, new Str(arg));
              this.id = arg;
        }
    
        public java.lang.String get_id() {
             return id;
        }
    }
    protected class Input_pacientListInput{
    
    // inputs have private access to their atributes 
    // set_ and get_ methods are used for access.
    
        protected Function function;
        public Input_pacientListInput(Function f) {
            function = f;
        }
    }
    protected class Input_finishInput{
    
    // inputs have private access to their atributes 
    // set_ and get_ methods are used for access.
    
        protected Function function;
        public Input_finishInput(Function f) {
            function = f;
        }
    }
    //   
    //  INNER CLASSES FOR OUTPUTS 
    //   
    protected class Output_removePacientOutput{
        protected java.lang.String result;
        protected Output_removePacientOutput() {}
        protected Output_removePacientOutput(Output output) {
            result=((Str) output.getValue("result")).getValue();
        }
        protected Output createOutput() {
            return new Output("removePacientOutput", 
                new Type[]{new Str(result)}, 
                new String[]{"result"});
            }
    }
    protected class Output_assignPrescriptionOutput{
        protected Output_assignPrescriptionOutput() {}
        protected Output_assignPrescriptionOutput(Output output) {
        }
        protected Output createOutput() {
            return new Output("assignPrescriptionOutput", 
                new Type[]{}, 
                new String[]{});
            }
    }
    protected class Output_informationsOutput{
        protected java.lang.String result;
        protected Output_informationsOutput() {}
        protected Output_informationsOutput(Output output) {
            result=((Str) output.getValue("result")).getValue();
        }
        protected Output createOutput() {
            return new Output("informationsOutput", 
                new Type[]{new Str(result)}, 
                new String[]{"result"});
            }
    }
    protected class Output_pacientListOutput{
        protected java.lang.String result;
        protected Output_pacientListOutput() {}
        protected Output_pacientListOutput(Output output) {
            result=((Str) output.getValue("result")).getValue();
        }
        protected Output createOutput() {
            return new Output("pacientListOutput", 
                new Type[]{new Str(result)}, 
                new String[]{"result"});
            }
    }
    protected class Output_addPacientOutput{
        protected java.lang.String result;
        protected Output_addPacientOutput() {}
        protected Output_addPacientOutput(Output output) {
            result=((Str) output.getValue("result")).getValue();
        }
        protected Output createOutput() {
            return new Output("addPacientOutput", 
                new Type[]{new Str(result)}, 
                new String[]{"result"});
            }
    }
    protected class Output_consultOutput{
        protected Output_consultOutput() {}
        protected Output_consultOutput(Output output) {
        }
        protected Output createOutput() {
            return new Output("consultOutput", 
                new Type[]{}, 
                new String[]{});
            }
    }
    protected class Output_finishOutput{
        protected Output_finishOutput() {}
        protected Output_finishOutput(Output output) {
        }
        protected Output createOutput() {
            return new Output("finishOutput", 
                new Type[]{}, 
                new String[]{});
            }
    }
}

