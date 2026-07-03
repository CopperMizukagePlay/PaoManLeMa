package p144t;

import android.os.Build;
import android.view.View;
import java.util.List;
import p001a0.C0068q2;
import p051g3.AbstractC1661u;
import p051g3.C1628d0;
import p051g3.C1664v0;
import p051g3.C1672z0;
import p051g3.InterfaceC1631f;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t.z */
/* loaded from: classes.dex */
public final class RunnableC3168z extends AbstractC1661u implements Runnable, InterfaceC1631f, View.OnAttachStateChangeListener {

    /* renamed from: g */
    public final C3161v0 f15873g;

    /* renamed from: h */
    public boolean f15874h;

    /* renamed from: i */
    public boolean f15875i;

    /* renamed from: j */
    public C1672z0 f15876j;

    public RunnableC3168z(C3161v0 c3161v0) {
        super(!c3161v0.f15864r ? 1 : 0);
        this.f15873g = c3161v0;
    }

    @Override // p051g3.AbstractC1661u
    /* renamed from: a */
    public final void mo2710a(C1628d0 c1628d0) {
        this.f15874h = false;
        this.f15875i = false;
        C1672z0 c1672z0 = this.f15876j;
        if (c1628d0.f10375a.mo2634b() != 0 && c1672z0 != null) {
            C1664v0 c1664v0 = c1672z0.f10450a;
            C3161v0 c3161v0 = this.f15873g;
            c3161v0.f15863q.m4861f(AbstractC3122c.m4832e(c1664v0.mo2671i(8)));
            c3161v0.f15862p.m4861f(AbstractC3122c.m4832e(c1664v0.mo2671i(8)));
            C3161v0.m4863a(c3161v0, c1672z0);
        }
        this.f15876j = null;
    }

    @Override // p051g3.AbstractC1661u
    /* renamed from: b */
    public final void mo2711b(C1628d0 c1628d0) {
        this.f15874h = true;
        this.f15875i = true;
    }

    @Override // p051g3.InterfaceC1631f
    /* renamed from: c */
    public final C1672z0 mo2644c(View view, C1672z0 c1672z0) {
        this.f15876j = c1672z0;
        C3161v0 c3161v0 = this.f15873g;
        C3157t0 c3157t0 = c3161v0.f15862p;
        C1664v0 c1664v0 = c1672z0.f10450a;
        c3157t0.m4861f(AbstractC3122c.m4832e(c1664v0.mo2671i(8)));
        if (this.f15874h) {
            if (Build.VERSION.SDK_INT == 30) {
                view.post(this);
            }
        } else if (!this.f15875i) {
            c3161v0.f15863q.m4861f(AbstractC3122c.m4832e(c1664v0.mo2671i(8)));
            C3161v0.m4863a(c3161v0, c1672z0);
        }
        if (c3161v0.f15864r) {
            return C1672z0.f10449b;
        }
        return c1672z0;
    }

    @Override // p051g3.AbstractC1661u
    /* renamed from: d */
    public final C1672z0 mo2712d(C1672z0 c1672z0, List list) {
        C3161v0 c3161v0 = this.f15873g;
        C3161v0.m4863a(c3161v0, c1672z0);
        if (c3161v0.f15864r) {
            return C1672z0.f10449b;
        }
        return c1672z0;
    }

    @Override // p051g3.AbstractC1661u
    /* renamed from: e */
    public final C0068q2 mo2713e(C1628d0 c1628d0, C0068q2 c0068q2) {
        this.f15874h = false;
        return c0068q2;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        view.requestApplyInsets();
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f15874h) {
            this.f15874h = false;
            this.f15875i = false;
            C1672z0 c1672z0 = this.f15876j;
            if (c1672z0 != null) {
                C3161v0 c3161v0 = this.f15873g;
                c3161v0.f15863q.m4861f(AbstractC3122c.m4832e(c1672z0.f10450a.mo2671i(8)));
                C3161v0.m4863a(c3161v0, c1672z0);
                this.f15876j = null;
            }
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
    }
}
