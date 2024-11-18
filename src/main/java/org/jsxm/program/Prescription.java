package org.jsxm.program;

import java.util.HashMap;
import java.util.*;

public class Prescription {
    HashMap<String, Integer> cart = new HashMap<String, Integer>();
    private boolean internalIsUsed = false;
    private boolean isClosed = false;

    public String addItem(String name, int quantity) {
        if (isClosed == false) {
            cart.put(name, quantity);
            return cart.toString();
        } else {
            throw new RuntimeException();
        }
    }

    public void close() {
        if (isClosed == false) {
            isClosed = true;
        } else {
            throw new RuntimeException();
        }
    }

    public String getContent() {
        if (isClosed == true && internalIsUsed == false) {
            return cart.toString();
        } else {
            throw new RuntimeException();
        }
    }

    public boolean isUsed() {
        if (isClosed == true) {
            return internalIsUsed;
        } else {
            throw new RuntimeException();
        }
    }

    public boolean use() {
        if (isClosed == true && internalIsUsed == false) {
            internalIsUsed = true;
            return internalIsUsed;
        } else {
            throw new RuntimeException();
        }
    }
}
