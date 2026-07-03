package p039e5;

import java.io.Closeable;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicLong;
import p001a0.AbstractC0094y0;
import p015b6.C0310q;
import p024c6.AbstractC0444k;
import p032d6.AbstractC0525d0;
import p032d6.InterfaceC0516a0;
import p053g5.C1687f;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p073j2.AbstractC2168e;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2587g;
import p098m5.AbstractC2590j;
import p099m6.AbstractC2602f0;
import p099m6.C2598d0;
import p099m6.C2625z;
import p100n.AbstractC2647h;
import p128q6.C3006i;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p158u5.C3374q;
import p158u5.C3377t;
import p158u5.C3378u;
import p158u5.C3379v;
import p195z5.C3881f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.x */
/* loaded from: classes.dex */
public final class C1412x extends AbstractC2590j implements InterfaceC3281e {

    /* renamed from: A */
    public final /* synthetic */ Map f8553A;

    /* renamed from: B */
    public final /* synthetic */ Set f8554B;

    /* renamed from: C */
    public final /* synthetic */ long f8555C;

    /* renamed from: D */
    public final /* synthetic */ C3378u f8556D;

    /* renamed from: E */
    public final /* synthetic */ C1040l f8557E;

    /* renamed from: F */
    public final /* synthetic */ AtomicLong f8558F;

    /* renamed from: G */
    public final /* synthetic */ long f8559G;

    /* renamed from: i */
    public AtomicLong f8560i;

    /* renamed from: j */
    public AtomicLong f8561j;

    /* renamed from: k */
    public C1102n f8562k;

    /* renamed from: l */
    public Object f8563l;

    /* renamed from: m */
    public C3379v f8564m;

    /* renamed from: n */
    public C3374q f8565n;

    /* renamed from: o */
    public C3377t f8566o;

    /* renamed from: p */
    public C3379v f8567p;

    /* renamed from: q */
    public C3379v f8568q;

    /* renamed from: r */
    public int f8569r;

    /* renamed from: s */
    public /* synthetic */ Object f8570s;

    /* renamed from: t */
    public final /* synthetic */ int f8571t;

    /* renamed from: u */
    public final /* synthetic */ List f8572u;

    /* renamed from: v */
    public final /* synthetic */ List f8573v;

    /* renamed from: w */
    public final /* synthetic */ C1071m f8574w;

    /* renamed from: x */
    public final /* synthetic */ Object f8575x;

    /* renamed from: y */
    public final /* synthetic */ C1196q0 f8576y;

    /* renamed from: z */
    public final /* synthetic */ C0800d9 f8577z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1412x(int i7, List list, List list2, C1071m c1071m, Object obj, C1196q0 c1196q0, C0800d9 c0800d9, Map map, Set set, long j6, C3378u c3378u, C1040l c1040l, AtomicLong atomicLong, long j7, InterfaceC2313c interfaceC2313c) {
        super(2, interfaceC2313c);
        this.f8571t = i7;
        this.f8572u = list;
        this.f8573v = list2;
        this.f8574w = c1071m;
        this.f8575x = obj;
        this.f8576y = c1196q0;
        this.f8577z = c0800d9;
        this.f8553A = map;
        this.f8554B = set;
        this.f8555C = j6;
        this.f8556D = c3378u;
        this.f8557E = c1040l;
        this.f8558F = atomicLong;
        this.f8559G = j7;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C1412x) mo28k((InterfaceC0516a0) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C1412x c1412x = new C1412x(this.f8571t, this.f8572u, this.f8573v, this.f8574w, this.f8575x, this.f8576y, this.f8577z, this.f8553A, this.f8554B, this.f8555C, this.f8556D, this.f8557E, this.f8558F, this.f8559G, interfaceC2313c);
        c1412x.f8570s = obj;
        return c1412x;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:148|149|150|151|152|153|(14:155|156|157|158|159|24a|180|181|2f7|192|(3:194|(1:196)|197)|198|119|(0))|21) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:38|(3:4d9|39|40)|331|78|80|81|82|83|(6:85|11|(0)|357|107|736)(2:86|87)) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x06c4, code lost:
    
        r1.f16449e++;
        r11 = 1;
        r41.f8576y.m2123W(r41.f8571t, r41.f8577z.f3340a, new p039e5.C1319u(r1, r11));
        r7 = r1.f16449e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x06e0, code lost:
    
        if (r7 <= 3) goto L297;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x06e2, code lost:
    
        r41.f8570s = r2;
        r41.f8560i = r14;
        r41.f8561j = r13;
        r41.f8562k = r3;
        r41.f8563l = r1;
        r41.f8564m = null;
        r41.f8565n = null;
        r41.f8566o = null;
        r41.f8567p = null;
        r41.f8568q = null;
        r41.f8569r = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0702, code lost:
    
        if (p032d6.AbstractC0525d0.m1131i(r7 * 500, r41) != r6) goto L300;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0705, code lost:
    
        r7 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x071a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x071b, code lost:
    
        r31 = true;
        r7 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x00f0, code lost:
    
        r8 = 0;
        r41.f8576y.m2123W(r41.f8571t, r41.f8577z.f3340a, new p039e5.C1319u(r0, r8));
        r7 = r42;
        r3 = r2;
        r13 = r15;
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0494, code lost:
    
        if (r0 == r6) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x01e6, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x01e7, code lost:
    
        r9 = r3;
        r3 = r9;
        r1 = r8;
        r4 = r1;
        r2 = r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:261:0x042e, code lost:
    
        r14.set(r0);
        r8 = r7;
        r7 = new java.lang.Object();
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x06c0, code lost:
    
        r8 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:380:0x00c9, code lost:
    
        if (p032d6.AbstractC0525d0.m1131i(r1, r41) == r6) goto L299;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x05f1, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x05f2, code lost:
    
        r1 = r42;
        r3 = r10;
        r2 = r29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x06bc, code lost:
    
        if (r3.m2011b().get() > r3.m2010a().get()) goto L291;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x06be, code lost:
    
        r8 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x06c2, code lost:
    
        if (r8 == false) goto L295;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0737 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0442  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x024b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03c8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x06aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v11, types: [u5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v51, types: [u5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v61 */
    /* JADX WARN: Type inference failed for: r1v71 */
    /* JADX WARN: Type inference failed for: r29v0 */
    /* JADX WARN: Type inference failed for: r29v1 */
    /* JADX WARN: Type inference failed for: r29v10 */
    /* JADX WARN: Type inference failed for: r29v12 */
    /* JADX WARN: Type inference failed for: r29v13 */
    /* JADX WARN: Type inference failed for: r29v14 */
    /* JADX WARN: Type inference failed for: r29v15 */
    /* JADX WARN: Type inference failed for: r29v17 */
    /* JADX WARN: Type inference failed for: r29v18 */
    /* JADX WARN: Type inference failed for: r29v20 */
    /* JADX WARN: Type inference failed for: r29v21 */
    /* JADX WARN: Type inference failed for: r29v22 */
    /* JADX WARN: Type inference failed for: r29v23 */
    /* JADX WARN: Type inference failed for: r29v24 */
    /* JADX WARN: Type inference failed for: r29v25 */
    /* JADX WARN: Type inference failed for: r29v26 */
    /* JADX WARN: Type inference failed for: r29v28 */
    /* JADX WARN: Type inference failed for: r29v30 */
    /* JADX WARN: Type inference failed for: r29v5 */
    /* JADX WARN: Type inference failed for: r29v6, types: [java.util.concurrent.atomic.AtomicLong] */
    /* JADX WARN: Type inference failed for: r29v8 */
    /* JADX WARN: Type inference failed for: r29v9 */
    /* JADX WARN: Type inference failed for: r4v31 */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v54, types: [java.lang.Number] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v28 */
    /* JADX WARN: Type inference failed for: r7v29, types: [d6.a0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v30 */
    /* JADX WARN: Type inference failed for: r7v31 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v41 */
    /* JADX WARN: Type inference failed for: r7v45 */
    /* JADX WARN: Type inference failed for: r7v57, types: [u5.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v58 */
    /* JADX WARN: Type inference failed for: r7v59, types: [u5.t] */
    /* JADX WARN: Type inference failed for: r7v61, types: [d6.a0] */
    /* JADX WARN: Type inference failed for: r7v63 */
    /* JADX WARN: Type inference failed for: r7v66 */
    /* JADX WARN: Type inference failed for: r7v67 */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.Object, u5.v] */
    /* JADX WARN: Type inference failed for: r9v10, types: [u5.q, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x0705 -> B:9:0x0034). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:304:0x05e3 -> B:11:0x042e). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        long j6;
        long j7;
        InterfaceC0516a0 interfaceC0516a0;
        C1102n c1102n;
        ?? r7;
        AtomicLong atomicLong;
        AtomicLong atomicLong2;
        ?? r29;
        C1102n c1102n2;
        InterfaceC0516a0 interfaceC0516a02;
        boolean z7;
        Object obj2;
        Throwable th;
        C1102n c1102n3;
        AtomicLong atomicLong3;
        InterfaceC0516a0 interfaceC0516a03;
        boolean z8;
        Object obj3;
        InterfaceC0516a0 interfaceC0516a04;
        boolean z9;
        Object obj4;
        C1102n c1102n4;
        C1195q c1195q;
        C3379v c3379v;
        C3374q c3374q;
        C3377t c3377t;
        C3379v c3379v2;
        Exception e7;
        C3379v c3379v3;
        final C3377t c3377t2;
        byte[] bArr;
        Throwable th2;
        Object obj5;
        long j8;
        Object obj6;
        Object obj7;
        AtomicLong atomicLong4;
        int i7;
        C1102n c1102n5;
        C3379v c3379v4;
        Object obj8;
        boolean z10;
        InterfaceC0516a0 interfaceC0516a05;
        ?? obj9;
        C1102n m2099f;
        Object obj10;
        C1195q c1195q2;
        Object obj11;
        Integer num;
        long j9;
        boolean z11;
        final ?? r12;
        InterfaceC0516a0 interfaceC0516a06;
        C3377t c3377t3;
        Object obj12;
        Closeable closeable;
        C0800d9 c0800d9;
        Object obj13;
        C1040l c1040l;
        C1196q0 c1196q0;
        AtomicLong atomicLong5;
        long j10;
        ?? r42;
        Throwable th3;
        boolean z12;
        C1196q0 c1196q02;
        boolean z13;
        InputStream m4147b;
        ?? r43;
        Throwable th4;
        int read;
        C1687f c1687f;
        byte[] bArr2;
        C1040l c1040l2;
        long j11;
        final long j12;
        final long j13;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        int i8 = this.f8569r;
        boolean z14 = true;
        try {
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 != 3) {
                            if (i8 == 4) {
                                C3377t c3377t4 = (C3377t) this.f8563l;
                                c1102n = this.f8562k;
                                AtomicLong atomicLong6 = this.f8561j;
                                AtomicLong atomicLong7 = this.f8560i;
                                InterfaceC0516a0 interfaceC0516a07 = (InterfaceC0516a0) this.f8570s;
                                AbstractC1793a0.m2972L(obj);
                                atomicLong = atomicLong7;
                                atomicLong2 = atomicLong6;
                                j6 = 1;
                                j7 = 0;
                                obj9 = c3377t4;
                                interfaceC0516a05 = interfaceC0516a07;
                                c1102n2 = c1102n;
                                C1196q0 c1196q03 = this.f8576y;
                                C0800d9 c0800d92 = this.f8577z;
                                String str = c0800d92.f3340a;
                                int i9 = this.f8571t;
                                c1196q03.m2123W(i9, str, new C1381w(c1196q03, c0800d92, i9, (C3377t) obj9));
                                if (c1102n2.m2011b().get() > c1102n2.m2010a().get() && AbstractC0525d0.m1139q(interfaceC0516a05)) {
                                    try {
                                        try {
                                        } catch (Exception e8) {
                                            e = e8;
                                            z11 = false;
                                            r12 = obj9;
                                            interfaceC0516a07 = interfaceC0516a05;
                                            c1102n = c1102n2;
                                            synchronized (this.f8575x) {
                                            }
                                        }
                                        final C1196q0 c1196q04 = this.f8576y;
                                        final C0800d9 c0800d93 = this.f8577z;
                                        int i10 = this.f8571t;
                                        int i11 = obj9.f16449e + i10;
                                        C0885g c0885g = new C0885g(c1196q04, c0800d93, i10, 1);
                                        InterfaceC3277a interfaceC3277a = new InterfaceC3277a(c1196q04, c0800d93, j12, j13) { // from class: e5.v

                                            /* renamed from: e */
                                            public final /* synthetic */ C0800d9 f8029e;

                                            /* renamed from: f */
                                            public final /* synthetic */ long f8030f;

                                            /* renamed from: g */
                                            public final /* synthetic */ long f8031g;

                                            {
                                                this.f8029e = c0800d93;
                                                this.f8030f = j12;
                                                this.f8031g = j13;
                                            }

                                            @Override // p150t5.InterfaceC3277a
                                            /* renamed from: a */
                                            public final Object mo52a() {
                                                C0800d9 c0800d94 = this.f8029e;
                                                C2625z m2088L = C1196q0.m2088L(c0800d94, c0800d94.f3341b);
                                                m2088L.m4191c("Range", "bytes=" + this.f8030f + "-" + this.f8031g);
                                                m2088L.m4190b();
                                                return m2088L.m4189a();
                                            }
                                        };
                                        this.f8570s = interfaceC0516a05;
                                        this.f8560i = atomicLong;
                                        this.f8561j = atomicLong2;
                                        this.f8562k = c1102n2;
                                        this.f8563l = obj9;
                                        this.f8564m = null;
                                        this.f8565n = null;
                                        this.f8566o = null;
                                        this.f8567p = null;
                                        this.f8568q = null;
                                        this.f8569r = 3;
                                        obj12 = c1196q04.m2128o(c0800d93, i11, c0885g, interfaceC3277a, this);
                                        c3377t3 = obj9;
                                        interfaceC0516a06 = interfaceC0516a05;
                                    } catch (Throwable th5) {
                                        th = th5;
                                        z7 = false;
                                        obj2 = obj9;
                                        interfaceC0516a02 = interfaceC0516a05;
                                        c1102n3 = c1102n2;
                                        atomicLong3 = atomicLong2;
                                        obj3 = obj2;
                                        z8 = z7;
                                        interfaceC0516a03 = interfaceC0516a02;
                                        try {
                                            this.f8576y.m2116J(this.f8577z.f3340a, this.f8571t, null);
                                            throw th;
                                        } catch (Exception e9) {
                                            e = e9;
                                            atomicLong2 = atomicLong3;
                                            c1102n = c1102n3;
                                            interfaceC0516a07 = interfaceC0516a03;
                                            r12 = obj3;
                                            z11 = z8;
                                            synchronized (this.f8575x) {
                                            }
                                        }
                                    }
                                    j12 = c1102n2.m2011b().get();
                                    j13 = c1102n2.m2010a().get();
                                } else {
                                    boolean z15 = true;
                                    r7 = interfaceC0516a05;
                                    c1102n = c1102n2;
                                    obj11 = this.f8575x;
                                    Map map = this.f8553A;
                                    C1071m c1071m = this.f8574w;
                                    synchronized (obj11) {
                                        num = (Integer) map.remove(AbstractC2587g.m4119a(c1102n.f6127a));
                                        if (c1102n.m2010a().get() >= c1102n.f6128b.get()) {
                                            c1071m.f5751b.add(new C3881f(c1102n.f6128b.get(), c1102n.m2010a().get()));
                                            j9 = j7;
                                            c1102n.f6128b.set(j9);
                                            c1102n.m2010a().set(-1L);
                                            c1102n.m2011b().set(j9);
                                        } else {
                                            j9 = j7;
                                        }
                                    }
                                    if (num != null) {
                                        C1196q0 c1196q05 = this.f8576y;
                                        C0800d9 c0800d94 = this.f8577z;
                                        int intValue = num.intValue();
                                        String str2 = c0800d94.f3340a;
                                        C3006i c3006i = (C3006i) c1196q05.f6969h.remove(str2 + ":" + intValue);
                                        if (c3006i != null) {
                                            c3006i.m4680d();
                                        }
                                    }
                                    j7 = j9;
                                    z14 = z15;
                                    if (AbstractC0525d0.m1139q(r7)) {
                                        synchronized (this.f8575x) {
                                            if (c1102n.f6129c.get() >= c1102n.f6130d.get()) {
                                                z10 = z14;
                                            } else {
                                                z10 = false;
                                            }
                                        }
                                        if (!z10) {
                                            Object obj14 = this.f8575x;
                                            C1196q0 c1196q06 = this.f8576y;
                                            C0800d9 c0800d95 = this.f8577z;
                                            C1071m c1071m2 = this.f8574w;
                                            synchronized (obj14) {
                                                m2099f = C1196q0.m2099f(c1196q06, c0800d95.f3340a, c1071m2, c1102n);
                                            }
                                            if (m2099f == null) {
                                                Object obj15 = this.f8575x;
                                                C1196q0 c1196q07 = this.f8576y;
                                                C1071m c1071m3 = this.f8574w;
                                                Map map2 = this.f8553A;
                                                Set set = this.f8554B;
                                                C0800d9 c0800d96 = this.f8577z;
                                                long j14 = this.f8555C;
                                                C3378u c3378u = this.f8556D;
                                                int i12 = this.f8571t;
                                                synchronized (obj15) {
                                                    try {
                                                        try {
                                                            C1102n c1102n6 = c1102n;
                                                            C1195q m2102i = C1196q0.m2102i(c1196q07, c1071m3, c1102n6, map2, set, c0800d96.f3350k, j14 - c3378u.f16450e);
                                                            c1102n4 = c1102n6;
                                                            if (m2102i != null) {
                                                                map2.put(new Integer(m2102i.f6957a.f6127a), new Integer(i12));
                                                                set.add(m2102i.m2085a());
                                                                c3378u.f16450e = (m2102i.f6959c - m2102i.f6958b) + j6 + c3378u.f16450e;
                                                                c1195q2 = m2102i;
                                                            } else {
                                                                c1195q2 = null;
                                                            }
                                                            if (c1195q2 != null) {
                                                                this.f8576y.m2123W(this.f8571t, this.f8577z.f3340a, new C0310q(3, c1195q2));
                                                                ?? obj16 = new Object();
                                                                ?? obj17 = new Object();
                                                                ?? obj18 = new Object();
                                                                try {
                                                                    try {
                                                                    } catch (Exception e10) {
                                                                        e7 = e10;
                                                                    }
                                                                    C1196q0 c1196q08 = this.f8576y;
                                                                    C0800d9 c0800d97 = this.f8577z;
                                                                    int i13 = this.f8571t;
                                                                    C0853f c0853f = new C0853f(atomicLong2, 1);
                                                                    this.f8570s = r7;
                                                                    this.f8560i = atomicLong;
                                                                    this.f8561j = atomicLong2;
                                                                    this.f8562k = c1102n4;
                                                                    this.f8563l = c1195q2;
                                                                    this.f8564m = obj16;
                                                                    this.f8565n = obj17;
                                                                    this.f8566o = obj18;
                                                                    this.f8567p = obj16;
                                                                    this.f8568q = obj16;
                                                                    this.f8569r = 2;
                                                                    obj8 = C1196q0.m2097d(c1196q08, c0800d97, i13, c1195q2, c0853f, this);
                                                                    if (obj8 != enumC2465a) {
                                                                        c1195q = c1195q2;
                                                                        c3374q = obj17;
                                                                        c3379v2 = obj16;
                                                                        c3379v = c3379v2;
                                                                        c3377t = obj18;
                                                                        r7 = r7;
                                                                        c3379v4 = obj16;
                                                                        try {
                                                                        } catch (Exception e11) {
                                                                            e7 = e11;
                                                                            C1196q0.m2107x("tail_hedge_failed task=" + AbstractC0444k.m955s0(this.f8577z.f3340a, 8) + " worker=" + this.f8571t + " donor=" + c1195q.f6957a.f6127a + " error=" + e7.getMessage());
                                                                            c3379v3 = c3379v2;
                                                                            c3377t2 = c3377t;
                                                                            bArr = null;
                                                                            obj6 = r7;
                                                                            c3379v3.f16451e = bArr;
                                                                            obj7 = this.f8575x;
                                                                            C1196q0 c1196q09 = this.f8576y;
                                                                            C1040l c1040l3 = this.f8557E;
                                                                            C1071m c1071m4 = this.f8574w;
                                                                            AtomicLong atomicLong8 = this.f8558F;
                                                                            obj = obj6;
                                                                            long j15 = this.f8559G;
                                                                            synchronized (obj7) {
                                                                            }
                                                                        }
                                                                        C3377t c3377t5 = c3377t;
                                                                        bArr = (byte[]) obj8;
                                                                        c3377t2 = c3377t5;
                                                                        obj6 = r7;
                                                                        c3379v3 = c3379v4;
                                                                        c3379v3.f16451e = bArr;
                                                                        obj7 = this.f8575x;
                                                                        C1196q0 c1196q092 = this.f8576y;
                                                                        C1040l c1040l32 = this.f8557E;
                                                                        C1071m c1071m42 = this.f8574w;
                                                                        AtomicLong atomicLong82 = this.f8558F;
                                                                        obj = obj6;
                                                                        long j152 = this.f8559G;
                                                                        synchronized (obj7) {
                                                                            if (c3379v.f16451e != null && !c1195q.f6957a.f6131e.get()) {
                                                                                C1102n c1102n7 = c1195q.f6957a;
                                                                                long j16 = c1102n7.f6128b.get();
                                                                                long j17 = c1102n7.f6129c.get();
                                                                                if (j17 >= j16 && j17 >= c1195q.f6958b && c1102n7.f6130d.get() <= c1195q.f6959c) {
                                                                                    long m3531r = AbstractC2168e.m3531r(c1195q.f6957a.f6130d.get(), c1195q.f6958b, c1195q.f6959c);
                                                                                    long j18 = c1195q.f6959c;
                                                                                    if (m3531r <= j18) {
                                                                                        int i14 = (int) (m3531r - c1195q.f6958b);
                                                                                        int i15 = (int) ((j18 - m3531r) + j6);
                                                                                        r29 = atomicLong82;
                                                                                        atomicLong4 = atomicLong2;
                                                                                        c1195q.f6957a.f6129c.set(m3531r - j6);
                                                                                        c1040l32.m1634b(m3531r, (byte[]) c3379v.f16451e, i14, i15);
                                                                                        i7 = i15;
                                                                                        c1071m42.f5751b.add(new C3881f(m3531r, c1195q.f6959c));
                                                                                        C1196q0.m2094a(c1196q092, r29, i7, j152);
                                                                                        c3374q.f16446e = true;
                                                                                    }
                                                                                }
                                                                            }
                                                                            atomicLong4 = atomicLong2;
                                                                            i7 = 0;
                                                                        }
                                                                        c3377t2.f16449e = i7;
                                                                        Object obj19 = this.f8575x;
                                                                        Map map3 = this.f8553A;
                                                                        int i16 = this.f8571t;
                                                                        C3378u c3378u2 = this.f8556D;
                                                                        synchronized (obj19) {
                                                                            try {
                                                                                Integer num2 = (Integer) map3.get(new Integer(c1195q.f6957a.f6127a));
                                                                                if (num2 != null && num2.intValue() == i16) {
                                                                                    map3.remove(new Integer(c1195q.f6957a.f6127a));
                                                                                }
                                                                                c1102n5 = c1102n4;
                                                                                long j19 = c3378u2.f16450e - ((c1195q.f6959c - c1195q.f6958b) + j6);
                                                                                if (j19 < j7) {
                                                                                    j19 = j7;
                                                                                }
                                                                                c3378u2.f16450e = j19;
                                                                            } catch (Throwable th6) {
                                                                                throw th6;
                                                                            }
                                                                        }
                                                                        if (c3374q.f16446e) {
                                                                            C1196q0 c1196q010 = this.f8576y;
                                                                            String str3 = this.f8577z.f3340a;
                                                                            int i17 = c1195q.f6957a.f6127a;
                                                                            C3006i c3006i2 = (C3006i) c1196q010.f6969h.remove(str3 + ":" + i17);
                                                                            if (c3006i2 != null) {
                                                                                c3006i2.m4680d();
                                                                            }
                                                                            C1196q0.m2106w("tail_hedge_won task=" + AbstractC0444k.m955s0(this.f8577z.f3340a, 8) + " worker=" + this.f8571t + " donor=" + c1195q.f6957a.f6127a + " bytes=" + c3377t2.f16449e);
                                                                        }
                                                                        final int i18 = 0;
                                                                        this.f8576y.m2123W(this.f8571t, this.f8577z.f3340a, new InterfaceC3279c() { // from class: e5.u
                                                                            @Override // p150t5.InterfaceC3279c
                                                                            /* renamed from: f */
                                                                            public final Object mo23f(Object obj20) {
                                                                                String str4;
                                                                                switch (i18) {
                                                                                    case 0:
                                                                                        C0831e9 c0831e9 = (C0831e9) obj20;
                                                                                        if (c3377t2.f16449e > 0) {
                                                                                            str4 = "尾段竞速完成";
                                                                                        } else {
                                                                                            str4 = "尾段已由原线程完成";
                                                                                        }
                                                                                        return C0831e9.m1519a(c0831e9, 0L, 0L, 0L, 0L, null, str4, 47);
                                                                                    default:
                                                                                        return C0831e9.m1519a((C0831e9) obj20, 0L, 0L, 0L, 0L, null, AbstractC2647h.m4256b("重试 ", c3377t2.f16449e), 63);
                                                                                }
                                                                            }
                                                                        });
                                                                        r7 = obj;
                                                                        c1102n = c1102n5;
                                                                        atomicLong2 = atomicLong4;
                                                                        z14 = true;
                                                                        if (AbstractC0525d0.m1139q(r7)) {
                                                                        }
                                                                    }
                                                                    return enumC2465a;
                                                                } catch (Throwable th7) {
                                                                    th2 = th7;
                                                                    c1195q = c1195q2;
                                                                    obj5 = this.f8575x;
                                                                    Map map4 = this.f8553A;
                                                                    int i19 = this.f8571t;
                                                                    C3378u c3378u3 = this.f8556D;
                                                                    synchronized (obj5) {
                                                                        try {
                                                                            Integer num3 = (Integer) map4.get(new Integer(c1195q.f6957a.f6127a));
                                                                            if (num3 != null && num3.intValue() == i19) {
                                                                                map4.remove(new Integer(c1195q.f6957a.f6127a));
                                                                            }
                                                                            long j20 = c3378u3.f16450e - ((c1195q.f6959c - c1195q.f6958b) + j6);
                                                                            if (j20 < j7) {
                                                                                j8 = j7;
                                                                            } else {
                                                                                j8 = j20;
                                                                            }
                                                                            c3378u3.f16450e = j8;
                                                                        } catch (Throwable th8) {
                                                                            throw th8;
                                                                        }
                                                                    }
                                                                    throw th2;
                                                                }
                                                            }
                                                        } catch (Throwable th9) {
                                                            th = th9;
                                                            throw th;
                                                        }
                                                        obj10 = obj15;
                                                    } catch (Throwable th10) {
                                                        th = th10;
                                                        obj10 = obj15;
                                                    }
                                                }
                                            }
                                        }
                                        c1102n2 = c1102n;
                                        long j21 = c1102n2.f6130d.get() - c1102n2.f6128b.get();
                                        if (j21 < j7) {
                                        }
                                        atomicLong.set(j7);
                                        interfaceC0516a05 = r7;
                                        obj9 = new Object();
                                        if (c1102n2.m2011b().get() > c1102n2.m2010a().get()) {
                                        }
                                        boolean z152 = true;
                                        r7 = interfaceC0516a05;
                                        c1102n = c1102n2;
                                        obj11 = this.f8575x;
                                        Map map5 = this.f8553A;
                                        C1071m c1071m5 = this.f8574w;
                                        synchronized (obj11) {
                                        }
                                    }
                                    return C1694m.f10482a;
                                }
                            } else {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                        } else {
                            C3377t c3377t6 = (C3377t) this.f8563l;
                            c1102n3 = this.f8562k;
                            atomicLong3 = this.f8561j;
                            AtomicLong atomicLong9 = this.f8560i;
                            InterfaceC0516a0 interfaceC0516a08 = (InterfaceC0516a0) this.f8570s;
                            try {
                                AbstractC1793a0.m2972L(obj);
                                obj12 = obj;
                                c3377t3 = c3377t6;
                                c1102n2 = c1102n3;
                                atomicLong2 = atomicLong3;
                                atomicLong = atomicLong9;
                                interfaceC0516a06 = interfaceC0516a08;
                                j6 = 1;
                                j7 = 0;
                                try {
                                    try {
                                        try {
                                            C2598d0 c2598d0 = (C2598d0) closeable;
                                            C1040l c1040l4 = c1040l;
                                            int i20 = c2598d0.f14059h;
                                            if (i20 != 200) {
                                                if (i20 == 206) {
                                                    try {
                                                        AbstractC2602f0 abstractC2602f0 = c2598d0.f14062k;
                                                        if (abstractC2602f0 != null) {
                                                            try {
                                                                try {
                                                                    byte[] bArr3 = new byte[AbstractC2168e.m3530q(c0800d9.f3349j, 8, 1024) * 1024];
                                                                    m4147b = abstractC2602f0.m4147b();
                                                                    Object obj20 = c3377t3;
                                                                    InterfaceC0516a0 interfaceC0516a09 = interfaceC0516a06;
                                                                    while (AbstractC0525d0.m1139q(interfaceC0516a09) && (read = m4147b.read(bArr3)) >= 0) {
                                                                        try {
                                                                            synchronized (obj13) {
                                                                                try {
                                                                                    try {
                                                                                        try {
                                                                                            long j22 = c1102n2.m2011b().get();
                                                                                            long j23 = (c1102n2.m2010a().get() - j22) + j6;
                                                                                            if (j23 < j7) {
                                                                                                j23 = j7;
                                                                                            }
                                                                                            long j24 = j10;
                                                                                            long j25 = read;
                                                                                            if (j23 <= j25) {
                                                                                                j25 = j23;
                                                                                            }
                                                                                            int i21 = (int) j25;
                                                                                            if (i21 > 0 && c1102n2.f6131e.compareAndSet(false, true)) {
                                                                                                c1687f = new C1687f(new Long(j22), AbstractC2587g.m4119a(i21));
                                                                                            } else {
                                                                                                c1687f = null;
                                                                                            }
                                                                                            if (c1687f == null) {
                                                                                                break;
                                                                                            }
                                                                                            try {
                                                                                                try {
                                                                                                    try {
                                                                                                        long longValue = ((Number) c1687f.f10471e).longValue();
                                                                                                        r43 = (Number) c1687f.f10472f;
                                                                                                        int intValue2 = r43.intValue();
                                                                                                        c1040l4.m1634b(longValue, bArr2, 0, intValue2);
                                                                                                        long j26 = intValue2;
                                                                                                        c1102n2.m2011b().addAndGet(j26);
                                                                                                        long j27 = c1102n2.m2011b().get() - c1102n2.f6128b.get();
                                                                                                        if (j27 < j7) {
                                                                                                            j11 = j7;
                                                                                                        } else {
                                                                                                            j11 = j27;
                                                                                                        }
                                                                                                        atomicLong.set(j11);
                                                                                                        c1102n2.f6131e.set(false);
                                                                                                        if (intValue2 <= 0) {
                                                                                                            break;
                                                                                                        }
                                                                                                        atomicLong2.addAndGet(j26);
                                                                                                        AtomicLong atomicLong10 = atomicLong5;
                                                                                                        C1196q0 c1196q011 = c1196q02;
                                                                                                        C1196q0.m2094a(c1196q011, atomicLong10, j26, j24);
                                                                                                        obj20 = obj;
                                                                                                        c1196q02 = c1196q011;
                                                                                                        atomicLong5 = atomicLong10;
                                                                                                        interfaceC0516a09 = r29;
                                                                                                        j10 = j24;
                                                                                                        c1040l4 = c1040l2;
                                                                                                        bArr3 = bArr2;
                                                                                                    } catch (Throwable th11) {
                                                                                                        th = th11;
                                                                                                        th4 = th;
                                                                                                        z13 = r43;
                                                                                                        try {
                                                                                                            throw th4;
                                                                                                        } catch (Throwable th12) {
                                                                                                            AbstractC2168e.m3526m(m4147b, th4);
                                                                                                            throw th12;
                                                                                                        }
                                                                                                    }
                                                                                                } catch (Throwable th13) {
                                                                                                    th4 = th13;
                                                                                                    z13 = false;
                                                                                                    throw th4;
                                                                                                }
                                                                                                c1040l2 = c1040l4;
                                                                                            } catch (Throwable th14) {
                                                                                                c1102n2.f6131e.set(false);
                                                                                                throw th14;
                                                                                            }
                                                                                            bArr2 = bArr3;
                                                                                        } catch (Throwable th15) {
                                                                                            th = th15;
                                                                                            throw th;
                                                                                        }
                                                                                        obj = obj20;
                                                                                        r29 = interfaceC0516a09;
                                                                                    } catch (Throwable th16) {
                                                                                        th = th16;
                                                                                        r43 = 0;
                                                                                        th4 = th;
                                                                                        z13 = r43;
                                                                                        throw th4;
                                                                                    }
                                                                                } catch (Throwable th17) {
                                                                                    th = th17;
                                                                                }
                                                                            }
                                                                        } catch (Throwable th18) {
                                                                            th = th18;
                                                                            obj = obj20;
                                                                            r29 = interfaceC0516a09;
                                                                        }
                                                                    }
                                                                    obj = obj20;
                                                                    r29 = interfaceC0516a09;
                                                                    AbstractC2168e.m3526m(closeable, null);
                                                                    this.f8576y.m2116J(this.f8577z.f3340a, this.f8571t, null);
                                                                    if (c1102n2.m2011b().get() > c1102n2.m2010a().get()) {
                                                                        obj9 = obj;
                                                                        interfaceC0516a05 = r29;
                                                                        if (c1102n2.m2011b().get() > c1102n2.m2010a().get()) {
                                                                        }
                                                                        boolean z1522 = true;
                                                                        r7 = interfaceC0516a05;
                                                                        c1102n = c1102n2;
                                                                        obj11 = this.f8575x;
                                                                        Map map52 = this.f8553A;
                                                                        C1071m c1071m52 = this.f8574w;
                                                                        synchronized (obj11) {
                                                                        }
                                                                    } else {
                                                                        throw new IllegalStateException("分片提前结束");
                                                                    }
                                                                } catch (Throwable th19) {
                                                                    th = th19;
                                                                    obj4 = obj;
                                                                    c1102n3 = c1102n2;
                                                                    atomicLong3 = atomicLong2;
                                                                    interfaceC0516a04 = r29;
                                                                    obj3 = obj4;
                                                                    z8 = z9;
                                                                    interfaceC0516a03 = interfaceC0516a04;
                                                                    this.f8576y.m2116J(this.f8577z.f3340a, this.f8571t, null);
                                                                    throw th;
                                                                }
                                                                AbstractC2168e.m3526m(m4147b, null);
                                                            } catch (Throwable th20) {
                                                                th = th20;
                                                                th3 = th;
                                                                z12 = z13;
                                                                try {
                                                                    throw th3;
                                                                } catch (Throwable th21) {
                                                                    try {
                                                                        AbstractC2168e.m3526m(closeable, th3);
                                                                        throw th21;
                                                                    } catch (Throwable th22) {
                                                                        th = th22;
                                                                        obj3 = obj;
                                                                        c1102n3 = c1102n2;
                                                                        atomicLong3 = atomicLong2;
                                                                        interfaceC0516a03 = r29;
                                                                        z8 = z12;
                                                                        this.f8576y.m2116J(this.f8577z.f3340a, this.f8571t, null);
                                                                        throw th;
                                                                    }
                                                                }
                                                            }
                                                            z13 = false;
                                                            z11 = false;
                                                            z9 = false;
                                                        } else {
                                                            throw new IllegalStateException("服务器未返回内容");
                                                        }
                                                    } catch (Throwable th23) {
                                                        th = th23;
                                                        obj = c3377t3;
                                                        r29 = interfaceC0516a06;
                                                        z13 = false;
                                                    }
                                                } else {
                                                    throw new IllegalStateException(("分片请求返回 HTTP " + c2598d0.f14059h).toString());
                                                }
                                            } else {
                                                throw new Exception(AbstractC0094y0.m184k(c2598d0.f14059h, "服务器停止支持分片下载（HTTP ", "）"));
                                            }
                                        } catch (Throwable th24) {
                                            th = th24;
                                            obj = c3377t3;
                                            r29 = interfaceC0516a06;
                                            r42 = 0;
                                        }
                                        closeable = (Closeable) obj12;
                                        c0800d9 = this.f8577z;
                                        obj13 = this.f8575x;
                                        c1040l = this.f8557E;
                                        c1196q0 = this.f8576y;
                                        atomicLong5 = this.f8558F;
                                        j10 = this.f8559G;
                                    } catch (Throwable th25) {
                                        th = th25;
                                        obj = c3377t3;
                                        r29 = interfaceC0516a06;
                                        z7 = false;
                                        obj2 = obj;
                                        interfaceC0516a02 = interfaceC0516a06;
                                        c1102n3 = c1102n2;
                                        atomicLong3 = atomicLong2;
                                        obj3 = obj2;
                                        z8 = z7;
                                        interfaceC0516a03 = interfaceC0516a02;
                                        this.f8576y.m2116J(this.f8577z.f3340a, this.f8571t, null);
                                        throw th;
                                    }
                                } catch (Throwable th26) {
                                    th = th26;
                                    th3 = th;
                                    z12 = r42;
                                    throw th3;
                                }
                                c1196q02 = c1196q0;
                                r42 = 200;
                            } catch (Throwable th27) {
                                th = th27;
                                atomicLong = atomicLong9;
                                interfaceC0516a04 = interfaceC0516a08;
                                z9 = false;
                                j6 = 1;
                                j7 = 0;
                                obj4 = c3377t6;
                                obj3 = obj4;
                                z8 = z9;
                                interfaceC0516a03 = interfaceC0516a04;
                                this.f8576y.m2116J(this.f8577z.f3340a, this.f8571t, null);
                                throw th;
                            }
                        }
                    } else {
                        C3379v c3379v5 = this.f8568q;
                        c3379v2 = this.f8567p;
                        c3377t = this.f8566o;
                        c3374q = this.f8565n;
                        c3379v = this.f8564m;
                        j6 = 1;
                        c1195q = (C1195q) this.f8563l;
                        c1102n4 = this.f8562k;
                        j7 = 0;
                        atomicLong2 = this.f8561j;
                        atomicLong = this.f8560i;
                        r7 = (InterfaceC0516a0) this.f8570s;
                        try {
                            try {
                                AbstractC1793a0.m2972L(obj);
                                c3379v4 = c3379v5;
                                obj8 = obj;
                                r7 = r7;
                            } catch (Exception e12) {
                                e7 = e12;
                                C1196q0.m2107x("tail_hedge_failed task=" + AbstractC0444k.m955s0(this.f8577z.f3340a, 8) + " worker=" + this.f8571t + " donor=" + c1195q.f6957a.f6127a + " error=" + e7.getMessage());
                                c3379v3 = c3379v2;
                                c3377t2 = c3377t;
                                bArr = null;
                                obj6 = r7;
                                c3379v3.f16451e = bArr;
                                obj7 = this.f8575x;
                                C1196q0 c1196q0922 = this.f8576y;
                                C1040l c1040l322 = this.f8557E;
                                C1071m c1071m422 = this.f8574w;
                                AtomicLong atomicLong822 = this.f8558F;
                                obj = obj6;
                                long j1522 = this.f8559G;
                                synchronized (obj7) {
                                }
                            }
                            C3377t c3377t52 = c3377t;
                            bArr = (byte[]) obj8;
                            c3377t2 = c3377t52;
                            obj6 = r7;
                            c3379v3 = c3379v4;
                            c3379v3.f16451e = bArr;
                            obj7 = this.f8575x;
                            C1196q0 c1196q09222 = this.f8576y;
                            C1040l c1040l3222 = this.f8557E;
                            C1071m c1071m4222 = this.f8574w;
                            AtomicLong atomicLong8222 = this.f8558F;
                            obj = obj6;
                            long j15222 = this.f8559G;
                            synchronized (obj7) {
                            }
                        } catch (Throwable th28) {
                            th2 = th28;
                            obj5 = this.f8575x;
                            Map map42 = this.f8553A;
                            int i192 = this.f8571t;
                            C3378u c3378u32 = this.f8556D;
                            synchronized (obj5) {
                            }
                        }
                    }
                } else {
                    j6 = 1;
                    j7 = 0;
                    interfaceC0516a0 = (InterfaceC0516a0) this.f8570s;
                    AbstractC1793a0.m2972L(obj);
                }
            } else {
                j6 = 1;
                j7 = 0;
                AbstractC1793a0.m2972L(obj);
                interfaceC0516a0 = (InterfaceC0516a0) this.f8570s;
                long j28 = this.f8571t * 5;
                if (j28 > 2000) {
                    j28 = 2000;
                }
                this.f8570s = interfaceC0516a0;
                this.f8569r = 1;
            }
            AtomicLong atomicLong11 = (AtomicLong) this.f8572u.get(this.f8571t);
            AtomicLong atomicLong12 = (AtomicLong) this.f8573v.get(this.f8571t);
            c1102n = (C1102n) this.f8574w.f5750a.get(this.f8571t);
            r7 = interfaceC0516a0;
            atomicLong = atomicLong11;
            atomicLong2 = atomicLong12;
            if (AbstractC0525d0.m1139q(r7)) {
            }
            return C1694m.f10482a;
        } catch (C1133o e13) {
            throw e13;
        }
    }
}
