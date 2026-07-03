package p170w1;

import android.content.Context;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.AbstractC0194j0;
import androidx.lifecycle.C0216v;
import androidx.lifecycle.InterfaceC0213t;
import com.paoman.lema.R;
import java.lang.ref.WeakReference;
import p001a0.C0074s0;
import p014b5.C0293g;
import p032d6.AbstractC0525d0;
import p032d6.C0579v0;
import p034e0.C0625q;
import p035e1.ViewOnAttachStateChangeListenerC0650e;
import p040e6.AbstractC1508d;
import p040e6.C1507c;
import p053g5.C1691j;
import p069i6.C2090c;
import p073j2.AbstractC2168e;
import p082k5.C2319i;
import p082k5.InterfaceC2313c;
import p082k5.InterfaceC2318h;
import p085l0.AbstractC2406s;
import p085l0.C2369i1;
import p085l0.C2395p;
import p085l0.C2413u0;
import p085l0.C2414u1;
import p085l0.EnumC2408s1;
import p085l0.InterfaceC2416v0;
import p107o.C2722a;
import p107o.C2746i;
import p139s1.AbstractC3088a;
import p145t0.C3173d;
import p162v1.InterfaceC3524n1;
import p177x0.C3795c;
import p177x0.InterfaceC3811s;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.a */
/* loaded from: classes.dex */
public abstract class AbstractC3652a extends ViewGroup {

    /* renamed from: e */
    public WeakReference f17429e;

    /* renamed from: f */
    public IBinder f17430f;

    /* renamed from: g */
    public C3731t2 f17431g;

    /* renamed from: h */
    public AbstractC2406s f17432h;

    /* renamed from: i */
    public C2746i f17433i;

    /* renamed from: j */
    public boolean f17434j;

    /* renamed from: k */
    public boolean f17435k;

    /* renamed from: l */
    public boolean f17436l;

    public AbstractC3652a(Context context) {
        super(context, null, 0);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        ViewOnAttachStateChangeListenerC0650e viewOnAttachStateChangeListenerC0650e = new ViewOnAttachStateChangeListenerC0650e(2, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0650e);
        C0625q c0625q = new C0625q(18);
        AbstractC2168e.m3508B(this).f13747a.add(c0625q);
        this.f17433i = new C2746i(this, viewOnAttachStateChangeListenerC0650e, c0625q, 5);
    }

    private final void setParentContext(AbstractC2406s abstractC2406s) {
        if (this.f17432h != abstractC2406s) {
            this.f17432h = abstractC2406s;
            if (abstractC2406s != null) {
                this.f17429e = null;
            }
            C3731t2 c3731t2 = this.f17431g;
            if (c3731t2 != null) {
                c3731t2.m5752a();
                this.f17431g = null;
                if (isAttachedToWindow()) {
                    m5619d();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.f17430f != iBinder) {
            this.f17430f = iBinder;
            this.f17429e = null;
        }
    }

    /* renamed from: a */
    public abstract void mo5617a(int i7, C2395p c2395p);

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        m5618b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        m5618b();
        return super.addViewInLayout(view, i7, layoutParams);
    }

    /* renamed from: b */
    public final void m5618b() {
        if (this.f17435k) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    /* renamed from: d */
    public final void m5619d() {
        if (this.f17431g == null) {
            try {
                this.f17435k = true;
                this.f17431g = AbstractC3735u2.m5755a(this, m5622g(), new C3173d(-656146368, new C0074s0(13, this), true));
            } finally {
                this.f17435k = false;
            }
        }
    }

    /* renamed from: e */
    public void mo5620e(boolean z7, int i7, int i8, int i9, int i10) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i9 - i7) - getPaddingRight(), (i10 - i8) - getPaddingBottom());
        }
    }

    /* renamed from: f */
    public void mo5621f(int i7, int i8) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i7, i8);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i7) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i7)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i8) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i8)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, u5.v] */
    /* renamed from: g */
    public final AbstractC2406s m5622g() {
        C2414u1 c2414u1;
        InterfaceC2318h interfaceC2318h;
        C2369i1 c2369i1;
        C0216v c0216v;
        AbstractC2406s abstractC2406s;
        AbstractC2406s abstractC2406s2 = this.f17432h;
        if (abstractC2406s2 == null) {
            abstractC2406s2 = AbstractC3719q2.m5716b(this);
            if (abstractC2406s2 == null) {
                Object parent = getParent();
                while (abstractC2406s2 == null && (parent instanceof View)) {
                    View view = (View) parent;
                    abstractC2406s2 = AbstractC3719q2.m5716b(view);
                    parent = view.getParent();
                }
            }
            InterfaceC2313c interfaceC2313c = null;
            if (abstractC2406s2 != null) {
                if ((abstractC2406s2 instanceof C2414u1) && ((EnumC2408s1) ((C2414u1) abstractC2406s2).f13598t.getValue()).compareTo(EnumC2408s1.f13551f) <= 0) {
                    abstractC2406s = null;
                } else {
                    abstractC2406s = abstractC2406s2;
                }
                if (abstractC2406s != null) {
                    this.f17429e = new WeakReference(abstractC2406s);
                }
            } else {
                abstractC2406s2 = null;
            }
            if (abstractC2406s2 == null) {
                WeakReference weakReference = this.f17429e;
                if (weakReference == null || (abstractC2406s2 = (AbstractC2406s) weakReference.get()) == null || ((abstractC2406s2 instanceof C2414u1) && ((EnumC2408s1) ((C2414u1) abstractC2406s2).f13598t.getValue()).compareTo(EnumC2408s1.f13551f) <= 0)) {
                    abstractC2406s2 = null;
                }
                if (abstractC2406s2 == null) {
                    if (!isAttachedToWindow()) {
                        AbstractC3088a.m4750b("Cannot locate windowRecomposer; View " + this + " is not attached to a window");
                    }
                    Object parent2 = getParent();
                    View view2 = this;
                    while (parent2 instanceof View) {
                        View view3 = (View) parent2;
                        if (view3.getId() == 16908290) {
                            break;
                        }
                        view2 = view3;
                        parent2 = view3.getParent();
                    }
                    AbstractC2406s m5716b = AbstractC3719q2.m5716b(view2);
                    if (m5716b == null) {
                        ((C3695k2) AbstractC3699l2.f17598a.get()).getClass();
                        C2319i c2319i = C2319i.f13273e;
                        C1691j c1691j = C3717q0.f17663q;
                        if (Looper.myLooper() == Looper.getMainLooper()) {
                            interfaceC2318h = (InterfaceC2318h) C3717q0.f17663q.getValue();
                        } else {
                            interfaceC2318h = (InterfaceC2318h) C3717q0.f17664r.get();
                            if (interfaceC2318h == null) {
                                throw new IllegalStateException("no AndroidUiDispatcher for this thread");
                            }
                        }
                        InterfaceC2318h mo855z = interfaceC2318h.mo855z(c2319i);
                        InterfaceC2416v0 interfaceC2416v0 = (InterfaceC2416v0) mo855z.mo853h(C2413u0.f13571f);
                        if (interfaceC2416v0 != null) {
                            C2369i1 c2369i12 = new C2369i1(interfaceC2416v0);
                            C0293g c0293g = (C0293g) c2369i12.f13413g;
                            synchronized (c0293g.f1068b) {
                                c0293g.f1067a = false;
                                c2369i1 = c2369i12;
                            }
                        } else {
                            c2369i1 = 0;
                        }
                        ?? obj = new Object();
                        InterfaceC2318h interfaceC2318h2 = (InterfaceC3811s) mo855z.mo853h(C3795c.f17979t);
                        if (interfaceC2318h2 == null) {
                            interfaceC2318h2 = new C3730t1();
                            obj.f16451e = interfaceC2318h2;
                        }
                        if (c2369i1 != 0) {
                            c2319i = c2369i1;
                        }
                        InterfaceC2318h mo855z2 = mo855z.mo855z(c2319i).mo855z(interfaceC2318h2);
                        C2414u1 c2414u12 = new C2414u1(mo855z2);
                        synchronized (c2414u12.f13580b) {
                            c2414u12.f13597s = true;
                        }
                        C2090c m1123a = AbstractC0525d0.m1123a(mo855z2);
                        InterfaceC0213t m458c = AbstractC0194j0.m458c(view2);
                        if (m458c != null) {
                            c0216v = m458c.mo415g();
                        } else {
                            c0216v = null;
                        }
                        if (c0216v != null) {
                            view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC3703m2(view2, c2414u12));
                            c0216v.m468a(new C3711o2(m1123a, c2369i1, c2414u12, obj, view2));
                            view2.setTag(R.id.androidx_compose_ui_view_composition_context, c2414u12);
                            C0579v0 c0579v0 = C0579v0.f1933e;
                            Handler handler = view2.getHandler();
                            int i7 = AbstractC1508d.f9993a;
                            view2.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0650e(3, AbstractC0525d0.m1141s(c0579v0, new C1507c(handler, "windowRecomposer cleanup", false).f9992j, new C2722a(c2414u12, view2, interfaceC2313c, 10), 2)));
                            c2414u1 = c2414u12;
                        } else {
                            AbstractC3088a.m4751c("ViewTreeLifecycleOwner not found from " + view2);
                            throw new RuntimeException();
                        }
                    } else if (m5716b instanceof C2414u1) {
                        c2414u1 = (C2414u1) m5716b;
                    } else {
                        throw new IllegalStateException("root viewTreeParentCompositionContext is not a Recomposer");
                    }
                    if (((EnumC2408s1) c2414u1.f13598t.getValue()).compareTo(EnumC2408s1.f13551f) > 0) {
                        interfaceC2313c = c2414u1;
                    }
                    if (interfaceC2313c != null) {
                        this.f17429e = new WeakReference(interfaceC2313c);
                    }
                    return c2414u1;
                }
            }
        }
        return abstractC2406s2;
    }

    public final boolean getHasComposition() {
        if (this.f17431g != null) {
            return true;
        }
        return false;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.f17434j;
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        if (this.f17436l && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            m5619d();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        mo5620e(z7, i7, i8, i9, i10);
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        m5619d();
        mo5621f(i7, i8);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i7);
        }
    }

    public final void setParentCompositionContext(AbstractC2406s abstractC2406s) {
        setParentContext(abstractC2406s);
    }

    public final void setShowLayoutBounds(boolean z7) {
        this.f17434j = z7;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((C3728t) ((InterfaceC3524n1) childAt)).setShowLayoutBounds(z7);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z7) {
        super.setTransitionGroup(z7);
        this.f17436l = true;
    }

    public final void setViewCompositionStrategy(InterfaceC3675f2 interfaceC3675f2) {
        C2746i c2746i = this.f17433i;
        if (c2746i != null) {
            c2746i.mo52a();
        }
        ((AbstractC3681h0) interfaceC3675f2).getClass();
        ViewOnAttachStateChangeListenerC0650e viewOnAttachStateChangeListenerC0650e = new ViewOnAttachStateChangeListenerC0650e(2, this);
        addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC0650e);
        C0625q c0625q = new C0625q(18);
        AbstractC2168e.m3508B(this).f13747a.add(c0625q);
        this.f17433i = new C2746i(this, viewOnAttachStateChangeListenerC0650e, c0625q, 5);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        m5618b();
        super.addView(view, i7);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(View view, int i7, ViewGroup.LayoutParams layoutParams, boolean z7) {
        m5618b();
        return super.addViewInLayout(view, i7, layoutParams, z7);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, int i8) {
        m5618b();
        super.addView(view, i7, i8);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        m5618b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        m5618b();
        super.addView(view, i7, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
