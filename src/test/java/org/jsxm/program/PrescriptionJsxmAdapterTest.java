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
        assertEquals("addItemInput_Error", obj.addItemInput("tcyfrkn", 3));
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
        assertEquals("addItemOutput_{koccubl=6}", obj.addItemInput("koccubl", 6));
        assertEquals("getContentInput_Error", obj.getContentInput());
    }

    @Test
    public void test_k2_7_addItem_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{lsmdwpr=7}", obj.addItemInput("lsmdwpr", 7));
        assertEquals("isUsedInput_Error", obj.isUsedInput());
    }

    @Test
    public void test_k2_8_addItem_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{jwyzqrh=4}", obj.addItemInput("jwyzqrh", 4));
        assertEquals("useInput_Error", obj.useInput());
    }

    @Test
    public void test_k2_9_close_use_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("addItemInput_Error", obj.addItemInput("lpzcmyy", 4));
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
        assertEquals("addItemInput_Error", obj.addItemInput("jufeurh", 7));
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
        assertEquals("addItemInput_Error", obj.addItemInput("wxyywsu", 4));
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
        assertEquals("addItemOutput_{kafwojs=8}", obj.addItemInput("kafwojs", 8));
        assertEquals("addItemOutput_{kafwojs=8, njzhjkz=5}", obj.addItemInput("njzhjkz", 5));
        assertEquals("addItemOutput_{kafwojs=8, njzhjkz=5, utyiums=7}", obj.addItemInput("utyiums", 7));
    }

    @Test
    public void test_k2_18_addItem_addItem_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{mpnqqxz=10}", obj.addItemInput("mpnqqxz", 10));
        assertEquals("addItemOutput_{kpgqtsg=1, mpnqqxz=10}", obj.addItemInput("kpgqtsg", 1));
        assertEquals("closeOutput", obj.closeInput());
    }

    @Test
    public void test_k2_19_addItem_addItem_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{ekljhhg=9}", obj.addItemInput("ekljhhg", 9));
        assertEquals("addItemOutput_{ekljhhg=9, syxmckm=7}", obj.addItemInput("syxmckm", 7));
        assertEquals("getContentInput_Error", obj.getContentInput());
    }

    @Test
    public void test_k2_20_addItem_addItem_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{veslxqd=8}", obj.addItemInput("veslxqd", 8));
        assertEquals("addItemOutput_{veslxqd=8, ibhxrjw=3}", obj.addItemInput("ibhxrjw", 3));
        assertEquals("isUsedInput_Error", obj.isUsedInput());
    }

    @Test
    public void test_k2_21_addItem_addItem_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{vxkacit=9}", obj.addItemInput("vxkacit", 9));
        assertEquals("addItemOutput_{vxkacit=9, sjkqjil=4}", obj.addItemInput("sjkqjil", 4));
        assertEquals("useInput_Error", obj.useInput());
    }

    @Test
    public void test_k2_22_addItem_close_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{eslqevl=7}", obj.addItemInput("eslqevl", 7));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("addItemInput_Error", obj.addItemInput("bjooics", 4));
    }

    @Test
    public void test_k2_23_addItem_close_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{nukywkw=7}", obj.addItemInput("nukywkw", 7));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_24_addItem_close_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{gkqfgfi=5}", obj.addItemInput("gkqfgfi", 5));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{gkqfgfi=5}", obj.getContentInput());
    }

    @Test
    public void test_k2_25_addItem_close_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{kqcrdta=4}", obj.addItemInput("kqcrdta", 4));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
    }

    @Test
    public void test_k2_26_addItem_close_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{kmibcvh=7}", obj.addItemInput("kmibcvh", 7));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
    }

    @Test
    public void test_k2_27_close_use_isUsed_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("addItemInput_Error", obj.addItemInput("wovtnwu", 1));
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
        assertEquals("addItemInput_Error", obj.addItemInput("kldjpuj", 8));
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
        assertEquals("addItemInput_Error", obj.addItemInput("cnaodlf", 1));
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
        assertEquals("addItemInput_Error", obj.addItemInput("fwfnasx", 6));
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
        assertEquals("addItemInput_Error", obj.addItemInput("itdltns", 9));
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
        assertEquals("addItemInput_Error", obj.addItemInput("sfkgood", 3));
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
        assertEquals("addItemInput_Error", obj.addItemInput("dxqmxgo", 7));
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
        assertEquals("addItemInput_Error", obj.addItemInput("ivlrvyx", 7));
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

