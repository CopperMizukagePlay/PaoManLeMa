package p148t3;

import java.util.LinkedHashSet;
import p067i4.AbstractC2072e;
import p096m3.C2572v;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t3.d */
/* loaded from: classes.dex */
public abstract class AbstractC3255d {

    /* renamed from: a */
    public AbstractC2072e f16081a;

    /* renamed from: b */
    public boolean f16082b;

    /* renamed from: c */
    public C2572v f16083c;

    /* renamed from: a */
    public abstract void mo478a();

    /* renamed from: b */
    public abstract void mo479b();

    /* renamed from: c */
    public abstract void mo480c(C3253b c3253b);

    /* renamed from: d */
    public abstract void mo481d(C3253b c3253b);

    /* renamed from: e */
    public final void m4970e() {
        C2572v c2572v = this.f16083c;
        if (c2572v != null && ((LinkedHashSet) c2572v.f13968g).remove(this)) {
            C3258g c3258g = (C3258g) c2572v.f13967f;
            c3258g.getClass();
            if (equals(c3258g.f16093f)) {
                if (c3258g.f16094g == -1) {
                    mo478a();
                }
                c3258g.f16093f = null;
                c3258g.f16094g = 0;
                c3258g.f16095h = null;
            }
            c3258g.f16091d.remove(this);
            c3258g.f16092e.remove(this);
            this.f16083c = null;
            c3258g.m4974b();
        }
    }

    /* renamed from: f */
    public final void m4971f(boolean z7) {
        C3258g c3258g;
        if (this.f16082b != z7) {
            this.f16082b = z7;
            C2572v c2572v = this.f16083c;
            if (c2572v != null && (c3258g = (C3258g) c2572v.f13967f) != null) {
                c3258g.m4974b();
            }
        }
    }
}
