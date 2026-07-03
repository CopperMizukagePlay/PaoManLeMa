package p161v0;

import p015b6.C0306m;
import p053g5.C1694m;
import p060h5.AbstractC1793a0;
import p082k5.InterfaceC2313c;
import p090l5.EnumC2465a;
import p098m5.AbstractC2589i;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v0.i */
/* loaded from: classes.dex */
public final class C3462i extends AbstractC2589i implements InterfaceC3281e {

    /* renamed from: g */
    public long[] f16705g;

    /* renamed from: h */
    public int f16706h;

    /* renamed from: i */
    public int f16707i;

    /* renamed from: j */
    public int f16708j;

    /* renamed from: k */
    public /* synthetic */ Object f16709k;

    /* renamed from: l */
    public final /* synthetic */ C3463j f16710l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3462i(C3463j c3463j, InterfaceC2313c interfaceC2313c) {
        super(interfaceC2313c);
        this.f16710l = c3463j;
    }

    @Override // p150t5.InterfaceC3281e
    /* renamed from: d */
    public final Object mo22d(Object obj, Object obj2) {
        return ((C3462i) mo28k((C0306m) obj, (InterfaceC2313c) obj2)).mo29m(C1694m.f10482a);
    }

    @Override // p098m5.AbstractC2581a
    /* renamed from: k */
    public final InterfaceC2313c mo28k(Object obj, InterfaceC2313c interfaceC2313c) {
        C3462i c3462i = new C3462i(this.f16710l, interfaceC2313c);
        c3462i.f16709k = obj;
        return c3462i;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a0  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x00bd -> B:7:0x00bf). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0080 -> B:20:0x0095). Please report as a decompilation issue!!! */
    @Override // p098m5.AbstractC2581a
    /* renamed from: m */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo29m(Object obj) {
        C0306m c0306m;
        long[] jArr;
        int length;
        int i7;
        C0306m c0306m2;
        int i8;
        C0306m c0306m3;
        int i9;
        C3463j c3463j = this.f16710l;
        long j6 = c3463j.f16712e;
        long j7 = c3463j.f16714g;
        long j8 = c3463j.f16713f;
        int i10 = this.f16708j;
        EnumC2465a enumC2465a = EnumC2465a.f13750e;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        int i11 = this.f16706h;
                        c0306m3 = (C0306m) this.f16709k;
                        AbstractC1793a0.m2972L(obj);
                        i9 = i11 + 1;
                        if (i9 < 64) {
                            if (((1 << i9) & j6) != 0) {
                                Long l7 = new Long(j7 + i9 + 64);
                                this.f16709k = c0306m3;
                                this.f16705g = null;
                                this.f16706h = i9;
                                this.f16708j = 3;
                                c0306m3.m661b(l7, this);
                                return enumC2465a;
                            }
                            i11 = i9;
                            i9 = i11 + 1;
                            if (i9 < 64) {
                            }
                        }
                        return C1694m.f10482a;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i8 = this.f16706h;
                c0306m2 = (C0306m) this.f16709k;
                AbstractC1793a0.m2972L(obj);
                i8++;
                if (i8 < 64) {
                    if ((j8 & (1 << i8)) != 0) {
                        Long l8 = new Long(j7 + i8);
                        this.f16709k = c0306m2;
                        this.f16705g = null;
                        this.f16706h = i8;
                        this.f16708j = 2;
                        c0306m2.m661b(l8, this);
                        return enumC2465a;
                    }
                    i8++;
                    if (i8 < 64) {
                    }
                } else {
                    c0306m = c0306m2;
                    if (j6 != 0) {
                        c0306m3 = c0306m;
                        i9 = 0;
                        if (i9 < 64) {
                        }
                    }
                    return C1694m.f10482a;
                }
            } else {
                length = this.f16707i;
                int i12 = this.f16706h;
                jArr = this.f16705g;
                c0306m = (C0306m) this.f16709k;
                AbstractC1793a0.m2972L(obj);
                i7 = i12 + 1;
            }
        } else {
            AbstractC1793a0.m2972L(obj);
            c0306m = (C0306m) this.f16709k;
            jArr = c3463j.f16715h;
            if (jArr != null) {
                length = jArr.length;
                i7 = 0;
            }
            if (j8 != 0) {
                c0306m2 = c0306m;
                i8 = 0;
                if (i8 < 64) {
                }
            }
            if (j6 != 0) {
            }
            return C1694m.f10482a;
        }
        if (i7 < length) {
            Long l9 = new Long(jArr[i7]);
            this.f16709k = c0306m;
            this.f16705g = jArr;
            this.f16706h = i7;
            this.f16707i = length;
            this.f16708j = 1;
            c0306m.m661b(l9, this);
            return enumC2465a;
        }
        if (j8 != 0) {
        }
        if (j6 != 0) {
        }
        return C1694m.f10482a;
    }
}
