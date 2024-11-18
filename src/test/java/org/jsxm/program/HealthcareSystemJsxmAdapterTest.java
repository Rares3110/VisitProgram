package org.jsxm.program;
import jsxm.testAdapters.*;
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class HealthcareSystemJsxmAdapterTest{

    @Test
    public void test_k2_1_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("addPacientInput_Error", obj.addPacientInput("ickpdhb"));
    }

    @Test
    public void test_k2_2_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("finishInput_Error", obj.finishInput());
    }

    @Test
    public void test_k2_3_pacientList_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_4_pacientList_addPacient_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{vsjxjhl}", obj.addPacientInput("vsjxjhl"));
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_5_pacientList_finish_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_6_pacientList_finish_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("addPacientInput_Error", obj.addPacientInput("bbvgevc"));
    }

    @Test
    public void test_k2_7_pacientList_finish_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("finishInput_Error", obj.finishInput());
    }

    @Test
    public void test_k2_8_pacientList_addPacient_consult_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{vsgkddc}", obj.addPacientInput("vsgkddc"));
        assertEquals("consultOutput", obj.consultInput("vsgkddc"));
        assertEquals("consultInput_Error", obj.consultInput("vsgkddc"));
    }

    @Test
    public void test_k2_9_pacientList_addPacient_consult_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{yeztdkk}", obj.addPacientInput("yeztdkk"));
        assertEquals("consultOutput", obj.consultInput("yeztdkk"));
        assertEquals("addPacientInput_Error", obj.addPacientInput("qslsoxf"));
    }

    @Test
    public void test_k2_10_pacientList_addPacient_consult_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{wriussm}", obj.addPacientInput("wriussm"));
        assertEquals("consultOutput", obj.consultInput("wriussm"));
        assertEquals("removePacientInput_Error", obj.removePacientInput("wriussm"));
    }

    @Test
    public void test_k2_11_pacientList_addPacient_addPacient_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{asjxxff}", obj.addPacientInput("asjxxff"));
        assertEquals("addPacientOutput_{xbcglte;asjxxff}", obj.addPacientInput("xbcglte"));
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_12_pacientList_addPacient_removePacient_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{mcdkmfy}", obj.addPacientInput("mcdkmfy"));
        assertEquals("removePacientOutput_{}", obj.removePacientInput("mcdkmfy"));
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_13_pacientList_addPacient_finish_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{sfuvyrn}", obj.addPacientInput("sfuvyrn"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("consultInput_Error", obj.consultInput("sfuvyrn"));
    }

    @Test
    public void test_k2_14_pacientList_addPacient_finish_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{mgiizhj}", obj.addPacientInput("mgiizhj"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_15_pacientList_addPacient_finish_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{tygxghn}", obj.addPacientInput("tygxghn"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("addPacientInput_Error", obj.addPacientInput("hrihqud"));
    }

    @Test
    public void test_k2_16_pacientList_addPacient_finish_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{cdxnntj}", obj.addPacientInput("cdxnntj"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("removePacientInput_Error", obj.removePacientInput("cdxnntj"));
    }

    @Test
    public void test_k2_17_pacientList_addPacient_finish_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{wwonbla}", obj.addPacientInput("wwonbla"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("finishInput_Error", obj.finishInput());
    }

    @Test
    public void test_k2_18_pacientList_addPacient_consult_pacientList_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{gcofvum}", obj.addPacientInput("gcofvum"));
        assertEquals("consultOutput", obj.consultInput("gcofvum"));
        assertEquals("pacientListOutput_{gcofvum}", obj.pacientListInput());
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_19_pacientList_addPacient_consult_pacientList_assignPrescription() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{yeuwxgf}", obj.addPacientInput("yeuwxgf"));
        assertEquals("consultOutput", obj.consultInput("yeuwxgf"));
        assertEquals("pacientListOutput_{yeuwxgf}", obj.pacientListInput());
        assertEquals("assignPrescriptionInput_Error", obj.assignPrescriptionInput("ztmryrg;31"));
    }

    @Test
    public void test_k2_20_pacientList_addPacient_consult_pacientList_informations() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{dvajndo}", obj.addPacientInput("dvajndo"));
        assertEquals("consultOutput", obj.consultInput("dvajndo"));
        assertEquals("pacientListOutput_{dvajndo}", obj.pacientListInput());
        assertEquals("informationsInput_Error", obj.informationsInput());
    }

    @Test
    public void test_k2_21_pacientList_addPacient_consult_assignPrescription_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{tlxndfs}", obj.addPacientInput("tlxndfs"));
        assertEquals("consultOutput", obj.consultInput("tlxndfs"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("xqufxst;9"));
        assertEquals("consultInput_Error", obj.consultInput("tlxndfs"));
    }

    @Test
    public void test_k2_22_pacientList_addPacient_consult_assignPrescription_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{wwzsykq}", obj.addPacientInput("wwzsykq"));
        assertEquals("consultOutput", obj.consultInput("wwzsykq"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("xwzshwi;6"));
        assertEquals("addPacientInput_Error", obj.addPacientInput("wxnwxeo"));
    }

    @Test
    public void test_k2_23_pacientList_addPacient_consult_assignPrescription_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{tmnskzq}", obj.addPacientInput("tmnskzq"));
        assertEquals("consultOutput", obj.consultInput("tmnskzq"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("cdkbneb;21"));
        assertEquals("removePacientInput_Error", obj.removePacientInput("tmnskzq"));
    }

    @Test
    public void test_k2_24_pacientList_addPacient_consult_informations_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{drzwwtd}", obj.addPacientInput("drzwwtd"));
        assertEquals("consultOutput", obj.consultInput("drzwwtd"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("consultInput_Error", obj.consultInput("drzwwtd"));
    }

    @Test
    public void test_k2_25_pacientList_addPacient_consult_informations_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{ldyeava}", obj.addPacientInput("ldyeava"));
        assertEquals("consultOutput", obj.consultInput("ldyeava"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("addPacientInput_Error", obj.addPacientInput("ybhvbyv"));
    }

    @Test
    public void test_k2_26_pacientList_addPacient_consult_informations_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{lcyndsw}", obj.addPacientInput("lcyndsw"));
        assertEquals("consultOutput", obj.consultInput("lcyndsw"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("removePacientInput_Error", obj.removePacientInput("lcyndsw"));
    }

    @Test
    public void test_k2_27_pacientList_addPacient_consult_finish_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{xzpvvgo}", obj.addPacientInput("xzpvvgo"));
        assertEquals("consultOutput", obj.consultInput("xzpvvgo"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("consultInput_Error", obj.consultInput("xzpvvgo"));
    }

    @Test
    public void test_k2_28_pacientList_addPacient_consult_finish_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{wwhcntu}", obj.addPacientInput("wwhcntu"));
        assertEquals("consultOutput", obj.consultInput("wwhcntu"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_29_pacientList_addPacient_consult_finish_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{dezbuxr}", obj.addPacientInput("dezbuxr"));
        assertEquals("consultOutput", obj.consultInput("dezbuxr"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("addPacientInput_Error", obj.addPacientInput("ccoggmx"));
    }

    @Test
    public void test_k2_30_pacientList_addPacient_consult_finish_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{apujeyo}", obj.addPacientInput("apujeyo"));
        assertEquals("consultOutput", obj.consultInput("apujeyo"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("removePacientInput_Error", obj.removePacientInput("apujeyo"));
    }

    @Test
    public void test_k2_31_pacientList_addPacient_consult_finish_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{unjarys}", obj.addPacientInput("unjarys"));
        assertEquals("consultOutput", obj.consultInput("unjarys"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("finishInput_Error", obj.finishInput());
    }

    @Test
    public void test_k2_32_pacientList_addPacient_addPacient_consult_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{xhzrjpl}", obj.addPacientInput("xhzrjpl"));
        assertEquals("addPacientOutput_{wsahrrp;xhzrjpl}", obj.addPacientInput("wsahrrp"));
        assertEquals("consultOutput", obj.consultInput("xhzrjpl"));
        assertEquals("consultInput_Error", obj.consultInput("xhzrjpl"));
    }

    @Test
    public void test_k2_33_pacientList_addPacient_addPacient_consult_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{pacpxxw}", obj.addPacientInput("pacpxxw"));
        assertEquals("addPacientOutput_{pjshhaj;pacpxxw}", obj.addPacientInput("pjshhaj"));
        assertEquals("consultOutput", obj.consultInput("pacpxxw"));
        assertEquals("pacientListOutput_{pjshhaj;pacpxxw}", obj.pacientListInput());
    }

    @Test
    public void test_k2_34_pacientList_addPacient_addPacient_consult_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{pwmwwrt}", obj.addPacientInput("pwmwwrt"));
        assertEquals("addPacientOutput_{swkiyrn;pwmwwrt}", obj.addPacientInput("swkiyrn"));
        assertEquals("consultOutput", obj.consultInput("pwmwwrt"));
        assertEquals("addPacientInput_Error", obj.addPacientInput("xccflbh"));
    }

    @Test
    public void test_k2_35_pacientList_addPacient_addPacient_consult_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{yjwotks}", obj.addPacientInput("yjwotks"));
        assertEquals("addPacientOutput_{yjwotks;vsvyotm}", obj.addPacientInput("vsvyotm"));
        assertEquals("consultOutput", obj.consultInput("yjwotks"));
        assertEquals("removePacientInput_Error", obj.removePacientInput("vsvyotm"));
    }

    @Test
    public void test_k2_36_pacientList_addPacient_addPacient_consult_assignPrescription() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{vweajwd}", obj.addPacientInput("vweajwd"));
        assertEquals("addPacientOutput_{vweajwd;yamitgg}", obj.addPacientInput("yamitgg"));
        assertEquals("consultOutput", obj.consultInput("vweajwd"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("idubiiq;31"));
    }

    @Test
    public void test_k2_37_pacientList_addPacient_addPacient_consult_informations() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{ttpqiud}", obj.addPacientInput("ttpqiud"));
        assertEquals("addPacientOutput_{ttpqiud;oasfmpx}", obj.addPacientInput("oasfmpx"));
        assertEquals("consultOutput", obj.consultInput("oasfmpx"));
        assertEquals("informationsOutput_", obj.informationsInput());
    }

    @Test
    public void test_k2_38_pacientList_addPacient_addPacient_consult_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{nitzjyu}", obj.addPacientInput("nitzjyu"));
        assertEquals("addPacientOutput_{nitzjyu;wlozmfk}", obj.addPacientInput("wlozmfk"));
        assertEquals("consultOutput", obj.consultInput("nitzjyu"));
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_39_pacientList_addPacient_addPacient_addPacient_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{qtkkskt}", obj.addPacientInput("qtkkskt"));
        assertEquals("addPacientOutput_{qtkkskt;uwagyyu}", obj.addPacientInput("uwagyyu"));
        assertEquals("addPacientOutput_{qtkkskt;mqtkyzf;uwagyyu}", obj.addPacientInput("mqtkyzf"));
        assertEquals("consultOutput", obj.consultInput("uwagyyu"));
    }

    @Test
    public void test_k2_40_pacientList_addPacient_addPacient_addPacient_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{kdphkmf}", obj.addPacientInput("kdphkmf"));
        assertEquals("addPacientOutput_{yulhewi;kdphkmf}", obj.addPacientInput("yulhewi"));
        assertEquals("addPacientOutput_{yulhewi;kdphkmf;kajrmpf}", obj.addPacientInput("kajrmpf"));
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_41_pacientList_addPacient_addPacient_addPacient_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{egpflcd}", obj.addPacientInput("egpflcd"));
        assertEquals("addPacientOutput_{euwwegc;egpflcd}", obj.addPacientInput("euwwegc"));
        assertEquals("addPacientOutput_{euwwegc;egpflcd;lcndxqj}", obj.addPacientInput("lcndxqj"));
        assertEquals("addPacientOutput_{euwwegc;egpflcd;lcndxqj;vpygzrm}", obj.addPacientInput("vpygzrm"));
    }

    @Test
    public void test_k2_42_pacientList_addPacient_addPacient_addPacient_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{sudxays}", obj.addPacientInput("sudxays"));
        assertEquals("addPacientOutput_{loxdgix;sudxays}", obj.addPacientInput("loxdgix"));
        assertEquals("addPacientOutput_{loxdgix;cleqwgb;sudxays}", obj.addPacientInput("cleqwgb"));
        assertEquals("removePacientOutput_{loxdgix;cleqwgb}", obj.removePacientInput("sudxays"));
    }

    @Test
    public void test_k2_43_pacientList_addPacient_addPacient_addPacient_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{wiybvvo}", obj.addPacientInput("wiybvvo"));
        assertEquals("addPacientOutput_{wiybvvo;lsrqxhz}", obj.addPacientInput("lsrqxhz"));
        assertEquals("addPacientOutput_{lduysln;wiybvvo;lsrqxhz}", obj.addPacientInput("lduysln"));
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_44_pacientList_addPacient_addPacient_removePacient_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{erpypff}", obj.addPacientInput("erpypff"));
        assertEquals("addPacientOutput_{venplax;erpypff}", obj.addPacientInput("venplax"));
        assertEquals("removePacientOutput_{venplax}", obj.removePacientInput("erpypff"));
        assertEquals("consultOutput", obj.consultInput("venplax"));
    }

    @Test
    public void test_k2_45_pacientList_addPacient_addPacient_removePacient_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{cmibwgk}", obj.addPacientInput("cmibwgk"));
        assertEquals("addPacientOutput_{cmibwgk;oqfrzsw}", obj.addPacientInput("oqfrzsw"));
        assertEquals("removePacientOutput_{cmibwgk}", obj.removePacientInput("oqfrzsw"));
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_46_pacientList_addPacient_addPacient_removePacient_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{dgdegut}", obj.addPacientInput("dgdegut"));
        assertEquals("addPacientOutput_{dgdegut;aljiskj}", obj.addPacientInput("aljiskj"));
        assertEquals("removePacientOutput_{aljiskj}", obj.removePacientInput("dgdegut"));
        assertEquals("addPacientOutput_{zmlgzrc;aljiskj}", obj.addPacientInput("zmlgzrc"));
    }

    @Test
    public void test_k2_47_pacientList_addPacient_addPacient_removePacient_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{vhswwwc}", obj.addPacientInput("vhswwwc"));
        assertEquals("addPacientOutput_{pzlnncl;vhswwwc}", obj.addPacientInput("pzlnncl"));
        assertEquals("removePacientOutput_{vhswwwc}", obj.removePacientInput("pzlnncl"));
        assertEquals("removePacientOutput_{}", obj.removePacientInput("vhswwwc"));
    }

    @Test
    public void test_k2_48_pacientList_addPacient_addPacient_removePacient_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{zzzpnsr}", obj.addPacientInput("zzzpnsr"));
        assertEquals("addPacientOutput_{zzzpnsr;btfubol}", obj.addPacientInput("btfubol"));
        assertEquals("removePacientOutput_{btfubol}", obj.removePacientInput("zzzpnsr"));
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_49_pacientList_addPacient_addPacient_finish_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{ndnnpyh}", obj.addPacientInput("ndnnpyh"));
        assertEquals("addPacientOutput_{qrevpet;ndnnpyh}", obj.addPacientInput("qrevpet"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("consultInput_Error", obj.consultInput("qrevpet"));
    }

    @Test
    public void test_k2_50_pacientList_addPacient_addPacient_finish_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{lwcgjez}", obj.addPacientInput("lwcgjez"));
        assertEquals("addPacientOutput_{urrrkvt;lwcgjez}", obj.addPacientInput("urrrkvt"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_51_pacientList_addPacient_addPacient_finish_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{kilyjhl}", obj.addPacientInput("kilyjhl"));
        assertEquals("addPacientOutput_{kilyjhl;xsfeogc}", obj.addPacientInput("xsfeogc"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("addPacientInput_Error", obj.addPacientInput("qywwbda"));
    }

    @Test
    public void test_k2_52_pacientList_addPacient_addPacient_finish_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{hyovvxf}", obj.addPacientInput("hyovvxf"));
        assertEquals("addPacientOutput_{hyovvxf;umlvoqb}", obj.addPacientInput("umlvoqb"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("removePacientInput_Error", obj.removePacientInput("hyovvxf"));
    }

    @Test
    public void test_k2_53_pacientList_addPacient_addPacient_finish_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{rqthwof}", obj.addPacientInput("rqthwof"));
        assertEquals("addPacientOutput_{txqithp;rqthwof}", obj.addPacientInput("txqithp"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("finishInput_Error", obj.finishInput());
    }

    @Test
    public void test_k2_54_pacientList_addPacient_removePacient_addPacient_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{lzfeumt}", obj.addPacientInput("lzfeumt"));
        assertEquals("removePacientOutput_{}", obj.removePacientInput("lzfeumt"));
        assertEquals("addPacientOutput_{ifwdyet}", obj.addPacientInput("ifwdyet"));
        assertEquals("consultOutput", obj.consultInput("ifwdyet"));
    }

    @Test
    public void test_k2_55_pacientList_addPacient_removePacient_addPacient_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{ggqtbvs}", obj.addPacientInput("ggqtbvs"));
        assertEquals("removePacientOutput_{}", obj.removePacientInput("ggqtbvs"));
        assertEquals("addPacientOutput_{cfoknqz}", obj.addPacientInput("cfoknqz"));
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_56_pacientList_addPacient_removePacient_addPacient_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{qitgaeq}", obj.addPacientInput("qitgaeq"));
        assertEquals("removePacientOutput_{}", obj.removePacientInput("qitgaeq"));
        assertEquals("addPacientOutput_{rexbjum}", obj.addPacientInput("rexbjum"));
        assertEquals("addPacientOutput_{rexbjum;qxhzqnz}", obj.addPacientInput("qxhzqnz"));
    }

    @Test
    public void test_k2_57_pacientList_addPacient_removePacient_addPacient_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{bxtkqky}", obj.addPacientInput("bxtkqky"));
        assertEquals("removePacientOutput_{}", obj.removePacientInput("bxtkqky"));
        assertEquals("addPacientOutput_{svcyhri}", obj.addPacientInput("svcyhri"));
        assertEquals("removePacientOutput_{}", obj.removePacientInput("svcyhri"));
    }

    @Test
    public void test_k2_58_pacientList_addPacient_removePacient_addPacient_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{xotmzvk}", obj.addPacientInput("xotmzvk"));
        assertEquals("removePacientOutput_{}", obj.removePacientInput("xotmzvk"));
        assertEquals("addPacientOutput_{qelgrge}", obj.addPacientInput("qelgrge"));
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_59_pacientList_addPacient_removePacient_finish_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{dqvfpss}", obj.addPacientInput("dqvfpss"));
        assertEquals("removePacientOutput_{}", obj.removePacientInput("dqvfpss"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_60_pacientList_addPacient_removePacient_finish_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{grbusxd}", obj.addPacientInput("grbusxd"));
        assertEquals("removePacientOutput_{}", obj.removePacientInput("grbusxd"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("addPacientInput_Error", obj.addPacientInput("dcsmlwi"));
    }

    @Test
    public void test_k2_61_pacientList_addPacient_removePacient_finish_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{byftxia}", obj.addPacientInput("byftxia"));
        assertEquals("removePacientOutput_{}", obj.removePacientInput("byftxia"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("finishInput_Error", obj.finishInput());
    }

    @Test
    public void test_k2_62_pacientList_addPacient_consult_pacientList_consult_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{mlgcqbk}", obj.addPacientInput("mlgcqbk"));
        assertEquals("consultOutput", obj.consultInput("mlgcqbk"));
        assertEquals("pacientListOutput_{mlgcqbk}", obj.pacientListInput());
        assertEquals("consultOutput", obj.consultInput("mlgcqbk"));
        assertEquals("consultInput_Error", obj.consultInput("mlgcqbk"));
    }

    @Test
    public void test_k2_63_pacientList_addPacient_consult_pacientList_consult_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{wceqqos}", obj.addPacientInput("wceqqos"));
        assertEquals("consultOutput", obj.consultInput("wceqqos"));
        assertEquals("pacientListOutput_{wceqqos}", obj.pacientListInput());
        assertEquals("consultOutput", obj.consultInput("wceqqos"));
        assertEquals("pacientListOutput_{wceqqos}", obj.pacientListInput());
    }

    @Test
    public void test_k2_64_pacientList_addPacient_consult_pacientList_consult_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{fgtgqdx}", obj.addPacientInput("fgtgqdx"));
        assertEquals("consultOutput", obj.consultInput("fgtgqdx"));
        assertEquals("pacientListOutput_{fgtgqdx}", obj.pacientListInput());
        assertEquals("consultOutput", obj.consultInput("fgtgqdx"));
        assertEquals("addPacientInput_Error", obj.addPacientInput("xxmhtzl"));
    }

    @Test
    public void test_k2_65_pacientList_addPacient_consult_pacientList_consult_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{llxsokq}", obj.addPacientInput("llxsokq"));
        assertEquals("consultOutput", obj.consultInput("llxsokq"));
        assertEquals("pacientListOutput_{llxsokq}", obj.pacientListInput());
        assertEquals("consultOutput", obj.consultInput("llxsokq"));
        assertEquals("removePacientInput_Error", obj.removePacientInput("llxsokq"));
    }

    @Test
    public void test_k2_66_pacientList_addPacient_consult_pacientList_consult_assignPrescription() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{rdhymmn}", obj.addPacientInput("rdhymmn"));
        assertEquals("consultOutput", obj.consultInput("rdhymmn"));
        assertEquals("pacientListOutput_{rdhymmn}", obj.pacientListInput());
        assertEquals("consultOutput", obj.consultInput("rdhymmn"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("suvkjmg;22"));
    }

    @Test
    public void test_k2_67_pacientList_addPacient_consult_pacientList_consult_informations() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{wewjwyb}", obj.addPacientInput("wewjwyb"));
        assertEquals("consultOutput", obj.consultInput("wewjwyb"));
        assertEquals("pacientListOutput_{wewjwyb}", obj.pacientListInput());
        assertEquals("consultOutput", obj.consultInput("wewjwyb"));
        assertEquals("informationsOutput_", obj.informationsInput());
    }

    @Test
    public void test_k2_68_pacientList_addPacient_consult_pacientList_consult_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{cqmqizi}", obj.addPacientInput("cqmqizi"));
        assertEquals("consultOutput", obj.consultInput("cqmqizi"));
        assertEquals("pacientListOutput_{cqmqizi}", obj.pacientListInput());
        assertEquals("consultOutput", obj.consultInput("cqmqizi"));
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_69_pacientList_addPacient_consult_pacientList_addPacient_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{kkmyaki}", obj.addPacientInput("kkmyaki"));
        assertEquals("consultOutput", obj.consultInput("kkmyaki"));
        assertEquals("pacientListOutput_{kkmyaki}", obj.pacientListInput());
        assertEquals("addPacientOutput_{iiytooj;kkmyaki}", obj.addPacientInput("iiytooj"));
        assertEquals("consultOutput", obj.consultInput("kkmyaki"));
    }

    @Test
    public void test_k2_70_pacientList_addPacient_consult_pacientList_addPacient_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{idemfhe}", obj.addPacientInput("idemfhe"));
        assertEquals("consultOutput", obj.consultInput("idemfhe"));
        assertEquals("pacientListOutput_{idemfhe}", obj.pacientListInput());
        assertEquals("addPacientOutput_{xhcwtkz;idemfhe}", obj.addPacientInput("xhcwtkz"));
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_71_pacientList_addPacient_consult_pacientList_addPacient_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{olbggvk}", obj.addPacientInput("olbggvk"));
        assertEquals("consultOutput", obj.consultInput("olbggvk"));
        assertEquals("pacientListOutput_{olbggvk}", obj.pacientListInput());
        assertEquals("addPacientOutput_{toepqvk;olbggvk}", obj.addPacientInput("toepqvk"));
        assertEquals("addPacientOutput_{toepqvk;fokjega;olbggvk}", obj.addPacientInput("fokjega"));
    }

    @Test
    public void test_k2_72_pacientList_addPacient_consult_pacientList_addPacient_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{fmmmgqx}", obj.addPacientInput("fmmmgqx"));
        assertEquals("consultOutput", obj.consultInput("fmmmgqx"));
        assertEquals("pacientListOutput_{fmmmgqx}", obj.pacientListInput());
        assertEquals("addPacientOutput_{sedcqyz;fmmmgqx}", obj.addPacientInput("sedcqyz"));
        assertEquals("removePacientOutput_{fmmmgqx}", obj.removePacientInput("sedcqyz"));
    }

    @Test
    public void test_k2_73_pacientList_addPacient_consult_pacientList_addPacient_assignPrescription() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{rtloukd}", obj.addPacientInput("rtloukd"));
        assertEquals("consultOutput", obj.consultInput("rtloukd"));
        assertEquals("pacientListOutput_{rtloukd}", obj.pacientListInput());
        assertEquals("addPacientOutput_{rtloukd;mjttolg}", obj.addPacientInput("mjttolg"));
        assertEquals("assignPrescriptionInput_Error", obj.assignPrescriptionInput("gvgbclt;3"));
    }

    @Test
    public void test_k2_74_pacientList_addPacient_consult_pacientList_addPacient_informations() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{tukphtf}", obj.addPacientInput("tukphtf"));
        assertEquals("consultOutput", obj.consultInput("tukphtf"));
        assertEquals("pacientListOutput_{tukphtf}", obj.pacientListInput());
        assertEquals("addPacientOutput_{eeaocbj;tukphtf}", obj.addPacientInput("eeaocbj"));
        assertEquals("informationsInput_Error", obj.informationsInput());
    }

    @Test
    public void test_k2_75_pacientList_addPacient_consult_pacientList_addPacient_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{igjqjlk}", obj.addPacientInput("igjqjlk"));
        assertEquals("consultOutput", obj.consultInput("igjqjlk"));
        assertEquals("pacientListOutput_{igjqjlk}", obj.pacientListInput());
        assertEquals("addPacientOutput_{igjqjlk;ryscbob}", obj.addPacientInput("ryscbob"));
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_76_pacientList_addPacient_consult_pacientList_removePacient_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{thcctkf}", obj.addPacientInput("thcctkf"));
        assertEquals("consultOutput", obj.consultInput("thcctkf"));
        assertEquals("pacientListOutput_{thcctkf}", obj.pacientListInput());
        assertEquals("removePacientOutput_{}", obj.removePacientInput("thcctkf"));
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_77_pacientList_addPacient_consult_pacientList_removePacient_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{pgzicgw}", obj.addPacientInput("pgzicgw"));
        assertEquals("consultOutput", obj.consultInput("pgzicgw"));
        assertEquals("pacientListOutput_{pgzicgw}", obj.pacientListInput());
        assertEquals("removePacientOutput_{}", obj.removePacientInput("pgzicgw"));
        assertEquals("addPacientOutput_{lfstnmh}", obj.addPacientInput("lfstnmh"));
    }

    @Test
    public void test_k2_78_pacientList_addPacient_consult_pacientList_removePacient_assignPrescription() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{pjmbabe}", obj.addPacientInput("pjmbabe"));
        assertEquals("consultOutput", obj.consultInput("pjmbabe"));
        assertEquals("pacientListOutput_{pjmbabe}", obj.pacientListInput());
        assertEquals("removePacientOutput_{}", obj.removePacientInput("pjmbabe"));
        assertEquals("assignPrescriptionInput_Error", obj.assignPrescriptionInput("nnmlnvq;1"));
    }

    @Test
    public void test_k2_79_pacientList_addPacient_consult_pacientList_removePacient_informations() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{tmeqhhc}", obj.addPacientInput("tmeqhhc"));
        assertEquals("consultOutput", obj.consultInput("tmeqhhc"));
        assertEquals("pacientListOutput_{tmeqhhc}", obj.pacientListInput());
        assertEquals("removePacientOutput_{}", obj.removePacientInput("tmeqhhc"));
        assertEquals("informationsInput_Error", obj.informationsInput());
    }

    @Test
    public void test_k2_80_pacientList_addPacient_consult_pacientList_removePacient_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{nkcpsxi}", obj.addPacientInput("nkcpsxi"));
        assertEquals("consultOutput", obj.consultInput("nkcpsxi"));
        assertEquals("pacientListOutput_{nkcpsxi}", obj.pacientListInput());
        assertEquals("removePacientOutput_{}", obj.removePacientInput("nkcpsxi"));
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_81_pacientList_addPacient_consult_pacientList_finish_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{zjnckgo}", obj.addPacientInput("zjnckgo"));
        assertEquals("consultOutput", obj.consultInput("zjnckgo"));
        assertEquals("pacientListOutput_{zjnckgo}", obj.pacientListInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("consultInput_Error", obj.consultInput("zjnckgo"));
    }

    @Test
    public void test_k2_82_pacientList_addPacient_consult_pacientList_finish_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{dlgkznm}", obj.addPacientInput("dlgkznm"));
        assertEquals("consultOutput", obj.consultInput("dlgkznm"));
        assertEquals("pacientListOutput_{dlgkznm}", obj.pacientListInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_83_pacientList_addPacient_consult_pacientList_finish_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{vkgkdhs}", obj.addPacientInput("vkgkdhs"));
        assertEquals("consultOutput", obj.consultInput("vkgkdhs"));
        assertEquals("pacientListOutput_{vkgkdhs}", obj.pacientListInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("addPacientInput_Error", obj.addPacientInput("obaetda"));
    }

    @Test
    public void test_k2_84_pacientList_addPacient_consult_pacientList_finish_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{uuvurtv}", obj.addPacientInput("uuvurtv"));
        assertEquals("consultOutput", obj.consultInput("uuvurtv"));
        assertEquals("pacientListOutput_{uuvurtv}", obj.pacientListInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("removePacientInput_Error", obj.removePacientInput("uuvurtv"));
    }

    @Test
    public void test_k2_85_pacientList_addPacient_consult_pacientList_finish_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{heuuozf}", obj.addPacientInput("heuuozf"));
        assertEquals("consultOutput", obj.consultInput("heuuozf"));
        assertEquals("pacientListOutput_{heuuozf}", obj.pacientListInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("finishInput_Error", obj.finishInput());
    }

    @Test
    public void test_k2_86_pacientList_addPacient_consult_assignPrescription_pacientList_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{eklzyen}", obj.addPacientInput("eklzyen"));
        assertEquals("consultOutput", obj.consultInput("eklzyen"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("tsrzpfr;52"));
        assertEquals("pacientListOutput_{eklzyen}", obj.pacientListInput());
        assertEquals("consultOutput", obj.consultInput("eklzyen"));
    }

    @Test
    public void test_k2_87_pacientList_addPacient_consult_assignPrescription_pacientList_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{pjdtzza}", obj.addPacientInput("pjdtzza"));
        assertEquals("consultOutput", obj.consultInput("pjdtzza"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("wpcvjgq;42"));
        assertEquals("pacientListOutput_{pjdtzza}", obj.pacientListInput());
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_88_pacientList_addPacient_consult_assignPrescription_pacientList_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{jhzjeba}", obj.addPacientInput("jhzjeba"));
        assertEquals("consultOutput", obj.consultInput("jhzjeba"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("tbnrpjs;95"));
        assertEquals("pacientListOutput_{jhzjeba}", obj.pacientListInput());
        assertEquals("addPacientOutput_{jhzjeba;ipmarpe}", obj.addPacientInput("ipmarpe"));
    }

    @Test
    public void test_k2_89_pacientList_addPacient_consult_assignPrescription_pacientList_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{njgfwuo}", obj.addPacientInput("njgfwuo"));
        assertEquals("consultOutput", obj.consultInput("njgfwuo"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("evxowvw;19"));
        assertEquals("pacientListOutput_{njgfwuo}", obj.pacientListInput());
        assertEquals("removePacientOutput_{}", obj.removePacientInput("njgfwuo"));
    }

    @Test
    public void test_k2_90_pacientList_addPacient_consult_assignPrescription_pacientList_assignPrescription() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{egynqux}", obj.addPacientInput("egynqux"));
        assertEquals("consultOutput", obj.consultInput("egynqux"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("erducqh;22"));
        assertEquals("pacientListOutput_{egynqux}", obj.pacientListInput());
        assertEquals("assignPrescriptionInput_Error", obj.assignPrescriptionInput("xubtzpw;38"));
    }

    @Test
    public void test_k2_91_pacientList_addPacient_consult_assignPrescription_pacientList_informations() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{oukjlxe}", obj.addPacientInput("oukjlxe"));
        assertEquals("consultOutput", obj.consultInput("oukjlxe"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("qxtvmka;68"));
        assertEquals("pacientListOutput_{oukjlxe}", obj.pacientListInput());
        assertEquals("informationsInput_Error", obj.informationsInput());
    }

    @Test
    public void test_k2_92_pacientList_addPacient_consult_assignPrescription_pacientList_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{bvmwqqr}", obj.addPacientInput("bvmwqqr"));
        assertEquals("consultOutput", obj.consultInput("bvmwqqr"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("ezgzzhf;31"));
        assertEquals("pacientListOutput_{bvmwqqr}", obj.pacientListInput());
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_93_pacientList_addPacient_consult_assignPrescription_assignPrescription_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{munhqup}", obj.addPacientInput("munhqup"));
        assertEquals("consultOutput", obj.consultInput("munhqup"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("nmdisit;3"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("qwldnbx;3"));
        assertEquals("consultInput_Error", obj.consultInput("munhqup"));
    }

    @Test
    public void test_k2_94_pacientList_addPacient_consult_assignPrescription_assignPrescription_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{dxdguqh}", obj.addPacientInput("dxdguqh"));
        assertEquals("consultOutput", obj.consultInput("dxdguqh"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("feixabp;52"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("zgfhgsx;11"));
        assertEquals("pacientListOutput_{dxdguqh}", obj.pacientListInput());
    }

    @Test
    public void test_k2_95_pacientList_addPacient_consult_assignPrescription_assignPrescription_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{ovgpphq}", obj.addPacientInput("ovgpphq"));
        assertEquals("consultOutput", obj.consultInput("ovgpphq"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("dlcrwof;35"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("vgsvsmo;24"));
        assertEquals("addPacientInput_Error", obj.addPacientInput("pocowfu"));
    }

    @Test
    public void test_k2_96_pacientList_addPacient_consult_assignPrescription_assignPrescription_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{myiklux}", obj.addPacientInput("myiklux"));
        assertEquals("consultOutput", obj.consultInput("myiklux"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("mlewqeh;22"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("gtfpxui;35"));
        assertEquals("removePacientInput_Error", obj.removePacientInput("myiklux"));
    }

    @Test
    public void test_k2_97_pacientList_addPacient_consult_assignPrescription_assignPrescription_assignPrescription() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{itlhacp}", obj.addPacientInput("itlhacp"));
        assertEquals("consultOutput", obj.consultInput("itlhacp"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("skjafnp;41"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("zsdmeuy;41"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("xwijbpq;97"));
    }

    @Test
    public void test_k2_98_pacientList_addPacient_consult_assignPrescription_assignPrescription_informations() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{qyoadln}", obj.addPacientInput("qyoadln"));
        assertEquals("consultOutput", obj.consultInput("qyoadln"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("ejanmxr;11"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("avgvhpd;60"));
        assertEquals("informationsOutput_{ejanmxr=11}{avgvhpd=60}", obj.informationsInput());
    }

    @Test
    public void test_k2_99_pacientList_addPacient_consult_assignPrescription_assignPrescription_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{proyimg}", obj.addPacientInput("proyimg"));
        assertEquals("consultOutput", obj.consultInput("proyimg"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("yymxpmp;11"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("qtkyhgt;62"));
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_100_pacientList_addPacient_consult_assignPrescription_informations_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{oyfnkzm}", obj.addPacientInput("oyfnkzm"));
        assertEquals("consultOutput", obj.consultInput("oyfnkzm"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("ifdktqf;44"));
        assertEquals("informationsOutput_{ifdktqf=44}", obj.informationsInput());
        assertEquals("consultInput_Error", obj.consultInput("oyfnkzm"));
    }

    @Test
    public void test_k2_101_pacientList_addPacient_consult_assignPrescription_informations_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{btqxpii}", obj.addPacientInput("btqxpii"));
        assertEquals("consultOutput", obj.consultInput("btqxpii"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("kzgbafk;40"));
        assertEquals("informationsOutput_{kzgbafk=40}", obj.informationsInput());
        assertEquals("pacientListOutput_{btqxpii}", obj.pacientListInput());
    }

    @Test
    public void test_k2_102_pacientList_addPacient_consult_assignPrescription_informations_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{ppkcrzd}", obj.addPacientInput("ppkcrzd"));
        assertEquals("consultOutput", obj.consultInput("ppkcrzd"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("fugsivc;65"));
        assertEquals("informationsOutput_{fugsivc=65}", obj.informationsInput());
        assertEquals("addPacientInput_Error", obj.addPacientInput("gnfzqpp"));
    }

    @Test
    public void test_k2_103_pacientList_addPacient_consult_assignPrescription_informations_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{dpgsqvw}", obj.addPacientInput("dpgsqvw"));
        assertEquals("consultOutput", obj.consultInput("dpgsqvw"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("itfacvy;40"));
        assertEquals("informationsOutput_{itfacvy=40}", obj.informationsInput());
        assertEquals("removePacientInput_Error", obj.removePacientInput("dpgsqvw"));
    }

    @Test
    public void test_k2_104_pacientList_addPacient_consult_assignPrescription_informations_assignPrescription() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{apvujxb}", obj.addPacientInput("apvujxb"));
        assertEquals("consultOutput", obj.consultInput("apvujxb"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("whkrmmp;82"));
        assertEquals("informationsOutput_{whkrmmp=82}", obj.informationsInput());
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("izzezra;24"));
    }

    @Test
    public void test_k2_105_pacientList_addPacient_consult_assignPrescription_informations_informations() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{mmzvhtn}", obj.addPacientInput("mmzvhtn"));
        assertEquals("consultOutput", obj.consultInput("mmzvhtn"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("znruvhn;78"));
        assertEquals("informationsOutput_{znruvhn=78}", obj.informationsInput());
        assertEquals("informationsOutput_{znruvhn=78}", obj.informationsInput());
    }

    @Test
    public void test_k2_106_pacientList_addPacient_consult_assignPrescription_informations_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{kjekjic}", obj.addPacientInput("kjekjic"));
        assertEquals("consultOutput", obj.consultInput("kjekjic"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("szattca;81"));
        assertEquals("informationsOutput_{szattca=81}", obj.informationsInput());
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_107_pacientList_addPacient_consult_assignPrescription_finish_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{hwppvdn}", obj.addPacientInput("hwppvdn"));
        assertEquals("consultOutput", obj.consultInput("hwppvdn"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("skliolu;13"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("consultInput_Error", obj.consultInput("hwppvdn"));
    }

    @Test
    public void test_k2_108_pacientList_addPacient_consult_assignPrescription_finish_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{fzfhgek}", obj.addPacientInput("fzfhgek"));
        assertEquals("consultOutput", obj.consultInput("fzfhgek"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("fooqbis;79"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_109_pacientList_addPacient_consult_assignPrescription_finish_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{ovwgsqr}", obj.addPacientInput("ovwgsqr"));
        assertEquals("consultOutput", obj.consultInput("ovwgsqr"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("yiitdmi;12"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("addPacientInput_Error", obj.addPacientInput("trrdyat"));
    }

    @Test
    public void test_k2_110_pacientList_addPacient_consult_assignPrescription_finish_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{bxxxsre}", obj.addPacientInput("bxxxsre"));
        assertEquals("consultOutput", obj.consultInput("bxxxsre"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("rmjgsdw;3"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("removePacientInput_Error", obj.removePacientInput("bxxxsre"));
    }

    @Test
    public void test_k2_111_pacientList_addPacient_consult_assignPrescription_finish_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{gzpcrau}", obj.addPacientInput("gzpcrau"));
        assertEquals("consultOutput", obj.consultInput("gzpcrau"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("luixaii;94"));
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("finishInput_Error", obj.finishInput());
    }

    @Test
    public void test_k2_112_pacientList_addPacient_consult_informations_pacientList_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{bfbarja}", obj.addPacientInput("bfbarja"));
        assertEquals("consultOutput", obj.consultInput("bfbarja"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("pacientListOutput_{bfbarja}", obj.pacientListInput());
        assertEquals("consultOutput", obj.consultInput("bfbarja"));
    }

    @Test
    public void test_k2_113_pacientList_addPacient_consult_informations_pacientList_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{phtfhhp}", obj.addPacientInput("phtfhhp"));
        assertEquals("consultOutput", obj.consultInput("phtfhhp"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("pacientListOutput_{phtfhhp}", obj.pacientListInput());
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_114_pacientList_addPacient_consult_informations_pacientList_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{emgwgbj}", obj.addPacientInput("emgwgbj"));
        assertEquals("consultOutput", obj.consultInput("emgwgbj"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("pacientListOutput_{emgwgbj}", obj.pacientListInput());
        assertEquals("addPacientOutput_{qnkfcts;emgwgbj}", obj.addPacientInput("qnkfcts"));
    }

    @Test
    public void test_k2_115_pacientList_addPacient_consult_informations_pacientList_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{yflmdcy}", obj.addPacientInput("yflmdcy"));
        assertEquals("consultOutput", obj.consultInput("yflmdcy"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("pacientListOutput_{yflmdcy}", obj.pacientListInput());
        assertEquals("removePacientOutput_{}", obj.removePacientInput("yflmdcy"));
    }

    @Test
    public void test_k2_116_pacientList_addPacient_consult_informations_pacientList_assignPrescription() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{eiyttzp}", obj.addPacientInput("eiyttzp"));
        assertEquals("consultOutput", obj.consultInput("eiyttzp"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("pacientListOutput_{eiyttzp}", obj.pacientListInput());
        assertEquals("assignPrescriptionInput_Error", obj.assignPrescriptionInput("xwnosam;94"));
    }

    @Test
    public void test_k2_117_pacientList_addPacient_consult_informations_pacientList_informations() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{muvyyvg}", obj.addPacientInput("muvyyvg"));
        assertEquals("consultOutput", obj.consultInput("muvyyvg"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("pacientListOutput_{muvyyvg}", obj.pacientListInput());
        assertEquals("informationsInput_Error", obj.informationsInput());
    }

    @Test
    public void test_k2_118_pacientList_addPacient_consult_informations_pacientList_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{jsyalrl}", obj.addPacientInput("jsyalrl"));
        assertEquals("consultOutput", obj.consultInput("jsyalrl"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("pacientListOutput_{jsyalrl}", obj.pacientListInput());
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_119_pacientList_addPacient_consult_informations_assignPrescription_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{ituznut}", obj.addPacientInput("ituznut"));
        assertEquals("consultOutput", obj.consultInput("ituznut"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("kjrnjmx;58"));
        assertEquals("consultInput_Error", obj.consultInput("ituznut"));
    }

    @Test
    public void test_k2_120_pacientList_addPacient_consult_informations_assignPrescription_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{flkislk}", obj.addPacientInput("flkislk"));
        assertEquals("consultOutput", obj.consultInput("flkislk"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("lovzrlo;95"));
        assertEquals("pacientListOutput_{flkislk}", obj.pacientListInput());
    }

    @Test
    public void test_k2_121_pacientList_addPacient_consult_informations_assignPrescription_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{xquuhax}", obj.addPacientInput("xquuhax"));
        assertEquals("consultOutput", obj.consultInput("xquuhax"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("cniycis;26"));
        assertEquals("addPacientInput_Error", obj.addPacientInput("djjaqml"));
    }

    @Test
    public void test_k2_122_pacientList_addPacient_consult_informations_assignPrescription_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{fuvsdtj}", obj.addPacientInput("fuvsdtj"));
        assertEquals("consultOutput", obj.consultInput("fuvsdtj"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("jodsukd;36"));
        assertEquals("removePacientInput_Error", obj.removePacientInput("fuvsdtj"));
    }

    @Test
    public void test_k2_123_pacientList_addPacient_consult_informations_assignPrescription_assignPrescription() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{cuwajjb}", obj.addPacientInput("cuwajjb"));
        assertEquals("consultOutput", obj.consultInput("cuwajjb"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("uyveicj;80"));
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("kmvqbct;96"));
    }

    @Test
    public void test_k2_124_pacientList_addPacient_consult_informations_assignPrescription_informations() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{cgznirq}", obj.addPacientInput("cgznirq"));
        assertEquals("consultOutput", obj.consultInput("cgznirq"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("vivgdwv;83"));
        assertEquals("informationsOutput_{vivgdwv=83}", obj.informationsInput());
    }

    @Test
    public void test_k2_125_pacientList_addPacient_consult_informations_assignPrescription_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{slxniut}", obj.addPacientInput("slxniut"));
        assertEquals("consultOutput", obj.consultInput("slxniut"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("glejfme;69"));
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_126_pacientList_addPacient_consult_informations_informations_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{mificoz}", obj.addPacientInput("mificoz"));
        assertEquals("consultOutput", obj.consultInput("mificoz"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("consultInput_Error", obj.consultInput("mificoz"));
    }

    @Test
    public void test_k2_127_pacientList_addPacient_consult_informations_informations_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{hhbacab}", obj.addPacientInput("hhbacab"));
        assertEquals("consultOutput", obj.consultInput("hhbacab"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("pacientListOutput_{hhbacab}", obj.pacientListInput());
    }

    @Test
    public void test_k2_128_pacientList_addPacient_consult_informations_informations_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{hqnzwuq}", obj.addPacientInput("hqnzwuq"));
        assertEquals("consultOutput", obj.consultInput("hqnzwuq"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("addPacientInput_Error", obj.addPacientInput("uoagemd"));
    }

    @Test
    public void test_k2_129_pacientList_addPacient_consult_informations_informations_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{kqmueqv}", obj.addPacientInput("kqmueqv"));
        assertEquals("consultOutput", obj.consultInput("kqmueqv"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("removePacientInput_Error", obj.removePacientInput("kqmueqv"));
    }

    @Test
    public void test_k2_130_pacientList_addPacient_consult_informations_informations_assignPrescription() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{dygxnli}", obj.addPacientInput("dygxnli"));
        assertEquals("consultOutput", obj.consultInput("dygxnli"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("assignPrescriptionOutput", obj.assignPrescriptionInput("nmnwgxa;70"));
    }

    @Test
    public void test_k2_131_pacientList_addPacient_consult_informations_informations_informations() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{ivzllue}", obj.addPacientInput("ivzllue"));
        assertEquals("consultOutput", obj.consultInput("ivzllue"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("informationsOutput_", obj.informationsInput());
    }

    @Test
    public void test_k2_132_pacientList_addPacient_consult_informations_informations_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{jucplxg}", obj.addPacientInput("jucplxg"));
        assertEquals("consultOutput", obj.consultInput("jucplxg"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("finishOutput", obj.finishInput());
    }

    @Test
    public void test_k2_133_pacientList_addPacient_consult_informations_finish_consult() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{swawyhw}", obj.addPacientInput("swawyhw"));
        assertEquals("consultOutput", obj.consultInput("swawyhw"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("consultInput_Error", obj.consultInput("swawyhw"));
    }

    @Test
    public void test_k2_134_pacientList_addPacient_consult_informations_finish_pacientList() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{plmbuxk}", obj.addPacientInput("plmbuxk"));
        assertEquals("consultOutput", obj.consultInput("plmbuxk"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("pacientListInput_Error", obj.pacientListInput());
    }

    @Test
    public void test_k2_135_pacientList_addPacient_consult_informations_finish_addPacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{tspigce}", obj.addPacientInput("tspigce"));
        assertEquals("consultOutput", obj.consultInput("tspigce"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("addPacientInput_Error", obj.addPacientInput("nvjmxjg"));
    }

    @Test
    public void test_k2_136_pacientList_addPacient_consult_informations_finish_removePacient() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{gtydeyx}", obj.addPacientInput("gtydeyx"));
        assertEquals("consultOutput", obj.consultInput("gtydeyx"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("removePacientInput_Error", obj.removePacientInput("gtydeyx"));
    }

    @Test
    public void test_k2_137_pacientList_addPacient_consult_informations_finish_finish() {
        HealthcareSystemAdapter obj = new HealthcareSystemAdapter();
        assertEquals("pacientListOutput_{}", obj.pacientListInput());
        assertEquals("addPacientOutput_{kdozway}", obj.addPacientInput("kdozway"));
        assertEquals("consultOutput", obj.consultInput("kdozway"));
        assertEquals("informationsOutput_", obj.informationsInput());
        assertEquals("finishOutput", obj.finishInput());
        assertEquals("finishInput_Error", obj.finishInput());
    }

//
// Helper methods for definitions...
//


}
// End of generated Test Case

