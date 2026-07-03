package p160v;

import android.os.Trace;
import java.util.List;
import p001a0.C0031h1;
import p039e5.C1414x1;
import p060h5.C1813u;
import p077k.C2186d0;
import p109o1.C2803h;
import p140s2.C3091a;
import p146t1.C3200f1;
import p146t1.InterfaceC3194d1;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v.a1 */
/* loaded from: classes.dex */
public final class C3398a1 implements InterfaceC3429p0 {

    /* renamed from: a */
    public final int f16505a;

    /* renamed from: b */
    public final long f16506b;

    /* renamed from: c */
    public final C1414x1 f16507c;

    /* renamed from: d */
    public InterfaceC3194d1 f16508d;

    /* renamed from: e */
    public boolean f16509e;

    /* renamed from: f */
    public boolean f16510f;

    /* renamed from: g */
    public boolean f16511g;

    /* renamed from: h */
    public C3449z0 f16512h;

    /* renamed from: i */
    public boolean f16513i;

    /* renamed from: j */
    public final /* synthetic */ C0031h1 f16514j;

    public C3398a1(C0031h1 c0031h1, int i7, long j6, C1414x1 c1414x1) {
        this.f16514j = c0031h1;
        this.f16505a = i7;
        this.f16506b = j6;
        this.f16507c = c1414x1;
    }

    @Override // p160v.InterfaceC3429p0
    /* renamed from: a */
    public final void mo5160a() {
        this.f16513i = true;
    }

    /* JADX WARN: Type inference failed for: r7v19, types: [java.lang.Object, u5.v] */
    /* JADX WARN: Type inference failed for: r7v22, types: [v.z0, java.lang.Object] */
    /* renamed from: b */
    public final boolean m5161b(C3396a c3396a) {
        boolean z7;
        boolean z8;
        long j6;
        List list;
        C3449z0 c3449z0;
        long j7;
        long j8;
        if (m5162c()) {
            Object mo5058d = ((InterfaceC3413h0) ((C3409f0) this.f16514j.f152f).f16541b.mo52a()).mo5058d(this.f16505a);
            InterfaceC3194d1 interfaceC3194d1 = this.f16508d;
            long j9 = 0;
            C1414x1 c1414x1 = this.f16507c;
            if (interfaceC3194d1 == null) {
                if (mo5058d != null && ((C2186d0) c1414x1.f8580c).m3570b(mo5058d) >= 0) {
                    j7 = ((C2186d0) c1414x1.f8580c).m3571c(mo5058d);
                } else {
                    j7 = c1414x1.f8578a;
                }
                long m5157a = c3396a.m5157a();
                if ((!this.f16513i || m5157a <= 0) && j7 >= m5157a) {
                    return true;
                }
                long nanoTime = System.nanoTime();
                Trace.beginSection("compose:lazy:prefetch:compose");
                try {
                    m5163d();
                    Trace.endSection();
                    long nanoTime2 = System.nanoTime() - nanoTime;
                    if (mo5058d != null) {
                        C2186d0 c2186d0 = (C2186d0) c1414x1.f8580c;
                        int m3570b = c2186d0.m3570b(mo5058d);
                        if (m3570b >= 0) {
                            j8 = c2186d0.f12636c[m3570b];
                        } else {
                            j8 = 0;
                        }
                        ((C2186d0) c1414x1.f8580c).m3573e(C1414x1.m2420a(c1414x1, nanoTime2, j8), mo5058d);
                    }
                    c1414x1.f8578a = C1414x1.m2420a(c1414x1, nanoTime2, c1414x1.f8578a);
                } finally {
                }
            }
            if (!this.f16513i) {
                if (!this.f16511g) {
                    if (c3396a.m5157a() <= 0) {
                        return true;
                    }
                    Trace.beginSection("compose:lazy:prefetch:resolve-nested");
                    try {
                        InterfaceC3194d1 interfaceC3194d12 = this.f16508d;
                        if (interfaceC3194d12 != null) {
                            ?? obj = new Object();
                            interfaceC3194d12.mo4902b(new C2803h(obj, 2));
                            List list2 = (List) obj.f16451e;
                            if (list2 != null) {
                                ?? obj2 = new Object();
                                obj2.f16666e = this;
                                obj2.f16664c = list2;
                                obj2.f16665d = new List[list2.size()];
                                if (list2.isEmpty()) {
                                    throw new IllegalArgumentException("NestedPrefetchController shouldn't be created with no states");
                                }
                                c3449z0 = obj2;
                            } else {
                                c3449z0 = null;
                            }
                            this.f16512h = c3449z0;
                            this.f16511g = true;
                        } else {
                            throw new IllegalArgumentException("Should precompose before resolving nested prefetch states");
                        }
                    } finally {
                    }
                }
                C3449z0 c3449z02 = this.f16512h;
                if (c3449z02 != null) {
                    List[] listArr = (List[]) c3449z02.f16665d;
                    int i7 = c3449z02.f16662a;
                    List list3 = (List) c3449z02.f16664c;
                    if (i7 < list3.size()) {
                        if (!((C3398a1) c3449z02.f16666e).f16510f) {
                            Trace.beginSection("compose:lazy:prefetch:nested");
                            while (c3449z02.f16662a < list3.size()) {
                                try {
                                    if (listArr[c3449z02.f16662a] == null) {
                                        if (c3396a.m5157a() <= 0) {
                                            return true;
                                        }
                                        int i8 = c3449z02.f16662a;
                                        C3431q0 c3431q0 = (C3431q0) list3.get(i8);
                                        InterfaceC3279c interfaceC3279c = c3431q0.f16606a;
                                        if (interfaceC3279c == null) {
                                            list = C1813u.f10860e;
                                        } else {
                                            C3427o0 c3427o0 = new C3427o0(c3431q0);
                                            interfaceC3279c.mo23f(c3427o0);
                                            list = c3427o0.f16601a;
                                        }
                                        listArr[i8] = list;
                                    }
                                    List list4 = listArr[c3449z02.f16662a];
                                    AbstractC3367j.m5097b(list4);
                                    while (c3449z02.f16663b < list4.size()) {
                                        if (((C3398a1) list4.get(c3449z02.f16663b)).m5161b(c3396a)) {
                                            return true;
                                        }
                                        c3449z02.f16663b++;
                                    }
                                    c3449z02.f16663b = 0;
                                    c3449z02.f16662a++;
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        } else {
                            throw new IllegalStateException("Should not execute nested prefetch on canceled request");
                        }
                    }
                }
            }
            if (!this.f16509e) {
                long j10 = this.f16506b;
                int i9 = (int) (3 & j10);
                int i10 = (((i9 & 2) >> 1) * 3) + ((i9 & 1) << 1);
                int i11 = (((int) (j10 >> 33)) & ((1 << (i10 + 13)) - 1)) - 1;
                int i12 = (((1 << (18 - i10)) - 1) & ((int) (j10 >> (i10 + 46)))) - 1;
                if (i11 == 0) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                if (i12 == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!(z8 | z7)) {
                    if (mo5058d != null && ((C2186d0) c1414x1.f8581d).m3570b(mo5058d) >= 0) {
                        j6 = ((C2186d0) c1414x1.f8581d).m3571c(mo5058d);
                    } else {
                        j6 = c1414x1.f8579b;
                    }
                    long m5157a2 = c3396a.m5157a();
                    if ((!this.f16513i || m5157a2 <= 0) && j6 >= m5157a2) {
                        return true;
                    }
                    long nanoTime3 = System.nanoTime();
                    Trace.beginSection("compose:lazy:prefetch:measure");
                    try {
                        m5164e(j10);
                        Trace.endSection();
                        long nanoTime4 = System.nanoTime() - nanoTime3;
                        if (mo5058d != null) {
                            C2186d0 c2186d02 = (C2186d0) c1414x1.f8581d;
                            int m3570b2 = c2186d02.m3570b(mo5058d);
                            if (m3570b2 >= 0) {
                                j9 = c2186d02.f12636c[m3570b2];
                            }
                            ((C2186d0) c1414x1.f8581d).m3573e(C1414x1.m2420a(c1414x1, nanoTime4, j9), mo5058d);
                        }
                        c1414x1.f8579b = C1414x1.m2420a(c1414x1, nanoTime4, c1414x1.f8579b);
                        return false;
                    } finally {
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m5162c() {
        if (!this.f16510f) {
            int mo5055a = ((InterfaceC3413h0) ((C3409f0) this.f16514j.f152f).f16541b.mo52a()).mo5055a();
            int i7 = this.f16505a;
            if (i7 >= 0 && i7 < mo5055a) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // p160v.InterfaceC3429p0
    public final void cancel() {
        if (!this.f16510f) {
            this.f16510f = true;
            InterfaceC3194d1 interfaceC3194d1 = this.f16508d;
            if (interfaceC3194d1 != null) {
                interfaceC3194d1.mo4901a();
            }
            this.f16508d = null;
        }
    }

    /* renamed from: d */
    public final void m5163d() {
        if (m5162c()) {
            if (this.f16508d == null) {
                C0031h1 c0031h1 = this.f16514j;
                InterfaceC3413h0 interfaceC3413h0 = (InterfaceC3413h0) ((C3409f0) c0031h1.f152f).f16541b.mo52a();
                int i7 = this.f16505a;
                Object mo5057c = interfaceC3413h0.mo5057c(i7);
                this.f16508d = ((C3200f1) c0031h1.f153g).m4905a().m4909f(mo5057c, ((C3409f0) c0031h1.f152f).m5176a(i7, mo5057c, interfaceC3413h0.mo5058d(i7)));
                return;
            }
            throw new IllegalArgumentException("Request was already composed!");
        }
        throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performComposition()");
    }

    /* renamed from: e */
    public final void m5164e(long j6) {
        if (!this.f16510f) {
            if (!this.f16509e) {
                this.f16509e = true;
                InterfaceC3194d1 interfaceC3194d1 = this.f16508d;
                if (interfaceC3194d1 != null) {
                    int mo4903c = interfaceC3194d1.mo4903c();
                    for (int i7 = 0; i7 < mo4903c; i7++) {
                        interfaceC3194d1.mo4904d(i7, j6);
                    }
                    return;
                }
                throw new IllegalArgumentException("performComposition() must be called before performMeasure()");
            }
            throw new IllegalArgumentException("Request was already measured!");
        }
        throw new IllegalArgumentException("Callers should check whether the request is still valid before calling performMeasure()");
    }

    public final String toString() {
        boolean z7;
        StringBuilder sb = new StringBuilder("HandleAndRequestImpl { index = ");
        sb.append(this.f16505a);
        sb.append(", constraints = ");
        sb.append((Object) C3091a.m4763k(this.f16506b));
        sb.append(", isComposed = ");
        if (this.f16508d != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        sb.append(z7);
        sb.append(", isMeasured = ");
        sb.append(this.f16509e);
        sb.append(", isCanceled = ");
        sb.append(this.f16510f);
        sb.append(" }");
        return sb.toString();
    }
}
