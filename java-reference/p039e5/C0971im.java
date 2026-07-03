package p039e5;

import android.content.Context;
import android.net.Network;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
import p001a0.C0073s;
import p018c0.C0334d;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.AbstractC0549l0;
import p032d6.InterfaceC0516a0;
import p053g5.C1694m;
import p054g6.C1701c0;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1805m;
import p060h5.AbstractC1806n;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p083k6.C2325e;
import p083k6.ExecutorC2324d;
import p090l5.EnumC2465a;
import p098m5.AbstractC2590j;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.im */
/* loaded from: classes.dex */
public final class C0971im extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: A */
    public final /* synthetic */ Context f4909A;

    /* renamed from: B */
    public final /* synthetic */ String f4910B;

    /* renamed from: C */
    public final /* synthetic */ String f4911C;

    /* renamed from: i */
    public String f4912i;

    /* renamed from: j */
    public List f4913j;

    /* renamed from: k */
    public List f4914k;

    /* renamed from: l */
    public int f4915l;

    /* renamed from: m */
    public int f4916m;

    /* renamed from: n */
    public int f4917n;

    /* renamed from: o */
    public int f4918o;

    /* renamed from: p */
    public int f4919p;

    /* renamed from: q */
    public int f4920q;

    /* renamed from: r */
    public /* synthetic */ Object f4921r;

    /* renamed from: s */
    public final /* synthetic */ EnumC1125nm f4922s;

    /* renamed from: t */
    public final /* synthetic */ C1001jm f4923t;

    /* renamed from: u */
    public final /* synthetic */ String f4924u;

    /* renamed from: v */
    public final /* synthetic */ int f4925v;

    /* renamed from: w */
    public final /* synthetic */ String f4926w;

    /* renamed from: x */
    public final /* synthetic */ Network f4927x;

    /* renamed from: y */
    public final /* synthetic */ int f4928y;

    /* renamed from: z */
    public final /* synthetic */ boolean f4929z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0971im(EnumC1125nm enumC1125nm, C1001jm c1001jm, String str, int i7, String str2, Network network, int i8, boolean z7, Context context, String str3, String str4, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f4922s = enumC1125nm;
        this.f4923t = c1001jm;
        this.f4924u = str;
        this.f4925v = i7;
        this.f4926w = str2;
        this.f4927x = network;
        this.f4928y = i8;
        this.f4929z = z7;
        this.f4909A = context;
        this.f4910B = str3;
        this.f4911C = str4;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C0971im) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C0971im c0971im = new C0971im(this.f4922s, this.f4923t, this.f4924u, this.f4925v, this.f4926w, this.f4927x, this.f4928y, this.f4929z, this.f4909A, this.f4910B, this.f4911C, interfaceC2313c);
        c0971im.f4921r = obj;
        return c0971im;
    }

    /* JADX WARN: Code restructure failed: missing block: B:130:0x0141, code lost:
    
        if (r3 != r5) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x03cf, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x00de, code lost:
    
        if (r6 == r5) goto L20;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x03de  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x033b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x014c  */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v21, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v22, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r11v27, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v28, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v29, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.util.List] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:60:0x03d0 -> B:9:0x03d6). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x03de -> B:10:0x03dc). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        InterfaceC0516a0 interfaceC0516a0;
        InterfaceC0516a0 interfaceC0516a02;
        int i7;
        Object m1122A;
        String str;
        boolean z7;
        InterfaceC2318h interfaceC2318h;
        Object m1122A2;
        String str2;
        int i8;
        int i9;
        int i10;
        int i11;
        EnumC2465a enumC2465a;
        AtomicBoolean atomicBoolean;
        C1001jm c1001jm;
        boolean z8;
        String str3;
        boolean z9;
        boolean z10;
        EnumC1125nm enumC1125nm;
        String str4;
        int i12;
        int i13;
        InterfaceC2318h interfaceC2318h2;
        int i14;
        int i15;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i16;
        int i17;
        int i18;
        InterfaceC0516a0 interfaceC0516a03;
        int i19;
        InterfaceC2318h interfaceC2318h3;
        int i20;
        int i21;
        int i22;
        InterfaceC0516a0 interfaceC0516a04;
        String str5;
        ArrayList arrayList3;
        ?? r10;
        EnumC2465a enumC2465a2;
        int i23;
        int i24;
        int i25;
        int i26;
        Object obj2;
        C1094mm c1094mm;
        int i27;
        ArrayList arrayList4;
        ArrayList arrayList5;
        int i28;
        int i29;
        String str6;
        int i30;
        double d7;
        int i31;
        int i32;
        double d8;
        Iterator it;
        Double valueOf;
        double d9;
        Double m3054r0;
        double d10;
        double m3040d0;
        String str7;
        int i33;
        ArrayList arrayList6;
        InterfaceC0516a0 interfaceC0516a05;
        EnumC2465a enumC2465a3;
        Object obj3;
        int ordinal;
        C1001jm c1001jm2 = this.f4923t;
        AtomicBoolean atomicBoolean2 = c1001jm2.f5109b;
        C1701c0 c1701c0 = c1001jm2.f5111d;
        int i34 = this.f4920q;
        EnumC1125nm enumC1125nm2 = EnumC1125nm.f6344f;
        String str8 = this.f4924u;
        C1694m c1694m = C1694m.f10482a;
        boolean z11 = this.f4929z;
        EnumC1125nm enumC1125nm3 = this.f4922s;
        EnumC2465a enumC2465a4 = EnumC2465a.f13750e;
        if (i34 != 0) {
            if (i34 != 1) {
                if (i34 != 2) {
                    if (i34 != 3) {
                        if (i34 != 4) {
                            if (i34 == 5) {
                                i30 = this.f4919p;
                                int i35 = this.f4918o;
                                int i36 = this.f4917n;
                                i29 = this.f4916m;
                                i28 = this.f4915l;
                                ?? r11 = this.f4914k;
                                ?? r13 = this.f4913j;
                                str6 = this.f4912i;
                                InterfaceC0516a0 interfaceC0516a06 = (InterfaceC0516a0) this.f4921r;
                                AbstractC1793a0.m2972L(obj);
                                atomicBoolean = atomicBoolean2;
                                z10 = z11;
                                enumC1125nm = enumC1125nm3;
                                interfaceC2318h3 = null;
                                i22 = 4;
                                i21 = 3;
                                enumC2465a2 = enumC2465a4;
                                c1001jm = c1001jm2;
                                ArrayList arrayList7 = r11;
                                ArrayList arrayList8 = r13;
                                int i37 = i29;
                                i17 = i28;
                                i14 = i37;
                                interfaceC0516a03 = interfaceC0516a06;
                                arrayList = arrayList8;
                                ArrayList arrayList9 = arrayList7;
                                str4 = str6;
                                if (i30 != i14) {
                                    int i38 = i36;
                                    i16 = i30 + 1;
                                    i18 = i38;
                                    enumC2465a = enumC2465a2;
                                    interfaceC2318h2 = interfaceC2318h3;
                                    i13 = i21;
                                    i19 = i35;
                                    arrayList2 = arrayList9;
                                    i12 = i22;
                                    i15 = 1;
                                    if (atomicBoolean.get() && AbstractC0525d0.m1139q(interfaceC0516a03)) {
                                        int i39 = i18 + i15;
                                        ordinal = enumC1125nm.ordinal();
                                        if (ordinal != 0) {
                                            if (ordinal == i15) {
                                                InterfaceC0516a0 interfaceC0516a07 = interfaceC0516a03;
                                                this.f4921r = interfaceC0516a07;
                                                this.f4912i = str4;
                                                this.f4913j = arrayList;
                                                this.f4914k = arrayList2;
                                                this.f4915l = i17;
                                                this.f4916m = i14;
                                                this.f4917n = i39;
                                                this.f4918o = i19;
                                                this.f4919p = i16;
                                                this.f4920q = i12;
                                                C2325e c2325e = AbstractC0549l0.f1898a;
                                                int i40 = i16;
                                                obj3 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0850es(str4, this.f4927x, this.f4925v, 3000, i40, (InterfaceC2313c) null), this);
                                                enumC2465a3 = enumC2465a;
                                                if (obj3 == enumC2465a3) {
                                                    return enumC2465a3;
                                                }
                                                i27 = i39;
                                                i30 = i40;
                                                i26 = i19;
                                                interfaceC0516a05 = interfaceC0516a07;
                                                arrayList6 = arrayList;
                                                c1094mm = (C1094mm) obj3;
                                                int i41 = i17;
                                                i29 = i14;
                                                i28 = i41;
                                                i21 = i13;
                                                str6 = str4;
                                                i22 = 4;
                                                interfaceC0516a04 = interfaceC0516a05;
                                                enumC2465a2 = enumC2465a3;
                                                arrayList4 = arrayList6;
                                                arrayList5 = arrayList2;
                                                if (!c1094mm.f5962b) {
                                                }
                                                arrayList5.add(0, c1094mm);
                                                if (!z10) {
                                                }
                                                if (arrayList5.size() > i32) {
                                                }
                                                if (i27 <= 0) {
                                                }
                                                C1156om c1156om = (C1156om) c1701c0.getValue();
                                                AbstractC3367j.m5100e(arrayList4, "<this>");
                                                it = arrayList4.iterator();
                                                if (it.hasNext()) {
                                                }
                                                if (valueOf == null) {
                                                }
                                                m3054r0 = AbstractC1805m.m3054r0(arrayList4);
                                                if (m3054r0 == null) {
                                                }
                                                if (!arrayList4.isEmpty()) {
                                                }
                                                List m3035C0 = AbstractC1805m.m3035C0(arrayList5);
                                                String format = String.format(Locale.US, "%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf(100.0d * d8)}, 1));
                                                if (!z10) {
                                                }
                                                C1156om m2016a = C1156om.m2016a(c1156om, null, i27, i31, d8, d9, d10, m3040d0, m3035C0, "进度 " + str7 + "，丢包率 " + format, 65791);
                                                int i42 = i31;
                                                c1701c0.getClass();
                                                interfaceC2318h3 = null;
                                                c1701c0.m2752j(null, m2016a);
                                                if (i30 >= i29) {
                                                }
                                            } else {
                                                throw new RuntimeException();
                                            }
                                        } else {
                                            int i43 = i16;
                                            InterfaceC0516a0 interfaceC0516a08 = interfaceC0516a03;
                                            this.f4921r = interfaceC0516a08;
                                            this.f4912i = str4;
                                            this.f4913j = arrayList;
                                            this.f4914k = arrayList2;
                                            this.f4915l = i17;
                                            this.f4916m = i14;
                                            this.f4917n = i39;
                                            this.f4918o = i19;
                                            this.f4919p = i43;
                                            this.f4920q = i13;
                                            C2325e c2325e2 = AbstractC0549l0.f1898a;
                                            i20 = i43;
                                            String str9 = str4;
                                            i21 = i13;
                                            int i44 = i19;
                                            enumC2465a2 = enumC2465a;
                                            i22 = 4;
                                            obj2 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0073s(str9, this.f4909A, this.f4927x, c1001jm, i20, (InterfaceC2313c) null), this);
                                            if (obj2 != enumC2465a2) {
                                                i24 = i14;
                                                interfaceC0516a04 = interfaceC0516a08;
                                                i23 = i17;
                                                r10 = arrayList2;
                                                arrayList3 = arrayList;
                                                i25 = i39;
                                                i26 = i44;
                                                str5 = str9;
                                                c1094mm = (C1094mm) obj2;
                                                int i45 = i23;
                                                i27 = i25;
                                                arrayList4 = arrayList3;
                                                arrayList5 = r10;
                                                i28 = i45;
                                                String str10 = str5;
                                                i29 = i24;
                                                str6 = str10;
                                                i30 = i20;
                                                if (!c1094mm.f5962b) {
                                                    int i46 = i26 + 1;
                                                    d7 = 0.0d;
                                                    double d11 = c1094mm.f5963c;
                                                    if (d11 > 0.0d) {
                                                        i33 = i46;
                                                        arrayList4.add(new Double(d11));
                                                    } else {
                                                        i33 = i46;
                                                    }
                                                    i31 = i33;
                                                } else {
                                                    d7 = 0.0d;
                                                    i31 = i26;
                                                }
                                                arrayList5.add(0, c1094mm);
                                                if (!z10) {
                                                    i32 = 100;
                                                } else {
                                                    i32 = 10000;
                                                    if (i28 <= 10000) {
                                                        i32 = i28;
                                                    }
                                                }
                                                if (arrayList5.size() > i32) {
                                                    arrayList5.remove(AbstractC1806n.m3066N(arrayList5));
                                                }
                                                if (i27 <= 0) {
                                                    d8 = (i27 - i31) / i27;
                                                } else {
                                                    d8 = d7;
                                                }
                                                C1156om c1156om2 = (C1156om) c1701c0.getValue();
                                                AbstractC3367j.m5100e(arrayList4, "<this>");
                                                it = arrayList4.iterator();
                                                if (it.hasNext()) {
                                                    valueOf = null;
                                                } else {
                                                    double doubleValue = ((Number) it.next()).doubleValue();
                                                    while (it.hasNext()) {
                                                        doubleValue = Math.min(doubleValue, ((Number) it.next()).doubleValue());
                                                        it = it;
                                                    }
                                                    valueOf = Double.valueOf(doubleValue);
                                                }
                                                if (valueOf == null) {
                                                    d9 = valueOf.doubleValue();
                                                } else {
                                                    d9 = d7;
                                                }
                                                m3054r0 = AbstractC1805m.m3054r0(arrayList4);
                                                if (m3054r0 == null) {
                                                    d10 = m3054r0.doubleValue();
                                                } else {
                                                    d10 = d7;
                                                }
                                                if (!arrayList4.isEmpty()) {
                                                    m3040d0 = d7;
                                                } else {
                                                    m3040d0 = AbstractC1805m.m3040d0(arrayList4);
                                                }
                                                List m3035C02 = AbstractC1805m.m3035C0(arrayList5);
                                                String format2 = String.format(Locale.US, "%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf(100.0d * d8)}, 1));
                                                if (!z10) {
                                                    str7 = String.valueOf(i27);
                                                } else {
                                                    str7 = i27 + "/" + i28;
                                                }
                                                C1156om m2016a2 = C1156om.m2016a(c1156om2, null, i27, i31, d8, d9, d10, m3040d0, m3035C02, "进度 " + str7 + "，丢包率 " + format2, 65791);
                                                int i422 = i31;
                                                c1701c0.getClass();
                                                interfaceC2318h3 = null;
                                                c1701c0.m2752j(null, m2016a2);
                                                if (i30 >= i29) {
                                                    this.f4921r = interfaceC0516a04;
                                                    this.f4912i = str6;
                                                    this.f4913j = arrayList4;
                                                    this.f4914k = arrayList5;
                                                    this.f4915l = i28;
                                                    this.f4916m = i29;
                                                    this.f4917n = i27;
                                                    this.f4918o = i422;
                                                    this.f4919p = i30;
                                                    this.f4920q = 5;
                                                    if (AbstractC0525d0.m1131i(1000L, this) == enumC2465a2) {
                                                        return enumC2465a2;
                                                    }
                                                    InterfaceC0516a0 interfaceC0516a09 = interfaceC0516a04;
                                                    arrayList8 = arrayList4;
                                                    i36 = i27;
                                                    interfaceC0516a06 = interfaceC0516a09;
                                                    i35 = i422;
                                                    arrayList7 = arrayList5;
                                                    int i372 = i29;
                                                    i17 = i28;
                                                    i14 = i372;
                                                    interfaceC0516a03 = interfaceC0516a06;
                                                    arrayList = arrayList8;
                                                    ArrayList arrayList92 = arrayList7;
                                                    str4 = str6;
                                                    if (i30 != i14) {
                                                    }
                                                } else {
                                                    int i47 = i29;
                                                    i17 = i28;
                                                    i14 = i47;
                                                    arrayList = arrayList4;
                                                    i36 = i27;
                                                    interfaceC0516a03 = interfaceC0516a04;
                                                    i35 = i422;
                                                    arrayList92 = arrayList5;
                                                    str4 = str6;
                                                    if (i30 != i14) {
                                                    }
                                                }
                                            } else {
                                                return enumC2465a2;
                                            }
                                        }
                                    }
                                    interfaceC2318h3 = interfaceC2318h2;
                                }
                                atomicBoolean.set(false);
                                C1156om m2016a3 = C1156om.m2016a((C1156om) c1701c0.getValue(), null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, null, "已完成", 98302);
                                c1701c0.getClass();
                                c1701c0.m2752j(interfaceC2318h3, m2016a3);
                                return c1694m;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i30 = this.f4919p;
                        i26 = this.f4918o;
                        int i48 = this.f4917n;
                        int i49 = this.f4916m;
                        int i50 = this.f4915l;
                        ?? r102 = this.f4914k;
                        ?? r112 = this.f4913j;
                        String str11 = this.f4912i;
                        InterfaceC0516a0 interfaceC0516a010 = (InterfaceC0516a0) this.f4921r;
                        AbstractC1793a0.m2972L(obj);
                        atomicBoolean = atomicBoolean2;
                        interfaceC0516a05 = interfaceC0516a010;
                        z10 = z11;
                        enumC1125nm = enumC1125nm3;
                        arrayList2 = r102;
                        str4 = str11;
                        i14 = i49;
                        i17 = i50;
                        i13 = 3;
                        i27 = i48;
                        enumC2465a3 = enumC2465a4;
                        c1001jm = c1001jm2;
                        obj3 = obj;
                        arrayList6 = r112;
                        c1094mm = (C1094mm) obj3;
                        int i412 = i17;
                        i29 = i14;
                        i28 = i412;
                        i21 = i13;
                        str6 = str4;
                        i22 = 4;
                        interfaceC0516a04 = interfaceC0516a05;
                        enumC2465a2 = enumC2465a3;
                        arrayList4 = arrayList6;
                        arrayList5 = arrayList2;
                        if (!c1094mm.f5962b) {
                        }
                        arrayList5.add(0, c1094mm);
                        if (!z10) {
                        }
                        if (arrayList5.size() > i32) {
                        }
                        if (i27 <= 0) {
                        }
                        C1156om c1156om22 = (C1156om) c1701c0.getValue();
                        AbstractC3367j.m5100e(arrayList4, "<this>");
                        it = arrayList4.iterator();
                        if (it.hasNext()) {
                        }
                        if (valueOf == null) {
                        }
                        m3054r0 = AbstractC1805m.m3054r0(arrayList4);
                        if (m3054r0 == null) {
                        }
                        if (!arrayList4.isEmpty()) {
                        }
                        List m3035C022 = AbstractC1805m.m3035C0(arrayList5);
                        String format22 = String.format(Locale.US, "%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf(100.0d * d8)}, 1));
                        if (!z10) {
                        }
                        C1156om m2016a22 = C1156om.m2016a(c1156om22, null, i27, i31, d8, d9, d10, m3040d0, m3035C022, "进度 " + str7 + "，丢包率 " + format22, 65791);
                        int i4222 = i31;
                        c1701c0.getClass();
                        interfaceC2318h3 = null;
                        c1701c0.m2752j(null, m2016a22);
                        if (i30 >= i29) {
                        }
                    } else {
                        int i51 = this.f4919p;
                        i26 = this.f4918o;
                        i25 = this.f4917n;
                        i24 = this.f4916m;
                        i23 = this.f4915l;
                        r10 = this.f4914k;
                        ?? r113 = this.f4913j;
                        str5 = this.f4912i;
                        interfaceC0516a04 = (InterfaceC0516a0) this.f4921r;
                        AbstractC1793a0.m2972L(obj);
                        i20 = i51;
                        atomicBoolean = atomicBoolean2;
                        z10 = z11;
                        enumC1125nm = enumC1125nm3;
                        i22 = 4;
                        i21 = 3;
                        obj2 = obj;
                        enumC2465a2 = enumC2465a4;
                        c1001jm = c1001jm2;
                        arrayList3 = r113;
                        c1094mm = (C1094mm) obj2;
                        int i452 = i23;
                        i27 = i25;
                        arrayList4 = arrayList3;
                        arrayList5 = r10;
                        i28 = i452;
                        String str102 = str5;
                        i29 = i24;
                        str6 = str102;
                        i30 = i20;
                        if (!c1094mm.f5962b) {
                        }
                        arrayList5.add(0, c1094mm);
                        if (!z10) {
                        }
                        if (arrayList5.size() > i32) {
                        }
                        if (i27 <= 0) {
                        }
                        C1156om c1156om222 = (C1156om) c1701c0.getValue();
                        AbstractC3367j.m5100e(arrayList4, "<this>");
                        it = arrayList4.iterator();
                        if (it.hasNext()) {
                        }
                        if (valueOf == null) {
                        }
                        m3054r0 = AbstractC1805m.m3054r0(arrayList4);
                        if (m3054r0 == null) {
                        }
                        if (!arrayList4.isEmpty()) {
                        }
                        List m3035C0222 = AbstractC1805m.m3035C0(arrayList5);
                        String format222 = String.format(Locale.US, "%.1f%%", Arrays.copyOf(new Object[]{Double.valueOf(100.0d * d8)}, 1));
                        if (!z10) {
                        }
                        C1156om m2016a222 = C1156om.m2016a(c1156om222, null, i27, i31, d8, d9, d10, m3040d0, m3035C0222, "进度 " + str7 + "，丢包率 " + format222, 65791);
                        int i42222 = i31;
                        c1701c0.getClass();
                        interfaceC2318h3 = null;
                        c1701c0.m2752j(null, m2016a222);
                        if (i30 >= i29) {
                        }
                    }
                } else {
                    i7 = this.f4915l;
                    InterfaceC0516a0 interfaceC0516a011 = (InterfaceC0516a0) this.f4921r;
                    AbstractC1793a0.m2972L(obj);
                    interfaceC0516a02 = interfaceC0516a011;
                    z7 = false;
                    interfaceC2318h = null;
                    m1122A2 = obj;
                    str2 = (String) m1122A2;
                    i8 = i7;
                    i9 = this.f4928y;
                    if (i9 >= 1) {
                        i10 = 1;
                    } else {
                        i10 = i9;
                    }
                    if (!z11) {
                        i11 = Integer.MAX_VALUE;
                    } else {
                        i11 = i10;
                    }
                    InterfaceC0516a0 interfaceC0516a012 = interfaceC0516a02;
                    int i52 = i11;
                    enumC2465a = enumC2465a4;
                    atomicBoolean = atomicBoolean2;
                    c1001jm = c1001jm2;
                    AbstractC0525d0.m1141s(interfaceC0516a012, interfaceC2318h, new C0334d(c1001jm2, str2, this.f4910B, this.f4911C, (InterfaceC2313c) null, 16), 3);
                    ArrayList arrayList10 = new ArrayList();
                    ArrayList arrayList11 = new ArrayList();
                    boolean z12 = z7;
                    z8 = this.f4929z;
                    if (!z8) {
                        str3 = "持续 Ping 中...";
                    } else {
                        str3 = "Ping 中...";
                    }
                    String str12 = str3;
                    if (i8 == 0) {
                        z9 = true;
                    } else {
                        z9 = z12;
                    }
                    z10 = z11;
                    enumC1125nm = enumC1125nm3;
                    str4 = str2;
                    i12 = 4;
                    i13 = 3;
                    interfaceC2318h2 = interfaceC2318h;
                    C1156om c1156om3 = new C1156om(true, str8, str4, this.f4922s, this.f4925v, i10, z8, str12, z9, 32512);
                    c1701c0.getClass();
                    c1701c0.m2752j(interfaceC2318h2, c1156om3);
                    i14 = i52;
                    i15 = 1;
                    if (1 <= i14) {
                        arrayList = arrayList10;
                        arrayList2 = arrayList11;
                        i16 = 1;
                        i17 = i10;
                        i18 = 0;
                        interfaceC0516a03 = interfaceC0516a012;
                        i19 = 0;
                        if (atomicBoolean.get()) {
                            int i392 = i18 + i15;
                            ordinal = enumC1125nm.ordinal();
                            if (ordinal != 0) {
                            }
                        }
                    }
                    interfaceC2318h3 = interfaceC2318h2;
                    atomicBoolean.set(false);
                    C1156om m2016a32 = C1156om.m2016a((C1156om) c1701c0.getValue(), null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, null, "已完成", 98302);
                    c1701c0.getClass();
                    c1701c0.m2752j(interfaceC2318h3, m2016a32);
                    return c1694m;
                }
            } else {
                interfaceC0516a0 = (InterfaceC0516a0) this.f4921r;
                AbstractC1793a0.m2972L(obj);
                m1122A = obj;
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            interfaceC0516a0 = (InterfaceC0516a0) this.f4921r;
            if (enumC1125nm3 == enumC1125nm2) {
                this.f4921r = interfaceC0516a0;
                this.f4920q = 1;
                C2325e c2325e3 = AbstractC0549l0.f1898a;
                m1122A = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0990jb(2, null, 1), this);
            } else {
                interfaceC0516a02 = interfaceC0516a0;
                i7 = 1;
                if (enumC1125nm3 != enumC1125nm2 && i7 == 0) {
                    atomicBoolean2.set(false);
                    C1156om c1156om4 = new C1156om(false, str8, null, this.f4922s, this.f4925v, 0, false, "当前设备不支持系统 ICMP Ping，请改用 TCP Ping", false, 32716);
                    c1701c0.getClass();
                    c1701c0.m2752j(null, c1156om4);
                    return c1694m;
                }
                str = this.f4926w;
                if (str != null) {
                    if (AbstractC0444k.m937a0(str)) {
                        str = null;
                    }
                    if (str != null) {
                        str2 = str;
                        z7 = false;
                        interfaceC2318h = null;
                        i8 = i7;
                        i9 = this.f4928y;
                        if (i9 >= 1) {
                        }
                        if (!z11) {
                        }
                        InterfaceC0516a0 interfaceC0516a0122 = interfaceC0516a02;
                        int i522 = i11;
                        enumC2465a = enumC2465a4;
                        atomicBoolean = atomicBoolean2;
                        c1001jm = c1001jm2;
                        AbstractC0525d0.m1141s(interfaceC0516a0122, interfaceC2318h, new C0334d(c1001jm2, str2, this.f4910B, this.f4911C, (InterfaceC2313c) null, 16), 3);
                        ArrayList arrayList102 = new ArrayList();
                        ArrayList arrayList112 = new ArrayList();
                        boolean z122 = z7;
                        z8 = this.f4929z;
                        if (!z8) {
                        }
                        String str122 = str3;
                        if (i8 == 0) {
                        }
                        z10 = z11;
                        enumC1125nm = enumC1125nm3;
                        str4 = str2;
                        i12 = 4;
                        i13 = 3;
                        interfaceC2318h2 = interfaceC2318h;
                        C1156om c1156om32 = new C1156om(true, str8, str4, this.f4922s, this.f4925v, i10, z8, str122, z9, 32512);
                        c1701c0.getClass();
                        c1701c0.m2752j(interfaceC2318h2, c1156om32);
                        i14 = i522;
                        i15 = 1;
                        if (1 <= i14) {
                        }
                        interfaceC2318h3 = interfaceC2318h2;
                        atomicBoolean.set(false);
                        C1156om m2016a322 = C1156om.m2016a((C1156om) c1701c0.getValue(), null, 0, 0, 0.0d, 0.0d, 0.0d, 0.0d, null, "已完成", 98302);
                        c1701c0.getClass();
                        c1701c0.m2752j(interfaceC2318h3, m2016a322);
                        return c1694m;
                    }
                }
                this.f4921r = interfaceC0516a02;
                this.f4915l = i7;
                this.f4920q = 2;
                C2325e c2325e4 = AbstractC0549l0.f1898a;
                z7 = false;
                interfaceC2318h = null;
                m1122A2 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0940hm(str8, this.f4927x, null, 0), this);
            }
        }
        boolean booleanValue = ((Boolean) m1122A).booleanValue();
        interfaceC0516a02 = interfaceC0516a0;
        i7 = booleanValue ? 1 : 0;
        if (enumC1125nm3 != enumC1125nm2) {
        }
        str = this.f4926w;
        if (str != null) {
        }
        this.f4921r = interfaceC0516a02;
        this.f4915l = i7;
        this.f4920q = 2;
        C2325e c2325e42 = AbstractC0549l0.f1898a;
        z7 = false;
        interfaceC2318h = null;
        m1122A2 = AbstractC0525d0.m1122A(ExecutorC2324d.f13302g, new C0940hm(str8, this.f4927x, null, 0), this);
    }
}
