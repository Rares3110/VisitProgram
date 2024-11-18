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
import org.jsxm.jsxmcore.exceptions.*;

import java.util.HashMap;
			import java.util.*;

public class HealthcareSystemSXM extends HealthcareSystemSXM_base {

//************ INLINE CODE from <memory><declaration> ************
    HashMap<String, List<PrescriptionSXM>> pacients;
			String activePacientId;
//************ END OF INLINE CODE ********************************


    public String memoryString() {
        String memory ="";
//************ INLINE CODE from <memory><display> ********************
        memory += activePacientId + " " + pacients.toString();
//************ END OF INLINE CODE ********************************
        return memory;
    }

    // Initial state and initial memory
    public void reset() {
        setCurrentState(getInitialState());
//************ INLINE CODE from <memory><initial> ****************
        pacients = new HashMap<String, List<PrescriptionSXM>>();
			activePacientId = null;
//************ END OF INLINE CODE ********************************

    }


//************   INLINE CODE from <methods>           ************
    public boolean isPrescriptionStringValid(String input) {
			String[] parts = input.split(";");

			if (parts.length % 2 != 0)
				return false;

			for (int i = 0; i < parts.length - 1; i += 2) {
				if (!parts[i + 1].matches("\\d+"))
					return false;
			}

			return true;
		}

		public PrescriptionSXM convertToPrescription(String input) {
			String[] parts = input.split(";");
			PrescriptionSXM prescription = new PrescriptionSXM();
			prescription.reset();

			for (int i = 0; i < parts.length - 1; i += 2) {
				prescription.addItemInput(parts[i], Integer.parseInt(parts[i + 1]));
			}

			prescription.closeInput();
			return prescription;
		};
//************ END OF INLINE CODE ********************************


    // Processing Functions

    Function consult = new Function_consult_id() {
    // use id  for access to the arguments

        public boolean preCondition() {
            return
//*** INLINE CODE from <function name="consult" ... ><precondition> ***
            pacients.containsKey(consultInput.get_id());
//*** END OF INLINE CODE  ***
        }

        public void effect() {
//*** INLINE CODE from <function name="consult" ... ><effect> ***
            activePacientId = consultInput.get_id();
//*** END OF INLINE CODE  ***
        }

        @Override
        public void findArgsForPrecondition() throws DefinitionNotFoundException  {
//*** INLINE CODE from <inputgenerator function="consult">***
            if (pacients.isEmpty()) {
				consultInput.set_id("none");
			} else {
				Random random = new Random();
        		Set<String> keys = pacients.keySet();
        		int index = random.nextInt(keys.size());
        		consultInput.set_id((String) keys.toArray()[index]);
			};
//*** END OF INLINE CODE  ***
        }
    };
    {
        functions.add(consult);
    }


    // Processing Functions

    Function pacientList = new Function_pacientList() {

        public boolean preCondition() {
            return true;        }

        public void effect() {
//*** INLINE CODE from <function name="pacientList" ... ><effect> ***
            pacientListOutput.result = "{" + String.join(";", pacients.keySet()) + "}";
//*** END OF INLINE CODE  ***
        }

        @Override
        public void findArgsForPrecondition() throws DefinitionNotFoundException  {
//*** INLINE CODE from <inputgenerator function="pacientList">***
            ;
//*** END OF INLINE CODE  ***
        }
    };
    {
        functions.add(pacientList);
    }


    // Processing Functions

    Function addPacient = new Function_addPacient_id() {
    // use id  for access to the arguments

        public boolean preCondition() {
            return
//*** INLINE CODE from <function name="addPacient" ... ><precondition> ***
            !pacients.containsKey(addPacientInput.get_id());
//*** END OF INLINE CODE  ***
        }

        public void effect() {
//*** INLINE CODE from <function name="addPacient" ... ><effect> ***
            pacients.put(addPacientInput.get_id(), new ArrayList<PrescriptionSXM>());
				addPacientOutput.result = "{" + String.join(";", pacients.keySet()) + "}";
//*** END OF INLINE CODE  ***
        }

        @Override
        public void findArgsForPrecondition() throws DefinitionNotFoundException  {
//*** INLINE CODE from <inputgenerator function="addPacient">***
            String characters = "abcdefghijklmnopqrstuvwxyz";
			StringBuilder randomName = new StringBuilder();
			Random random = new Random();

			for (int i = 0; i < 7; i++) {
            	int randomIndex = random.nextInt(characters.length());
            	randomName.append(characters.charAt(randomIndex));
        	}

			addPacientInput.set_id(randomName.toString());
//*** END OF INLINE CODE  ***
        }
    };
    {
        functions.add(addPacient);
    }


    // Processing Functions

    Function removePacient = new Function_removePacient_id() {
    // use id  for access to the arguments

        public boolean preCondition() {
            return
//*** INLINE CODE from <function name="removePacient" ... ><precondition> ***
            pacients.containsKey(removePacientInput.get_id());
//*** END OF INLINE CODE  ***
        }

        public void effect() {
//*** INLINE CODE from <function name="removePacient" ... ><effect> ***
            pacients.remove(removePacientInput.get_id());
				removePacientOutput.result = "{" + String.join(";", pacients.keySet()) + "}";
//*** END OF INLINE CODE  ***
        }

        @Override
        public void findArgsForPrecondition() throws DefinitionNotFoundException  {
//*** INLINE CODE from <inputgenerator function="removePacient">***
            if (pacients.isEmpty()) {
				removePacientInput.set_id("none");
			} else {
				Random random = new Random();
        		Set<String> keys = pacients.keySet();
        		int index = random.nextInt(keys.size());
        		removePacientInput.set_id((String) keys.toArray()[index]);
			};
//*** END OF INLINE CODE  ***
        }
    };
    {
        functions.add(removePacient);
    }


    // Processing Functions

    Function assignPrescription = new Function_assignPrescription_prescriptionString() {
    // use prescriptionString  for access to the arguments

        public boolean preCondition() {
            return
//*** INLINE CODE from <function name="assignPrescription" ... ><precondition> ***
            isPrescriptionStringValid(assignPrescriptionInput.get_prescriptionString()) && activePacientId != null;
//*** END OF INLINE CODE  ***
        }

        public void effect() {
//*** INLINE CODE from <function name="assignPrescription" ... ><effect> ***
            pacients.get(activePacientId).add(convertToPrescription(assignPrescriptionInput.get_prescriptionString()));
//*** END OF INLINE CODE  ***
        }

        @Override
        public void findArgsForPrecondition() throws DefinitionNotFoundException  {
//*** INLINE CODE from <inputgenerator function="assignPrescription">***
            String characters = "abcdefghijklmnopqrstuvwxyz";
			StringBuilder randomName = new StringBuilder();
			Random random = new Random();

			for (int i = 0; i < 7; i++) {
            	int randomIndex = random.nextInt(characters.length());
            	randomName.append(characters.charAt(randomIndex));
        	}

			String prescriptionString = randomName.toString() + ";" + random.nextInt(100);

			assignPrescriptionInput.set_prescriptionString(prescriptionString);
//*** END OF INLINE CODE  ***
        }
    };
    {
        functions.add(assignPrescription);
    }


    // Processing Functions

    Function informations = new Function_informations() {

        public boolean preCondition() {
            return
//*** INLINE CODE from <function name="informations" ... ><precondition> ***
            activePacientId != null;
//*** END OF INLINE CODE  ***
        }

        public void effect() {
//*** INLINE CODE from <function name="informations" ... ><effect> ***
            List<PrescriptionSXM> prescriptions = pacients.get(activePacientId);
				String allPrescriptions = "";

				for (PrescriptionSXM prescription : prescriptions) {
					allPrescriptions = allPrescriptions + prescription.getContentInput().result;
				}

				informationsOutput.result = allPrescriptions;
//*** END OF INLINE CODE  ***
        }

        @Override
        public void findArgsForPrecondition() throws DefinitionNotFoundException  {
//*** INLINE CODE from <inputgenerator function="informations">***
            ;
//*** END OF INLINE CODE  ***
        }
    };
    {
        functions.add(informations);
    }


    // Processing Functions

    Function finish = new Function_finish() {

        public boolean preCondition() {
            return true;        }

        public void effect() {
//*** INLINE CODE from <function name="finish" ... ><effect> ***
            activePacientId = null;
//*** END OF INLINE CODE  ***
        }

        @Override
        public void findArgsForPrecondition() throws DefinitionNotFoundException  {
//*** INLINE CODE from <inputgenerator function="finish">***
            ;
//*** END OF INLINE CODE  ***
        }
    };
    {
        functions.add(finish);
    }
}
