package org.jsxm.program;
import jsxm.testAdapters.*;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class PrescriptionJsxmAdapterTest{

    @Test
    public void test_k2_1_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("getContentInput_Error", obj.getContentInput());
    }

    @Test
    public void test_k2_2_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("isUsedInput_Error", obj.isUsedInput());
    }

    @Test
    public void test_k2_3_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("useInput_Error", obj.useInput());
    }

    @Test
    public void test_k2_4_close_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("addItemInput_Error", obj.addItemInput("xzumfth", 7));
    }

    @Test
    public void test_k2_5_close_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_6_addItem_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{wllyeba=8}", obj.addItemInput("wllyeba", 8));
        assertEquals("getContentInput_Error", obj.getContentInput());
    }

    @Test
    public void test_k2_7_addItem_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{orbankk=5}", obj.addItemInput("orbankk", 5));
        assertEquals("isUsedInput_Error", obj.isUsedInput());
    }

    @Test
    public void test_k2_8_addItem_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{hejngrl=6}", obj.addItemInput("hejngrl", 6));
        assertEquals("useInput_Error", obj.useInput());
    }

    @Test
    public void test_k2_9_close_use_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("addItemInput_Error", obj.addItemInput("eectizo", 2));
    }

    @Test
    public void test_k2_10_close_use_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_11_close_use_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("getContentInput_Error", obj.getContentInput());
    }

    @Test
    public void test_k2_12_close_use_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("useInput_Error", obj.useInput());
    }

    @Test
    public void test_k2_13_close_getContent_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("addItemInput_Error", obj.addItemInput("rwrxcil", 4));
    }

    @Test
    public void test_k2_14_close_getContent_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_15_close_isUsed_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("addItemInput_Error", obj.addItemInput("ldcceue", 5));
    }

    @Test
    public void test_k2_16_close_isUsed_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_17_addItem_addItem_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{qhvbcsc=2}", obj.addItemInput("qhvbcsc", 2));
        assertEquals("addItemOutput_{qhvbcsc=2, cmxnmdv=3}", obj.addItemInput("cmxnmdv", 3));
        assertEquals("addItemOutput_{qhvbcsc=2, jdpwrxu=10, cmxnmdv=3}", obj.addItemInput("jdpwrxu", 10));
    }

    @Test
    public void test_k2_18_addItem_addItem_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{cvcivks=7}", obj.addItemInput("cvcivks", 7));
        assertEquals("addItemOutput_{hkbofgx=6, cvcivks=7}", obj.addItemInput("hkbofgx", 6));
        assertEquals("closeOutput", obj.closeInput());
    }

    @Test
    public void test_k2_19_addItem_addItem_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{hhfatzz=3}", obj.addItemInput("hhfatzz", 3));
        assertEquals("addItemOutput_{hhfatzz=3, edmcxjx=10}", obj.addItemInput("edmcxjx", 10));
        assertEquals("getContentInput_Error", obj.getContentInput());
    }

    @Test
    public void test_k2_20_addItem_addItem_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{qnodlcj=5}", obj.addItemInput("qnodlcj", 5));
        assertEquals("addItemOutput_{qnodlcj=5, ujpwffk=4}", obj.addItemInput("ujpwffk", 4));
        assertEquals("isUsedInput_Error", obj.isUsedInput());
    }

    @Test
    public void test_k2_21_addItem_addItem_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{fccoeye=1}", obj.addItemInput("fccoeye", 1));
        assertEquals("addItemOutput_{xyoxfan=4, fccoeye=1}", obj.addItemInput("xyoxfan", 4));
        assertEquals("useInput_Error", obj.useInput());
    }

    @Test
    public void test_k2_22_addItem_close_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{gixecks=3}", obj.addItemInput("gixecks", 3));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("addItemInput_Error", obj.addItemInput("glhprgs", 10));
    }

    @Test
    public void test_k2_23_addItem_close_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{sdpoqik=4}", obj.addItemInput("sdpoqik", 4));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_24_addItem_close_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{eocefnz=7}", obj.addItemInput("eocefnz", 7));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{eocefnz=7}", obj.getContentInput());
    }

    @Test
    public void test_k2_25_addItem_close_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{calvyhi=3}", obj.addItemInput("calvyhi", 3));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
    }

    @Test
    public void test_k2_26_addItem_close_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{pceruyy=1}", obj.addItemInput("pceruyy", 1));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
    }

    @Test
    public void test_k2_27_close_use_isUsed_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("addItemInput_Error", obj.addItemInput("bqfdfnx", 5));
    }

    @Test
    public void test_k2_28_close_use_isUsed_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_29_close_use_isUsed_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("getContentInput_Error", obj.getContentInput());
    }

    @Test
    public void test_k2_30_close_use_isUsed_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("useInput_Error", obj.useInput());
    }

    @Test
    public void test_k2_31_close_getContent_getContent_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("addItemInput_Error", obj.addItemInput("ghudcwb", 3));
    }

    @Test
    public void test_k2_32_close_getContent_getContent_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_33_close_getContent_getContent_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
    }

    @Test
    public void test_k2_34_close_getContent_getContent_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
    }

    @Test
    public void test_k2_35_close_getContent_getContent_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("useOutput_true", obj.useInput());
    }

    @Test
    public void test_k2_36_close_getContent_isUsed_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("addItemInput_Error", obj.addItemInput("gxznrmm", 3));
    }

    @Test
    public void test_k2_37_close_getContent_isUsed_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_38_close_getContent_isUsed_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
    }

    @Test
    public void test_k2_39_close_getContent_isUsed_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
    }

    @Test
    public void test_k2_40_close_getContent_isUsed_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("useOutput_true", obj.useInput());
    }

    @Test
    public void test_k2_41_close_getContent_use_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("addItemInput_Error", obj.addItemInput("xrxfbkk", 1));
    }

    @Test
    public void test_k2_42_close_getContent_use_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_43_close_getContent_use_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("getContentInput_Error", obj.getContentInput());
    }

    @Test
    public void test_k2_44_close_getContent_use_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
    }

    @Test
    public void test_k2_45_close_getContent_use_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("useInput_Error", obj.useInput());
    }

    @Test
    public void test_k2_46_close_isUsed_getContent_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("addItemInput_Error", obj.addItemInput("hsgpczz", 10));
    }

    @Test
    public void test_k2_47_close_isUsed_getContent_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_48_close_isUsed_getContent_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
    }

    @Test
    public void test_k2_49_close_isUsed_getContent_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
    }

    @Test
    public void test_k2_50_close_isUsed_getContent_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
        assertEquals("useOutput_true", obj.useInput());
    }

    @Test
    public void test_k2_51_close_isUsed_isUsed_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("addItemInput_Error", obj.addItemInput("ruggavs", 10));
    }

    @Test
    public void test_k2_52_close_isUsed_isUsed_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_53_close_isUsed_isUsed_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("getContentOutput_{}", obj.getContentInput());
    }

    @Test
    public void test_k2_54_close_isUsed_isUsed_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
    }

    @Test
    public void test_k2_55_close_isUsed_isUsed_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("useOutput_true", obj.useInput());
    }

    @Test
    public void test_k2_56_close_isUsed_use_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("addItemInput_Error", obj.addItemInput("ajcvxnw", 5));
    }

    @Test
    public void test_k2_57_close_isUsed_use_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_58_close_isUsed_use_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("getContentInput_Error", obj.getContentInput());
    }

    @Test
    public void test_k2_59_close_isUsed_use_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
    }

    @Test
    public void test_k2_60_close_isUsed_use_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("useInput_Error", obj.useInput());
    }

    @Test
    public void test_k2_61_close_use_isUsed_isUsed_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("addItemInput_Error", obj.addItemInput("uljrqxa", 6));
    }

    @Test
    public void test_k2_62_close_use_isUsed_isUsed_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_63_close_use_isUsed_isUsed_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("getContentInput_Error", obj.getContentInput());
    }

    @Test
    public void test_k2_64_close_use_isUsed_isUsed_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
    }

    @Test
    public void test_k2_65_close_use_isUsed_isUsed_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("useInput_Error", obj.useInput());
    }

//
// Helper methods for definitions...
//


}
// End of generated Test Case

