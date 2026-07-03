package p039e5;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import p008b.C0242k0;
import p015b6.C0310q;
import p024c6.AbstractC0451r;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1807o;
import p060h5.AbstractC1817y;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.r */
/* loaded from: classes.dex */
public final class C1226r extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: i */
    public final /* synthetic */ int f7189i = 1;

    /* renamed from: j */
    public int f7190j;

    /* renamed from: k */
    public final /* synthetic */ C1196q0 f7191k;

    /* renamed from: l */
    public ArrayList f7192l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226r(C1196q0 c1196q0, ArrayList arrayList, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7191k = c1196q0;
        this.f7192l = arrayList;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        InterfaceC0516a0 interfaceC0516a0 = (InterfaceC0516a0) obj;
        InterfaceC2313c interfaceC2313c = (InterfaceC2313c) obj2;
        switch (this.f7189i) {
            case 0:
                return ((C1226r) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
            default:
                return ((C1226r) mo28k(interfaceC0516a0, interfaceC2313c)).mo29m(C1694m.f10482a);
        }
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        switch (this.f7189i) {
            case 0:
                return new C1226r(this.f7191k, interfaceC2313c);
            default:
                return new C1226r(this.f7191k, this.f7192l, interfaceC2313c);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:73:0x011e, code lost:
    
        if (r1 == r6) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0179, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x005f, code lost:
    
        if (p039e5.C1196q0.m2098e(r5, r13) == r6) goto L51;
     */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        ArrayList arrayList;
        Object value;
        LinkedHashMap m3089U;
        Set m3035C0;
        switch (this.f7189i) {
            case 0:
                int i7 = this.f7190j;
                C1694m c1694m = C1694m.f10482a;
                C1196q0 c1196q0 = this.f7191k;
                EnumC2465a enumC2465a = EnumC2465a.f13750e;
                if (i7 != 0) {
                    if (i7 != 1) {
                        if (i7 == 2) {
                            arrayList = this.f7192l;
                            AbstractC1793a0.m2972L(obj);
                            C1701c0 c1701c0 = c1196q0.f6973l;
                            do {
                                value = c1701c0.getValue();
                                Map map = (Map) value;
                                ArrayList arrayList2 = new ArrayList(AbstractC1807o.m3073U(arrayList));
                                int size = arrayList.size();
                                int i8 = 0;
                                while (i8 < size) {
                                    Object obj2 = arrayList.get(i8);
                                    i8++;
                                    arrayList2.add(((C0800d9) obj2).f3340a);
                                }
                                Set m3038F0 = AbstractC1805m.m3038F0(arrayList2);
                                AbstractC3367j.m5100e(map, "<this>");
                                m3089U = AbstractC1817y.m3089U(map);
                                Set keySet = m3089U.keySet();
                                AbstractC3367j.m5100e(keySet, "<this>");
                                if (m3038F0 instanceof Collection) {
                                    m3035C0 = m3038F0;
                                } else {
                                    m3035C0 = AbstractC1805m.m3035C0(m3038F0);
                                }
                                keySet.removeAll(m3035C0);
                            } while (!c1701c0.m2750g(value, AbstractC1817y.m3084P(m3089U)));
                            return c1694m;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    this.f7190j = 1;
                    break;
                }
                Iterable iterable = (Iterable) c1196q0.f6971j.getValue();
                arrayList = new ArrayList();
                for (Object obj3 : iterable) {
                    if (((C0800d9) obj3).f3351l != EnumC0768c9.f3010j) {
                        arrayList.add(obj3);
                    }
                }
                int size2 = arrayList.size();
                int i9 = 0;
                while (i9 < size2) {
                    Object obj4 = arrayList.get(i9);
                    i9++;
                    C0800d9 c0800d9 = (C0800d9) obj4;
                    C1196q0.m2096c(c1196q0, c0800d9);
                    c1196q0.m2112F(c0800d9).delete();
                    c1196q0.m2134y(c0800d9).delete();
                    c1196q0.m2127n(c0800d9).delete();
                }
                File[] listFiles = c1196q0.m2131s().listFiles();
                if (listFiles != null) {
                    ArrayList arrayList3 = new ArrayList();
                    for (File file : listFiles) {
                        String name = file.getName();
                        AbstractC3367j.m5099d(name, "getName(...)");
                        if (!AbstractC0451r.m965G(name, ".part", false)) {
                            String name2 = file.getName();
                            AbstractC3367j.m5099d(name2, "getName(...)");
                            if (!AbstractC0451r.m965G(name2, ".ranges", false)) {
                                String name3 = file.getName();
                                AbstractC3367j.m5099d(name3, "getName(...)");
                                if (!AbstractC0451r.m965G(name3, ".dynamic-ranges", false)) {
                                }
                            }
                        }
                        arrayList3.add(file);
                    }
                    int size3 = arrayList3.size();
                    int i10 = 0;
                    while (i10 < size3) {
                        Object obj5 = arrayList3.get(i10);
                        i10++;
                        ((File) obj5).delete();
                    }
                }
                C0242k0 c0242k0 = new C0242k0(11);
                this.f7192l = arrayList;
                this.f7190j = 2;
                c1196q0.m2109A(c0242k0);
                break;
            default:
                int i11 = this.f7190j;
                C1694m c1694m2 = C1694m.f10482a;
                if (i11 != 0) {
                    if (i11 == 1) {
                        AbstractC1793a0.m2972L(obj);
                        return c1694m2;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC1793a0.m2972L(obj);
                C0310q c0310q = new C0310q(4, this.f7192l);
                this.f7190j = 1;
                this.f7191k.m2109A(c0310q);
                EnumC2465a enumC2465a2 = EnumC2465a.f13750e;
                if (c1694m2 == enumC2465a2) {
                    return enumC2465a2;
                }
                return c1694m2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1226r(C1196q0 c1196q0, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f7191k = c1196q0;
    }
}
