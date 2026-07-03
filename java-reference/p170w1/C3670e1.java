package p170w1;

import com.paoman.lema.MainActivity;
import p001a0.C0074s0;
import p085l0.AbstractC2418w;
import p085l0.C2361g1;
import p085l0.C2395p;
import p085l0.C2405r1;
import p150t5.InterfaceC3281e;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.e1 */
/* loaded from: classes.dex */
public final class C3670e1 extends AbstractC3652a {

    /* renamed from: m */
    public final C2361g1 f17504m;

    /* renamed from: n */
    public boolean f17505n;

    public C3670e1(MainActivity mainActivity) {
        super(mainActivity);
        this.f17504m = AbstractC2418w.m3980x(null);
    }

    @Override // p170w1.AbstractC3652a
    /* renamed from: a */
    public final void mo5617a(int i7, C2395p c2395p) {
        int i8;
        boolean z7;
        c2395p.m3859a0(420213850);
        if (c2395p.m3874i(this)) {
            i8 = 4;
        } else {
            i8 = 2;
        }
        int i9 = i8 | i7;
        if ((i9 & 3) != 2) {
            z7 = true;
        } else {
            z7 = false;
        }
        if (c2395p.m3849R(i9 & 1, z7)) {
            InterfaceC3281e interfaceC3281e = (InterfaceC3281e) this.f17504m.getValue();
            if (interfaceC3281e == null) {
                c2395p.m3857Z(-1238798753);
            } else {
                c2395p.m3857Z(98586082);
                interfaceC3281e.mo22d(c2395p, 0);
            }
            c2395p.m3888r(false);
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0074s0(i7, 14, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return C3670e1.class.getName();
    }

    @Override // p170w1.AbstractC3652a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f17505n;
    }

    public final void setContent(InterfaceC3281e interfaceC3281e) {
        this.f17505n = true;
        this.f17504m.setValue(interfaceC3281e);
        if (isAttachedToWindow()) {
            if (this.f17432h == null && !isAttachedToWindow()) {
                throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
            }
            m5619d();
        }
    }

    public static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }
}
