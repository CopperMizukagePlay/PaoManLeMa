package p039e5;

import android.content.Context;
import android.net.Uri;
import android.widget.Toast;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import p001a0.C0078t0;
import p024c6.AbstractC0434a;
import p053g5.C1689h;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p068i5.C2077a;
import p085l0.C2349d1;
import p085l0.InterfaceC2390n2;
import p085l0.InterfaceC2425y0;
import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p152u.C3320h;
import p158u5.AbstractC3367j;
import p161v0.C3469p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.ce */
/* loaded from: classes.dex */
public final /* synthetic */ class C0773ce implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f3044e = 0;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f3045f;

    /* renamed from: g */
    public final /* synthetic */ InterfaceC2425y0 f3046g;

    /* renamed from: h */
    public final /* synthetic */ Object f3047h;

    /* renamed from: i */
    public final /* synthetic */ Object f3048i;

    /* renamed from: j */
    public final /* synthetic */ Object f3049j;

    /* renamed from: k */
    public final /* synthetic */ Object f3050k;

    /* renamed from: l */
    public final /* synthetic */ InterfaceC2390n2 f3051l;

    public /* synthetic */ C0773ce(InterfaceC2425y0 interfaceC2425y0, InterfaceC2390n2 interfaceC2390n2, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03, InterfaceC2425y0 interfaceC2425y04, InterfaceC2425y0 interfaceC2425y05, InterfaceC2425y0 interfaceC2425y06) {
        this.f3045f = interfaceC2425y0;
        this.f3051l = interfaceC2390n2;
        this.f3046g = interfaceC2425y02;
        this.f3047h = interfaceC2425y03;
        this.f3048i = interfaceC2425y04;
        this.f3049j = interfaceC2425y05;
        this.f3050k = interfaceC2425y06;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f4  */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.util.List, java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v14, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.List, java.util.Collection] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo23f(Object obj) {
        Object obj2;
        int i7;
        Object m2985m;
        boolean booleanValue;
        String str;
        String m1752X2;
        OutputStream openOutputStream;
        int i8 = this.f3044e;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2390n2 interfaceC2390n2 = this.f3051l;
        Object obj3 = this.f3050k;
        Object obj4 = this.f3049j;
        Object obj5 = this.f3048i;
        Object obj6 = this.f3047h;
        switch (i8) {
            case 0:
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) obj3;
                C3320h c3320h = (C3320h) obj;
                AbstractC3367j.m5100e(c3320h, "$this$LazyColumn");
                InterfaceC2425y0 interfaceC2425y02 = this.f3045f;
                C3320h.m5052l(c3320h, "header", new C3173d(-1747377661, new C1076m4(interfaceC2425y02, 5), true), 2);
                List list = AbstractC0993je.f5056a;
                List m1614a = AbstractC0993je.m1614a((EnumC0964ie) interfaceC2425y02.getValue());
                c3320h.m5054m(m1614a.size(), new C0078t0(14, new C1478z3(interfaceC2425y02, 11), m1614a), new C1481z6(5, m1614a), new C3173d(-632812321, new C0702a7(2, m1614a), true));
                C3320h.m5052l(c3320h, "scroll_hint", new C3173d(-31138502, new C1297t8(3, interfaceC2390n2, interfaceC2425y02), true), 2);
                C3320h.m5052l(c3320h, "checkboxes", new C3173d(-425542341, new C0765c6(this.f3046g, (InterfaceC2425y0) obj6, (InterfaceC2425y0) obj5, (InterfaceC2425y0) obj4, interfaceC2425y0, interfaceC2425y02, 6), true), 2);
                return c1694m;
            default:
                C3469p c3469p = (C3469p) obj6;
                C3469p c3469p2 = (C3469p) obj5;
                C3469p c3469p3 = (C3469p) obj4;
                Context context = (Context) obj3;
                C2349d1 c2349d1 = (C2349d1) interfaceC2390n2;
                Uri uri = (Uri) obj;
                if (uri != null) {
                    ?? m1678H3 = AbstractC1092mk.m1678H3(c3469p, (EnumC0770cb) this.f3045f.getValue(), c3469p2, c2349d1.m3741g(), ((Boolean) this.f3046g.getValue()).booleanValue(), c3469p3);
                    if (m1678H3.isEmpty()) {
                        m1678H3 = new ArrayList();
                        ListIterator listIterator = c3469p.listIterator();
                        while (true) {
                            C2077a c2077a = (C2077a) listIterator;
                            if (c2077a.hasNext()) {
                                Object next = c2077a.next();
                                if (((C1189po) next).f6926a == c2349d1.m3741g()) {
                                    m1678H3.add(next);
                                }
                            }
                        }
                    }
                    if (m1678H3.isEmpty()) {
                        Toast.makeText(context, "没有可导出的配置", 0).show();
                    } else {
                        Iterator it = m1678H3.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (((C1189po) obj2).f6926a == c2349d1.m3741g()) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        C1189po c1189po = (C1189po) obj2;
                        if (c1189po != null) {
                            i7 = c1189po.f6926a;
                        } else {
                            C1189po c1189po2 = (C1189po) AbstractC1805m.m3047k0(m1678H3);
                            if (c1189po2 != null) {
                                i7 = c1189po2.f6926a;
                            } else {
                                i7 = 0;
                            }
                        }
                        try {
                            m1752X2 = AbstractC1092mk.m1752X2(i7, m1678H3);
                            openOutputStream = context.getContentResolver().openOutputStream(uri);
                        } catch (Throwable th) {
                            m2985m = AbstractC1793a0.m2985m(th);
                        }
                        if (openOutputStream != null) {
                            try {
                                byte[] bytes = m1752X2.getBytes(AbstractC0434a.f1477a);
                                AbstractC3367j.m5099d(bytes, "getBytes(...)");
                                openOutputStream.write(bytes);
                                openOutputStream.close();
                                m2985m = Boolean.TRUE;
                                Object obj7 = Boolean.FALSE;
                                if (m2985m instanceof C1689h) {
                                    m2985m = obj7;
                                }
                                booleanValue = ((Boolean) m2985m).booleanValue();
                                if (!booleanValue) {
                                    str = "配置已导出";
                                } else {
                                    str = "配置导出失败";
                                }
                                Toast.makeText(context, str, 0).show();
                            } finally {
                            }
                        } else {
                            booleanValue = false;
                            if (!booleanValue) {
                            }
                            Toast.makeText(context, str, 0).show();
                        }
                    }
                }
                return c1694m;
        }
    }

    public /* synthetic */ C0773ce(C3469p c3469p, C3469p c3469p2, C3469p c3469p3, Context context, InterfaceC2425y0 interfaceC2425y0, C2349d1 c2349d1, InterfaceC2425y0 interfaceC2425y02) {
        this.f3047h = c3469p;
        this.f3048i = c3469p2;
        this.f3049j = c3469p3;
        this.f3050k = context;
        this.f3045f = interfaceC2425y0;
        this.f3051l = c2349d1;
        this.f3046g = interfaceC2425y02;
    }
}
