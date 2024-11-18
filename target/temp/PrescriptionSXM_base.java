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

public abstract class PrescriptionSXM_base extends SXM{
    // this file was generated with the following specification
    public String getSpecification() {
       return "C:\\Users\\Rares\\Desktop\\VisitProgram\\src\\spec\\org\\jsxm\\program\\Prescription\\specification\\Prescription.xml";
    }

    // create the associated Sxm object
    {
        Sxm sxm = new Sxm(this);
    }
    
    
    // STATES
    State open = new State("open");
    { states.add(open); }
    State ready = new State("ready");
    { states.add(ready); }
    State used = new State("used");
    { states.add(used); }
    {
        setInitialState(open);
    }
    //   
    //  PROCESSING FUNCTIONS (ABSTRACT CLASSES) 
    //   
    
    protected abstract class Function_addItem_name_quantity extends Function {
        public Function_addItem_name_quantity() {
            super("addItem", new Input("addItemInput", new Type[]{new Str(), new Int()}, new String[]{"name", "quantity"}));
        }
    
        protected Input_addItemInput addItemInput = new Input_addItemInput(this);

        public void evaluateArguments() {
            addItemInput.name = ((Str) getArg(0)).getValue();
            addItemInput.quantity = ((Int) getArg(1)).getValue();
        }
    
    
        protected Output_addItemOutput addItemOutput = new Output_addItemOutput();
        public Output getResponse() { 
            return addItemOutput.createOutput();
        }
    
        public State[] preStates() {
            State[] p = { open };
            return p;
        }
    
        public State postState(State preState) {
            if (preState == open) return open;
            else throw new RuntimeException("Function 'addItem'. No applicable postState!!");
        }
    }
    
    protected abstract class Function_close extends Function {
        public Function_close() {
            super("close", new Input("closeInput", new Type[]{}, new String[]{}));
        }
        
    
        protected Output_closeOutput closeOutput = new Output_closeOutput();
        public Output getResponse() { 
            return closeOutput.createOutput();
        }
    
        public State[] preStates() {
            State[] p = { open };
            return p;
        }
    
        public State postState(State preState) {
            if (preState == open) return ready;
            else throw new RuntimeException("Function 'close'. No applicable postState!!");
        }
    }
    
    protected abstract class Function_getContent extends Function {
        public Function_getContent() {
            super("getContent", new Input("getContentInput", new Type[]{}, new String[]{}));
        }
        
    
        protected Output_getContentOutput getContentOutput = new Output_getContentOutput();
        public Output getResponse() { 
            return getContentOutput.createOutput();
        }
    
        public State[] preStates() {
            State[] p = { ready };
            return p;
        }
    
        public State postState(State preState) {
            if (preState == ready) return ready;
            else throw new RuntimeException("Function 'getContent'. No applicable postState!!");
        }
    }
    
    protected abstract class Function_isUsed extends Function {
        public Function_isUsed() {
            super("isUsed", new Input("isUsedInput", new Type[]{}, new String[]{}));
        }
        
    
        protected Output_isUsedOutput isUsedOutput = new Output_isUsedOutput();
        public Output getResponse() { 
            return isUsedOutput.createOutput();
        }
    
        public State[] preStates() {
            State[] p = { ready, used };
            return p;
        }
    
        public State postState(State preState) {
            if (preState == ready) return ready;
            else if (preState == used) return used;
            else throw new RuntimeException("Function 'isUsed'. No applicable postState!!");
        }
    }
    
    protected abstract class Function_use extends Function {
        public Function_use() {
            super("use", new Input("useInput", new Type[]{}, new String[]{}));
        }
        
    
        protected Output_useOutput useOutput = new Output_useOutput();
        public Output getResponse() { 
            return useOutput.createOutput();
        }
    
        public State[] preStates() {
            State[] p = { ready };
            return p;
        }
    
        public State postState(State preState) {
            if (preState == ready) return used;
            else throw new RuntimeException("Function 'use'. No applicable postState!!");
        }
    }
    //   
    //  PUBLIC METHODS for Interaction 
    //   
    
    public Output_closeOutput closeInput() {
        Input input = new Input("closeInput", new Type[]{}, new String[]{});
        Output output = null;
        try {
            output = animateStep(input, SXM.CONTINUE_ON_ERROR);
        } catch (Exception e) {
            System.err.println("animation of input closeInput() failed!");
            e.printStackTrace();
            System.exit(-1);
        }
        if (output instanceof Fault)
        throw new RuntimeException("\n*** Fault:" + output + " on input: " + input +
        		"\n*** Probably an error in the specification.  \n"+
        		"*** Either the precondition or the effect of a function\n"+
        		"*** produced a Fault instead of an Output during an interaction.");
        return new Output_closeOutput(output);
    }
    
    public Output_useOutput useInput() {
        Input input = new Input("useInput", new Type[]{}, new String[]{});
        Output output = null;
        try {
            output = animateStep(input, SXM.CONTINUE_ON_ERROR);
        } catch (Exception e) {
            System.err.println("animation of input useInput() failed!");
            e.printStackTrace();
            System.exit(-1);
        }
        if (output instanceof Fault)
        throw new RuntimeException("\n*** Fault:" + output + " on input: " + input +
        		"\n*** Probably an error in the specification.  \n"+
        		"*** Either the precondition or the effect of a function\n"+
        		"*** produced a Fault instead of an Output during an interaction.");
        return new Output_useOutput(output);
    }
    
    public Output_addItemOutput addItemInput(java.lang.String name, java.lang.Integer quantity) {
        Input input = new Input("addItemInput", new Type[]{new Str(name), new Int(quantity)}, new String[]{"name", "quantity"});
        Output output = null;
        try {
            output = animateStep(input, SXM.CONTINUE_ON_ERROR);
        } catch (Exception e) {
            System.err.println("animation of input addItemInput("+name+ quantity+") failed!");
            e.printStackTrace();
            System.exit(-1);
        }
        if (output instanceof Fault)
        throw new RuntimeException("\n*** Fault:" + output + " on input: " + input +
        		"\n*** Probably an error in the specification.  \n"+
        		"*** Either the precondition or the effect of a function\n"+
        		"*** produced a Fault instead of an Output during an interaction.");
        return new Output_addItemOutput(output);
    }
    
    public Output_getContentOutput getContentInput() {
        Input input = new Input("getContentInput", new Type[]{}, new String[]{});
        Output output = null;
        try {
            output = animateStep(input, SXM.CONTINUE_ON_ERROR);
        } catch (Exception e) {
            System.err.println("animation of input getContentInput() failed!");
            e.printStackTrace();
            System.exit(-1);
        }
        if (output instanceof Fault)
        throw new RuntimeException("\n*** Fault:" + output + " on input: " + input +
        		"\n*** Probably an error in the specification.  \n"+
        		"*** Either the precondition or the effect of a function\n"+
        		"*** produced a Fault instead of an Output during an interaction.");
        return new Output_getContentOutput(output);
    }
    
    public Output_isUsedOutput isUsedInput() {
        Input input = new Input("isUsedInput", new Type[]{}, new String[]{});
        Output output = null;
        try {
            output = animateStep(input, SXM.CONTINUE_ON_ERROR);
        } catch (Exception e) {
            System.err.println("animation of input isUsedInput() failed!");
            e.printStackTrace();
            System.exit(-1);
        }
        if (output instanceof Fault)
        throw new RuntimeException("\n*** Fault:" + output + " on input: " + input +
        		"\n*** Probably an error in the specification.  \n"+
        		"*** Either the precondition or the effect of a function\n"+
        		"*** produced a Fault instead of an Output during an interaction.");
        return new Output_isUsedOutput(output);
    }
    //   
    //  INNER CLASSES FOR INPUTS 
    //   
    protected class Input_closeInput{
    
    // inputs have private access to their atributes 
    // set_ and get_ methods are used for access.
    
        protected Function function;
        public Input_closeInput(Function f) {
            function = f;
        }
    }
    protected class Input_useInput{
    
    // inputs have private access to their atributes 
    // set_ and get_ methods are used for access.
    
        protected Function function;
        public Input_useInput(Function f) {
            function = f;
        }
    }
    protected class Input_addItemInput{
    
    // inputs have private access to their atributes 
    // set_ and get_ methods are used for access.
    
        protected Function function;
        public Input_addItemInput(Function f) {
            function = f;
        }
        private java.lang.String name;

        public void set_name(java.lang.String arg) throws DefinitionNotFoundException {
        //    the following assignment is not necessary
        //    since evaluatearguments is called at the end
        //    of setArg which causes input attributes to be set.
        //    this.name = arg;
              function.setArgValue(0, new Str(arg));
              this.name = arg;
        }
    
        public java.lang.String get_name() {
             return name;
        }
        private java.lang.Integer quantity;

        public void set_quantity(java.lang.Integer arg) throws DefinitionNotFoundException {
        //    the following assignment is not necessary
        //    since evaluatearguments is called at the end
        //    of setArg which causes input attributes to be set.
        //    this.quantity = arg;
              function.setArgValue(1, new Int(arg));
              this.quantity = arg;
        }
    
        public java.lang.Integer get_quantity() {
             return quantity;
        }
    }
    protected class Input_getContentInput{
    
    // inputs have private access to their atributes 
    // set_ and get_ methods are used for access.
    
        protected Function function;
        public Input_getContentInput(Function f) {
            function = f;
        }
    }
    protected class Input_isUsedInput{
    
    // inputs have private access to their atributes 
    // set_ and get_ methods are used for access.
    
        protected Function function;
        public Input_isUsedInput(Function f) {
            function = f;
        }
    }
    //   
    //  INNER CLASSES FOR OUTPUTS 
    //   
    protected class Output_useOutput{
        protected java.lang.Boolean result;
        protected Output_useOutput() {}
        protected Output_useOutput(Output output) {
            result=((Bool) output.getValue("result")).getValue();
        }
        protected Output createOutput() {
            return new Output("useOutput", 
                new Type[]{new Bool(result)}, 
                new String[]{"result"});
            }
    }
    protected class Output_addItemOutput{
        protected java.lang.String result;
        protected Output_addItemOutput() {}
        protected Output_addItemOutput(Output output) {
            result=((Str) output.getValue("result")).getValue();
        }
        protected Output createOutput() {
            return new Output("addItemOutput", 
                new Type[]{new Str(result)}, 
                new String[]{"result"});
            }
    }
    protected class Output_closeOutput{
        protected Output_closeOutput() {}
        protected Output_closeOutput(Output output) {
        }
        protected Output createOutput() {
            return new Output("closeOutput", 
                new Type[]{}, 
                new String[]{});
            }
    }
    protected class Output_getContentOutput{
        protected java.lang.String result;
        protected Output_getContentOutput() {}
        protected Output_getContentOutput(Output output) {
            result=((Str) output.getValue("result")).getValue();
        }
        protected Output createOutput() {
            return new Output("getContentOutput", 
                new Type[]{new Str(result)}, 
                new String[]{"result"});
            }
    }
    protected class Output_isUsedOutput{
        protected java.lang.Boolean result;
        protected Output_isUsedOutput() {}
        protected Output_isUsedOutput(Output output) {
            result=((Bool) output.getValue("result")).getValue();
        }
        protected Output createOutput() {
            return new Output("isUsedOutput", 
                new Type[]{new Bool(result)}, 
                new String[]{"result"});
            }
    }
}

