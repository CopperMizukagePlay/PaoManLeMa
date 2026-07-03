package p039e5;

import java.util.Iterator;
import java.util.List;
import p001a0.C0077t;
import p024c6.AbstractC0444k;
import p053g5.C1694m;
import p085l0.C2364h0;
import p085l0.InterfaceC2425y0;
import p092m.AbstractC2487d;
import p144t.AbstractC3122c;
import p144t.C3137j0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.z3 */
/* loaded from: classes.dex */
public final /* synthetic */ class C1478z3 implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f9820e;

    /* renamed from: f */
    public final /* synthetic */ InterfaceC2425y0 f9821f;

    public /* synthetic */ C1478z3(InterfaceC2425y0 interfaceC2425y0, int i7) {
        this.f9820e = i7;
        this.f9821f = interfaceC2425y0;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        int i7 = this.f9820e;
        boolean z7 = false;
        int i8 = 0;
        int i9 = 0;
        C1694m c1694m = C1694m.f10482a;
        InterfaceC2425y0 interfaceC2425y0 = this.f9821f;
        switch (i7) {
            case 0:
                String str = (String) obj;
                AbstractC3367j.m5100e(str, "it");
                StringBuilder sb = new StringBuilder();
                int length = str.length();
                for (int i10 = 0; i10 < length; i10++) {
                    char charAt = str.charAt(i10);
                    if (Character.isDigit(charAt)) {
                        sb.append(charAt);
                    }
                }
                interfaceC2425y0.setValue(AbstractC0444k.m955s0(sb.toString(), 5));
                return c1694m;
            case 1:
                Object obj2 = (String) obj;
                AbstractC3367j.m5100e(obj2, "it");
                C3137j0 c3137j0 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(obj2);
                return c1694m;
            case 2:
                Object obj3 = (String) obj;
                AbstractC3367j.m5100e(obj3, "it");
                C3137j0 c3137j02 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(obj3);
                return c1694m;
            case 3:
                Object obj4 = (String) obj;
                AbstractC3367j.m5100e(obj4, "it");
                C3137j0 c3137j03 = AbstractC1172p7.f6835a;
                interfaceC2425y0.setValue(obj4);
                return c1694m;
            case 4:
                String str2 = (String) obj;
                AbstractC3367j.m5100e(str2, "value");
                if (str2.length() <= 2) {
                    while (true) {
                        if (i9 < str2.length()) {
                            if (Character.isDigit(str2.charAt(i9))) {
                                i9++;
                            }
                        } else {
                            interfaceC2425y0.setValue(str2);
                        }
                    }
                }
                return c1694m;
            case AbstractC3122c.f15761f /* 5 */:
                String str3 = (String) obj;
                AbstractC3367j.m5100e(str3, "value");
                if (str3.length() <= 3) {
                    while (true) {
                        if (i8 < str3.length()) {
                            if (Character.isDigit(str3.charAt(i8))) {
                                i8++;
                            }
                        } else {
                            interfaceC2425y0.setValue(str3);
                        }
                    }
                }
                return c1694m;
            case AbstractC3122c.f15759d /* 6 */:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                interfaceC2425y0.setValue(bool);
                return c1694m;
            case 7:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                interfaceC2425y0.setValue(bool2);
                return c1694m;
            case 8:
                Object obj5 = (String) obj;
                AbstractC3367j.m5100e(obj5, "it");
                interfaceC2425y0.setValue(obj5);
                return c1694m;
            case AbstractC3122c.f15758c /* 9 */:
                Object obj6 = (String) obj;
                AbstractC3367j.m5100e(obj6, "it");
                interfaceC2425y0.setValue(obj6);
                return c1694m;
            case AbstractC3122c.f15760e /* 10 */:
                AbstractC3367j.m5100e((C2364h0) obj, "$this$DisposableEffect");
                return new C0077t(2, interfaceC2425y0);
            case 11:
                C1024ke c1024ke = (C1024ke) obj;
                AbstractC3367j.m5100e(c1024ke, "it");
                return AbstractC2487d.m4044h(((EnumC0964ie) interfaceC2425y0.getValue()).name(), "_", c1024ke.f5267a);
            case 12:
                Boolean bool3 = (Boolean) obj;
                bool3.booleanValue();
                interfaceC2425y0.setValue(bool3);
                return c1694m;
            case 13:
                Boolean bool4 = (Boolean) obj;
                bool4.booleanValue();
                interfaceC2425y0.setValue(bool4);
                return c1694m;
            case 14:
                Boolean bool5 = (Boolean) obj;
                bool5.booleanValue();
                interfaceC2425y0.setValue(bool5);
                return c1694m;
            case AbstractC3122c.f15762g /* 15 */:
                Boolean bool6 = (Boolean) obj;
                bool6.booleanValue();
                interfaceC2425y0.setValue(bool6);
                return c1694m;
            case 16:
                Boolean bool7 = (Boolean) obj;
                bool7.booleanValue();
                interfaceC2425y0.setValue(bool7);
                return c1694m;
            case 17:
                Object obj7 = (EnumC0964ie) obj;
                AbstractC3367j.m5100e(obj7, "it");
                interfaceC2425y0.setValue(obj7);
                return c1694m;
            case 18:
                String str4 = (String) obj;
                AbstractC3367j.m5100e(str4, "id");
                List list = (List) interfaceC2425y0.getValue();
                if (list == null || !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        if (AbstractC3367j.m5096a(((C1248rl) it.next()).f7390a, str4)) {
                            return Boolean.valueOf(z7);
                        }
                    }
                }
                z7 = true;
                return Boolean.valueOf(z7);
            case 19:
                Object obj8 = (EnumC0770cb) obj;
                AbstractC3367j.m5100e(obj8, "it");
                interfaceC2425y0.setValue(obj8);
                return c1694m;
            case 20:
                Object obj9 = (EnumC1331ub) obj;
                AbstractC3367j.m5100e(obj9, "it");
                interfaceC2425y0.setValue(obj9);
                return c1694m;
            case 21:
                Object obj10 = (EnumC1300tb) obj;
                AbstractC3367j.m5100e(obj10, "it");
                interfaceC2425y0.setValue(obj10);
                return c1694m;
            case 22:
                Object obj11 = (String) obj;
                AbstractC3367j.m5100e(obj11, "it");
                interfaceC2425y0.setValue(obj11);
                return c1694m;
            case 23:
                Object obj12 = (String) obj;
                AbstractC3367j.m5100e(obj12, "it");
                interfaceC2425y0.setValue(obj12);
                return c1694m;
            case 24:
                Object obj13 = (String) obj;
                AbstractC3367j.m5100e(obj13, "it");
                interfaceC2425y0.setValue(obj13);
                return c1694m;
            case 25:
                Object obj14 = (String) obj;
                AbstractC3367j.m5100e(obj14, "it");
                interfaceC2425y0.setValue(obj14);
                return c1694m;
            case 26:
                float f7 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue((String) obj);
                return c1694m;
            case 27:
                float f8 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue((String) obj);
                return c1694m;
            case 28:
                Boolean bool8 = (Boolean) obj;
                bool8.booleanValue();
                float f9 = AbstractC1092mk.f5952h;
                interfaceC2425y0.setValue(bool8);
                return c1694m;
            default:
                Boolean bool9 = (Boolean) obj;
                bool9.booleanValue();
                interfaceC2425y0.setValue(bool9);
                return c1694m;
        }
    }
}
