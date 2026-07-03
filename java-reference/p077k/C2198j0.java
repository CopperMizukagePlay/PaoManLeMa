package p077k;

import p015b6.C0303j;
import p015b6.C0306m;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2589i;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: k.j0 */
/* loaded from: classes.dex */
public final class C2198j0 extends AbstractC2589i implements InterfaceC3281e {

    /* renamed from: g */
    public C0303j f12690g;

    /* renamed from: h */
    public C2200k0 f12691h;

    /* renamed from: i */
    public long[] f12692i;

    /* renamed from: j */
    public int f12693j;

    /* renamed from: k */
    public int f12694k;

    /* renamed from: l */
    public int f12695l;

    /* renamed from: m */
    public int f12696m;

    /* renamed from: n */
    public long f12697n;

    /* renamed from: o */
    public int f12698o;

    /* renamed from: p */
    public /* synthetic */ Object f12699p;

    /* renamed from: q */
    public final /* synthetic */ C2200k0 f12700q;

    /* renamed from: r */
    public final /* synthetic */ C0303j f12701r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2198j0(C2200k0 c2200k0, C0303j c0303j, InterfaceC2313c interfaceC2313c) {
        super(interfaceC2313c);
        this.f12700q = c2200k0;
        this.f12701r = c0303j;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C2198j0) mo28k((C0306m) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C2198j0 c2198j0 = new C2198j0(this.f12700q, this.f12701r, interfaceC2313c);
        c2198j0.f12699p = obj;
        return c2198j0;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0067  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0050 -> B:14:0x00a0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0052 -> B:6:0x0065). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x006e -> B:5:0x0095). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C0306m c0306m;
        C2200k0 c2200k0;
        long[] jArr;
        int length;
        C0303j c0303j;
        int i7;
        long j6;
        int i8 = this.f12698o;
        if (i8 != 0) {
            if (i8 == 1) {
                int i9 = this.f12696m;
                int i10 = this.f12695l;
                long j7 = this.f12697n;
                int i11 = this.f12694k;
                int i12 = this.f12693j;
                long[] jArr2 = this.f12692i;
                C2200k0 c2200k02 = this.f12691h;
                C0303j c0303j2 = this.f12690g;
                C0306m c0306m2 = (C0306m) this.f12699p;
                AbstractC1793a0.m2972L(obj);
                j7 >>= 8;
                i9++;
                if (i9 < i10) {
                    if (i10 == 8) {
                        length = i12;
                        jArr = jArr2;
                        c2200k0 = c2200k02;
                        c0306m = c0306m2;
                        i7 = i11;
                        c0303j = c0303j2;
                        if (i7 != length) {
                            i7++;
                            j6 = jArr[i7];
                            if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                c0306m2 = c0306m;
                                i9 = 0;
                                c2200k02 = c2200k0;
                                jArr2 = jArr;
                                i10 = 8 - ((~(i7 - length)) >>> 31);
                                c0303j2 = c0303j;
                                i11 = i7;
                                i12 = length;
                                j7 = j6;
                                if (i9 < i10) {
                                    if ((255 & j7) < 128) {
                                        int i13 = (i11 << 3) + i9;
                                        c0303j2.f1093f = i13;
                                        Object obj2 = c2200k02.f12704f.f12685b[i13];
                                        this.f12699p = c0306m2;
                                        this.f12690g = c0303j2;
                                        this.f12691h = c2200k02;
                                        this.f12692i = jArr2;
                                        this.f12693j = i12;
                                        this.f12694k = i11;
                                        this.f12697n = j7;
                                        this.f12695l = i10;
                                        this.f12696m = i9;
                                        this.f12698o = 1;
                                        c0306m2.m661b(obj2, this);
                                        return EnumC2465a.f13750e;
                                    }
                                    j7 >>= 8;
                                    i9++;
                                    if (i9 < i10) {
                                    }
                                }
                            }
                            if (i7 != length) {
                            }
                        }
                    }
                    return C1694m.f10482a;
                }
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            c0306m = (C0306m) this.f12699p;
            c2200k0 = this.f12700q;
            jArr = c2200k0.f12704f.f12684a;
            length = jArr.length - 2;
            if (length >= 0) {
                c0303j = this.f12701r;
                i7 = 0;
                j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                }
                if (i7 != length) {
                }
            }
            return C1694m.f10482a;
        }
    }
}
