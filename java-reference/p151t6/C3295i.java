package p151t6;

import java.io.IOException;
import p039e5.C1182ph;
import p121p6.AbstractC2882a;
import p158u5.AbstractC3367j;
import p158u5.C3379v;
import p159u6.C3395m;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.i */
/* loaded from: classes.dex */
public final class C3295i extends AbstractC2882a {

    /* renamed from: e */
    public final /* synthetic */ int f16164e;

    /* renamed from: f */
    public final /* synthetic */ Object f16165f;

    /* renamed from: g */
    public final /* synthetic */ Object f16166g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3295i(String str, Object obj, Object obj2, int i7) {
        super(str, true);
        this.f16164e = i7;
        this.f16165f = obj;
        this.f16166g = obj2;
    }

    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, u5.v] */
    @Override // p121p6.AbstractC2882a
    /* renamed from: a */
    public final long mo4555a() {
        long m4991a;
        int i7;
        C3309w[] c3309wArr;
        C3309w[] c3309wArr2;
        switch (this.f16164e) {
            case 0:
                C3301o c3301o = (C3301o) this.f16165f;
                c3301o.f16189e.mo4688a(c3301o, (C3286a0) ((C3379v) this.f16166g).f16451e);
                return -1L;
            case 1:
                try {
                    ((C3301o) this.f16165f).f16189e.mo4689b((C3309w) this.f16166g);
                } catch (IOException e7) {
                    C3395m c3395m = C3395m.f16494a;
                    C3395m c3395m2 = C3395m.f16494a;
                    String str = "Http2Connection.Listener failure for " + ((C3301o) this.f16165f).f16191g;
                    c3395m2.getClass();
                    C3395m.m5156i(str, 4, e7);
                    try {
                        ((C3309w) this.f16166g).m5024c(2, e7);
                    } catch (IOException unused) {
                    }
                }
                return -1L;
            default:
                C1182ph c1182ph = (C1182ph) this.f16165f;
                C3286a0 c3286a0 = (C3286a0) this.f16166g;
                ?? obj = new Object();
                C3301o c3301o2 = (C3301o) c1182ph.f6887g;
                synchronized (c3301o2.f16186B) {
                    synchronized (c3301o2) {
                        try {
                            C3286a0 c3286a02 = c3301o2.f16206v;
                            C3286a0 c3286a03 = new C3286a0();
                            c3286a03.m4992b(c3286a02);
                            c3286a03.m4992b(c3286a0);
                            obj.f16451e = c3286a03;
                            m4991a = c3286a03.m4991a() - c3286a02.m4991a();
                            i7 = 0;
                            if (m4991a != 0 && !c3301o2.f16190f.isEmpty()) {
                                c3309wArr = (C3309w[]) c3301o2.f16190f.values().toArray(new C3309w[0]);
                                c3309wArr2 = c3309wArr;
                                C3286a0 c3286a04 = (C3286a0) obj.f16451e;
                                AbstractC3367j.m5100e(c3286a04, "<set-?>");
                                c3301o2.f16206v = c3286a04;
                                c3301o2.f16198n.m4558c(new C3295i(c3301o2.f16191g + " onSettings", c3301o2, obj, i7), 0L);
                            }
                            c3309wArr = null;
                            c3309wArr2 = c3309wArr;
                            C3286a0 c3286a042 = (C3286a0) obj.f16451e;
                            AbstractC3367j.m5100e(c3286a042, "<set-?>");
                            c3301o2.f16206v = c3286a042;
                            c3301o2.f16198n.m4558c(new C3295i(c3301o2.f16191g + " onSettings", c3301o2, obj, i7), 0L);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    try {
                        c3301o2.f16186B.m5032b((C3286a0) obj.f16451e);
                    } catch (IOException e8) {
                        c3301o2.m5006b(2, 2, e8);
                    }
                }
                if (c3309wArr2 != null) {
                    int length = c3309wArr2.length;
                    while (i7 < length) {
                        C3309w c3309w = c3309wArr2[i7];
                        synchronized (c3309w) {
                            c3309w.f16245f += m4991a;
                            if (m4991a > 0) {
                                c3309w.notifyAll();
                            }
                        }
                        i7++;
                    }
                }
                return -1L;
        }
    }
}
