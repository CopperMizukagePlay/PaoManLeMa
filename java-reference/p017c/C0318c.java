package p017c;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.NoSuchElementException;
import p001a0.AbstractC0094y0;
import p001a0.C0073s;
import p001a0.C0077t;
import p001a0.C0078t0;
import p008b.C0230e0;
import p008b.C0243l;
import p015b6.C0294a;
import p015b6.C0304k;
import p015b6.C0310q;
import p029d3.AbstractC0497d;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p039e5.AbstractC1092mk;
import p039e5.C0769ca;
import p039e5.C0800d9;
import p039e5.C1036kq;
import p039e5.C1196q0;
import p039e5.C1263s5;
import p039e5.C1481z6;
import p041f.C1509a;
import p041f.C1510b;
import p041f.C1511c;
import p053g5.C1694m;
import p082k5.InterfaceC2313c;
import p085l0.InterfaceC2425y0;
import p102n1.AbstractC2710c;
import p145t0.C3173d;
import p150t5.InterfaceC3279c;
import p152u.C3320h;
import p158u5.AbstractC3367j;
import p161v0.C3469p;
import p161v0.C3472s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c.c */
/* loaded from: classes.dex */
public final /* synthetic */ class C0318c implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f1114e;

    /* renamed from: f */
    public final /* synthetic */ Object f1115f;

    /* renamed from: g */
    public final /* synthetic */ Object f1116g;

    /* renamed from: h */
    public final /* synthetic */ Object f1117h;

    /* renamed from: i */
    public final /* synthetic */ Object f1118i;

    /* renamed from: j */
    public final /* synthetic */ Object f1119j;

    public /* synthetic */ C0318c(Context context, InterfaceC2425y0 interfaceC2425y0, C3469p c3469p, InterfaceC2425y0 interfaceC2425y02, InterfaceC2425y0 interfaceC2425y03) {
        this.f1114e = 3;
        this.f1116g = context;
        this.f1115f = interfaceC2425y0;
        this.f1117h = c3469p;
        this.f1118i = interfaceC2425y02;
        this.f1119j = interfaceC2425y03;
    }

    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        Object obj2;
        int i7 = this.f1114e;
        C1694m c1694m = C1694m.f10482a;
        Object obj3 = this.f1119j;
        Object obj4 = this.f1118i;
        Object obj5 = this.f1117h;
        Object obj6 = this.f1115f;
        Object obj7 = this.f1116g;
        switch (i7) {
            case 0:
                C0316a c0316a = (C0316a) obj7;
                C0243l c0243l = (C0243l) obj5;
                String str = (String) obj4;
                AbstractC2710c abstractC2710c = (AbstractC2710c) obj3;
                C0230e0 c0230e0 = new C0230e0((InterfaceC2425y0) obj6);
                InterfaceC2425y0 interfaceC2425y0 = (InterfaceC2425y0) c0230e0.f913a;
                Bundle bundle = c0243l.f945g;
                LinkedHashMap linkedHashMap = c0243l.f939a;
                LinkedHashMap linkedHashMap2 = c0243l.f944f;
                AbstractC3367j.m5100e(str, "key");
                LinkedHashMap linkedHashMap3 = c0243l.f940b;
                if (((Integer) linkedHashMap3.get(str)) == null) {
                    C1036kq c1036kq = new C1036kq(5);
                    Iterator it = new C0294a(new C0304k(c1036kq, new C0310q(0, c1036kq))).iterator();
                    while (it.hasNext()) {
                        Number number = (Number) it.next();
                        if (!linkedHashMap.containsKey(Integer.valueOf(number.intValue()))) {
                            int intValue = number.intValue();
                            linkedHashMap.put(Integer.valueOf(intValue), str);
                            linkedHashMap3.put(str, Integer.valueOf(intValue));
                        }
                    }
                    throw new NoSuchElementException("Sequence contains no element matching the predicate.");
                }
                c0243l.f943e.put(str, new C1510b(c0230e0, abstractC2710c));
                if (linkedHashMap2.containsKey(str)) {
                    Object obj8 = linkedHashMap2.get(str);
                    linkedHashMap2.remove(str);
                    ((InterfaceC3279c) interfaceC2425y0.getValue()).mo23f(obj8);
                }
                if (Build.VERSION.SDK_INT >= 34) {
                    obj2 = AbstractC0497d.m1079a(str, bundle);
                } else {
                    Parcelable parcelable = bundle.getParcelable(str);
                    if (C1509a.class.isInstance(parcelable)) {
                        obj2 = parcelable;
                    } else {
                        obj2 = null;
                    }
                }
                C1509a c1509a = (C1509a) obj2;
                if (c1509a != null) {
                    bundle.remove(str);
                    ((InterfaceC3279c) interfaceC2425y0.getValue()).mo23f(abstractC2710c.mo2520K(c1509a.f9995f, c1509a.f9994e));
                }
                c0316a.f1112a = new C1511c(c0243l, str, abstractC2710c);
                return new C0077t(1, c0316a);
            case 1:
                String str2 = (String) obj;
                AbstractC3367j.m5100e(str2, "value");
                AbstractC0525d0.m1141s((InterfaceC0516a0) obj7, null, new C0073s((C1196q0) obj5, (C0800d9) obj4, str2, (Context) obj3, (InterfaceC2425y0) obj6, (InterfaceC2313c) null), 3);
                return c1694m;
            case 2:
                List list = (List) obj7;
                C3320h c3320h = (C3320h) obj;
                AbstractC3367j.m5100e(c3320h, "$this$LazyColumn");
                C1263s5 c1263s5 = new C1263s5(12);
                c3320h.m5054m(list.size(), new C0078t0(10, c1263s5, list), new C1481z6(3, list), new C3173d(-632812321, new C0769ca(list, (C3472s) obj5, (String) obj4, (C3472s) obj3, (C3472s) obj6), true));
                return c1694m;
            default:
                Context context = (Context) obj7;
                C3469p c3469p = (C3469p) obj5;
                InterfaceC2425y0 interfaceC2425y02 = (InterfaceC2425y0) obj4;
                InterfaceC2425y0 interfaceC2425y03 = (InterfaceC2425y0) obj3;
                Boolean bool = (Boolean) obj;
                boolean booleanValue = bool.booleanValue();
                float f7 = AbstractC1092mk.f5952h;
                AbstractC0094y0.m178e((InterfaceC2425y0) obj6, bool, context, "speed_test_profiles", 0).putBoolean("default_all_interfaces_test", booleanValue).apply();
                if (booleanValue) {
                    AbstractC1092mk.m1742V0(context, c3469p, interfaceC2425y02, true);
                    interfaceC2425y03.setValue(Boolean.TRUE);
                }
                return c1694m;
        }
    }

    public /* synthetic */ C0318c(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i7) {
        this.f1114e = i7;
        this.f1116g = obj;
        this.f1117h = obj2;
        this.f1118i = obj3;
        this.f1119j = obj4;
        this.f1115f = obj5;
    }
}
