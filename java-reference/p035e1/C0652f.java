package p035e1;

import android.content.Context;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import com.paoman.lema.R;
import p049g1.C1568b;
import p057h1.C1752b;
import p057h1.C1755e;
import p057h1.C1757g;
import p057h1.C1759i;
import p057h1.InterfaceC1754d;
import p064i1.AbstractC2058a;
import p064i1.C2059b;
import p170w1.C3728t;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e1.f */
/* loaded from: classes.dex */
public final class C0652f implements InterfaceC0682x {

    /* renamed from: f */
    public static boolean f2136f = true;

    /* renamed from: a */
    public final C3728t f2137a;

    /* renamed from: b */
    public final Object f2138b = new Object();

    /* renamed from: c */
    public C2059b f2139c;

    /* renamed from: d */
    public boolean f2140d;

    /* renamed from: e */
    public final ComponentCallbacks2C0648d f2141e;

    public C0652f(C3728t c3728t) {
        this.f2137a = c3728t;
        ComponentCallbacks2C0648d componentCallbacks2C0648d = new ComponentCallbacks2C0648d(this);
        this.f2141e = componentCallbacks2C0648d;
        if (c3728t.isAttachedToWindow()) {
            Context context = c3728t.getContext();
            if (!this.f2140d) {
                context.getApplicationContext().registerComponentCallbacks(componentCallbacks2C0648d);
                this.f2140d = true;
            }
        }
        c3728t.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0650e(0, this));
    }

    @Override // p035e1.InterfaceC0682x
    /* renamed from: a */
    public final void mo1359a(C1752b c1752b) {
        synchronized (this.f2138b) {
            if (!c1752b.f10681s) {
                c1752b.f10681s = true;
                c1752b.m2806b();
            }
        }
    }

    @Override // p035e1.InterfaceC0682x
    /* renamed from: b */
    public final C1752b mo1360b() {
        InterfaceC1754d c1759i;
        C1752b c1752b;
        synchronized (this.f2138b) {
            try {
                C3728t c3728t = this.f2137a;
                int i7 = Build.VERSION.SDK_INT;
                if (i7 >= 29) {
                    c3728t.getUniqueDrawingId();
                }
                if (i7 >= 29) {
                    c1759i = new C1757g();
                } else if (f2136f) {
                    try {
                        c1759i = new C1755e(this.f2137a, new C0676r(), new C1568b());
                    } catch (Throwable unused) {
                        f2136f = false;
                        c1759i = new C1759i(m1361c(this.f2137a));
                    }
                } else {
                    c1759i = new C1759i(m1361c(this.f2137a));
                }
                c1752b = new C1752b(c1759i);
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1752b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.view.View, i1.a, i1.b, android.view.ViewGroup] */
    /* renamed from: c */
    public final AbstractC2058a m1361c(C3728t c3728t) {
        C2059b c2059b = this.f2139c;
        if (c2059b == null) {
            ?? viewGroup = new ViewGroup(c3728t.getContext());
            viewGroup.setClipChildren(false);
            viewGroup.setClipToPadding(false);
            viewGroup.setTag(R.id.hide_graphics_layer_in_inspector_tag, Boolean.TRUE);
            c3728t.addView((View) viewGroup, -1);
            this.f2139c = viewGroup;
            return viewGroup;
        }
        return c2059b;
    }
}
