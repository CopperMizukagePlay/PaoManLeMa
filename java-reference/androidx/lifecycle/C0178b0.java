package androidx.lifecycle;

import android.os.Handler;
import p001a0.C0019e1;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.b0 */
/* loaded from: classes.dex */
public final class C0178b0 implements InterfaceC0213t {

    /* renamed from: m */
    public static final C0178b0 f822m = new C0178b0();

    /* renamed from: e */
    public int f823e;

    /* renamed from: f */
    public int f824f;

    /* renamed from: i */
    public Handler f827i;

    /* renamed from: g */
    public boolean f825g = true;

    /* renamed from: h */
    public boolean f826h = true;

    /* renamed from: j */
    public final C0216v f828j = new C0216v(this, true);

    /* renamed from: k */
    public final RunnableC0219y f829k = new RunnableC0219y(0, this);

    /* renamed from: l */
    public final C0019e1 f830l = new C0019e1(this);

    /* renamed from: c */
    public final void m414c() {
        int i7 = this.f824f + 1;
        this.f824f = i7;
        if (i7 == 1) {
            if (this.f825g) {
                this.f828j.m471d(EnumC0201n.ON_RESUME);
                this.f825g = false;
            } else {
                Handler handler = this.f827i;
                AbstractC3367j.m5097b(handler);
                handler.removeCallbacks(this.f829k);
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0213t
    /* renamed from: g */
    public final C0216v mo415g() {
        return this.f828j;
    }
}
