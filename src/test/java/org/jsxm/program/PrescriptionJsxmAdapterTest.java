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
        assertEquals("addItemInput_Error", obj.addItemInput("nshngck", 5));
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
        assertEquals("addItemOutput_{pgtuore=6}", obj.addItemInput("pgtuore", 6));
        assertEquals("getContentInput_Error", obj.getContentInput());
    }

    @Test
    public void test_k2_7_addItem_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{imglldi=7}", obj.addItemInput("imglldi", 7));
        assertEquals("isUsedInput_Error", obj.isUsedInput());
    }

    @Test
    public void test_k2_8_addItem_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{sbaackz=8}", obj.addItemInput("sbaackz", 8));
        assertEquals("useInput_Error", obj.useInput());
    }

    @Test
    public void test_k2_9_close_use_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("addItemInput_Error", obj.addItemInput("cmbxpno", 10));
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
        assertEquals("addItemInput_Error", obj.addItemInput("joncspl", 6));
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
        assertEquals("addItemInput_Error", obj.addItemInput("oqiohwo", 3));
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
        assertEquals("addItemOutput_{exdgavk=10}", obj.addItemInput("exdgavk", 10));
        assertEquals("addItemOutput_{exdgavk=10, akpqrgo=8}", obj.addItemInput("akpqrgo", 8));
        assertEquals("addItemOutput_{edxbjlp=9, exdgavk=10, akpqrgo=8}", obj.addItemInput("edxbjlp", 9));
    }

    @Test
    public void test_k2_18_addItem_addItem_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{nrgjbvu=4}", obj.addItemInput("nrgjbvu", 4));
        assertEquals("addItemOutput_{ikwhzlj=5, nrgjbvu=4}", obj.addItemInput("ikwhzlj", 5));
        assertEquals("closeOutput", obj.closeInput());
    }

    @Test
    public void test_k2_19_addItem_addItem_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{cilrsgn=7}", obj.addItemInput("cilrsgn", 7));
        assertEquals("addItemOutput_{cilrsgn=7, umsolbb=10}", obj.addItemInput("umsolbb", 10));
        assertEquals("getContentInput_Error", obj.getContentInput());
    }

    @Test
    public void test_k2_20_addItem_addItem_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{jrohncm=8}", obj.addItemInput("jrohncm", 8));
        assertEquals("addItemOutput_{fjzuabq=5, jrohncm=8}", obj.addItemInput("fjzuabq", 5));
        assertEquals("isUsedInput_Error", obj.isUsedInput());
    }

    @Test
    public void test_k2_21_addItem_addItem_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{fbvutrl=7}", obj.addItemInput("fbvutrl", 7));
        assertEquals("addItemOutput_{nttzekx=4, fbvutrl=7}", obj.addItemInput("nttzekx", 4));
        assertEquals("useInput_Error", obj.useInput());
    }

    @Test
    public void test_k2_22_addItem_close_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{opetfhe=10}", obj.addItemInput("opetfhe", 10));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("addItemInput_Error", obj.addItemInput("auodptu", 5));
    }

    @Test
    public void test_k2_23_addItem_close_close() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{ebxpavg=9}", obj.addItemInput("ebxpavg", 9));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("closeInput_Error", obj.closeInput());
    }

    @Test
    public void test_k2_24_addItem_close_getContent() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{ivlehlc=9}", obj.addItemInput("ivlehlc", 9));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("getContentOutput_{ivlehlc=9}", obj.getContentInput());
    }

    @Test
    public void test_k2_25_addItem_close_isUsed() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{ugknscq=10}", obj.addItemInput("ugknscq", 10));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("isUsedOutput_false", obj.isUsedInput());
    }

    @Test
    public void test_k2_26_addItem_close_use() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("addItemOutput_{faqcbwm=10}", obj.addItemInput("faqcbwm", 10));
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
    }

    @Test
    public void test_k2_27_close_use_isUsed_addItem() {
        PrescriptionAdapter obj = new PrescriptionAdapter();
        assertEquals("closeOutput", obj.closeInput());
        assertEquals("useOutput_true", obj.useInput());
        assertEquals("isUsedOutput_true", obj.isUsedInput());
        assertEquals("addItemInput_Error", obj.addItemInput("ynfnkek", 9));
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
        assertEquals("addItemInput_Error", obj.addItemInput("twvzvyq", 10));
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
        assertEquals("addItemInput_Error", obj.addItemInput("szgtida", 9));
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
        assertEquals("addItemInput_Error", obj.addItemInput("ctuqopl", 7));
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
        assertEquals("addItemInput_Error", obj.addItemInput("lddupwl", 7));
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
        assertEquals("addItemInput_Error", obj.addItemInput("oqfbeja", 3));
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
        assertEquals("addItemInput_Error", obj.addItemInput("szyvdyr", 2));
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
        assertEquals("addItemInput_Error", obj.addItemInput("ambdjcw", 7));
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

