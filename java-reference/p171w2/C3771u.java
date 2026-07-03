package p171w2;

import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.AbstractC0194j0;
import com.paoman.lema.R;
import java.util.UUID;
import p001a0.C0074s0;
import p008b.C0230e0;
import p029d3.AbstractC0497d;
import p057h1.C1762l;
import p066i3.AbstractC2067b;
import p067i4.AbstractC2072e;
import p085l0.AbstractC2406s;
import p085l0.AbstractC2418w;
import p085l0.C2352e0;
import p085l0.C2361g1;
import p085l0.C2395p;
import p085l0.C2405r1;
import p140s2.C3101k;
import p140s2.C3102l;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p146t1.InterfaceC3238v;
import p148t3.C3262k;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3281e;
import p158u5.AbstractC3367j;
import p161v0.C3474u;
import p170w1.AbstractC3652a;
import p170w1.C3701m0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.u */
/* loaded from: classes.dex */
public final class C3771u extends AbstractC3652a {

    /* renamed from: A */
    public final C3474u f17886A;

    /* renamed from: B */
    public C3262k f17887B;

    /* renamed from: C */
    public final C2361g1 f17888C;

    /* renamed from: D */
    public boolean f17889D;

    /* renamed from: E */
    public final int[] f17890E;

    /* renamed from: m */
    public InterfaceC3277a f17891m;

    /* renamed from: n */
    public C3775y f17892n;

    /* renamed from: o */
    public String f17893o;

    /* renamed from: p */
    public final View f17894p;

    /* renamed from: q */
    public final C3773w f17895q;

    /* renamed from: r */
    public final WindowManager f17896r;

    /* renamed from: s */
    public final WindowManager.LayoutParams f17897s;

    /* renamed from: t */
    public InterfaceC3774x f17898t;

    /* renamed from: u */
    public EnumC3103m f17899u;

    /* renamed from: v */
    public final C2361g1 f17900v;

    /* renamed from: w */
    public final C2361g1 f17901w;

    /* renamed from: x */
    public C3101k f17902x;

    /* renamed from: y */
    public final C2352e0 f17903y;

    /* renamed from: z */
    public final Rect f17904z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [w2.w] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    public C3771u(InterfaceC3277a interfaceC3277a, C3775y c3775y, String str, View view, InterfaceC3093c interfaceC3093c, InterfaceC3774x interfaceC3774x, UUID uuid) {
        super(view.getContext());
        ?? r02;
        if (Build.VERSION.SDK_INT >= 29) {
            r02 = new Object();
        } else {
            r02 = new Object();
        }
        this.f17891m = interfaceC3277a;
        this.f17892n = c3775y;
        this.f17893o = str;
        this.f17894p = view;
        this.f17895q = r02;
        Object systemService = view.getContext().getSystemService("window");
        AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f17896r = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        C3775y c3775y2 = this.f17892n;
        boolean m5761b = AbstractC3760j.m5761b(view);
        boolean z7 = c3775y2.f17906b;
        int i7 = c3775y2.f17905a;
        if (z7 && m5761b) {
            i7 |= 8192;
        } else if (z7 && !m5761b) {
            i7 &= -8193;
        }
        layoutParams.flags = i7;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f17897s = layoutParams;
        this.f17898t = interfaceC3774x;
        this.f17899u = EnumC3103m.f15703e;
        this.f17900v = AbstractC2418w.m3980x(null);
        this.f17901w = AbstractC2418w.m3980x(null);
        this.f17903y = AbstractC2418w.m3974q(new C3701m0(2, this));
        this.f17904z = new Rect();
        this.f17886A = new C3474u(new C3757g(this, 2));
        setId(android.R.id.content);
        AbstractC0194j0.m461f(this, AbstractC0194j0.m458c(view));
        setTag(R.id.view_tree_view_model_store_owner, AbstractC0194j0.m459d(view));
        setTag(R.id.view_tree_saved_state_registry_owner, AbstractC2072e.m3333j(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(interfaceC3093c.mo4526y((float) 8));
        setOutlineProvider(new C1762l(3));
        this.f17888C = AbstractC2418w.m3980x(AbstractC3765o.f17859a);
        this.f17890E = new int[2];
    }

    private final InterfaceC3281e getContent() {
        return (InterfaceC3281e) this.f17888C.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC3238v getParentLayoutCoordinates() {
        return (InterfaceC3238v) this.f17901w.getValue();
    }

    private final C3101k getVisibleDisplayBounds() {
        this.f17895q.getClass();
        View view = this.f17894p;
        Rect rect = this.f17904z;
        view.getWindowVisibleDisplayFrame(rect);
        return new C3101k(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(InterfaceC3281e interfaceC3281e) {
        this.f17888C.setValue(interfaceC3281e);
    }

    private final void setParentLayoutCoordinates(InterfaceC3238v interfaceC3238v) {
        this.f17901w.setValue(interfaceC3238v);
    }

    @Override // p170w1.AbstractC3652a
    /* renamed from: a */
    public final void mo5617a(int i7, C2395p c2395p) {
        int i8;
        boolean z7;
        c2395p.m3859a0(-857613600);
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
            getContent().mo22d(c2395p, 0);
        } else {
            c2395p.m3852U();
        }
        C2405r1 m3891u = c2395p.m3891u();
        if (m3891u != null) {
            m3891u.f13542d = new C0074s0(i7, 16, this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.f17892n.f17907c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                InterfaceC3277a interfaceC3277a = this.f17891m;
                if (interfaceC3277a != null) {
                    interfaceC3277a.mo52a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p170w1.AbstractC3652a
    /* renamed from: e */
    public final void mo5620e(boolean z7, int i7, int i8, int i9, int i10) {
        super.mo5620e(z7, i7, i8, i9, i10);
        this.f17892n.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.f17897s;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.f17895q.getClass();
        this.f17896r.updateViewLayout(this, layoutParams);
    }

    @Override // p170w1.AbstractC3652a
    /* renamed from: f */
    public final void mo5621f(int i7, int i8) {
        this.f17892n.getClass();
        C3101k visibleDisplayBounds = getVisibleDisplayBounds();
        super.mo5621f(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.m4789c(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.m4788b(), Integer.MIN_VALUE));
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f17903y.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f17897s;
    }

    public final EnumC3103m getParentLayoutDirection() {
        return this.f17899u;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final C3102l m5919getPopupContentSizebOM6tXw() {
        return (C3102l) this.f17900v.getValue();
    }

    public final InterfaceC3774x getPositionProvider() {
        return this.f17898t;
    }

    @Override // p170w1.AbstractC3652a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f17889D;
    }

    public final String getTestTag() {
        return this.f17893o;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    /* renamed from: i */
    public final void m5770i(AbstractC2406s abstractC2406s, InterfaceC3281e interfaceC3281e) {
        setParentCompositionContext(abstractC2406s);
        setContent(interfaceC3281e);
        this.f17889D = true;
    }

    /* renamed from: j */
    public final void m5771j(InterfaceC3277a interfaceC3277a, C3775y c3775y, String str, EnumC3103m enumC3103m) {
        int i7;
        this.f17891m = interfaceC3277a;
        this.f17893o = str;
        if (!AbstractC3367j.m5096a(this.f17892n, c3775y)) {
            c3775y.getClass();
            this.f17892n = c3775y;
            boolean m5761b = AbstractC3760j.m5761b(this.f17894p);
            boolean z7 = c3775y.f17906b;
            int i8 = c3775y.f17905a;
            if (z7 && m5761b) {
                i8 |= 8192;
            } else if (z7 && !m5761b) {
                i8 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.f17897s;
            layoutParams.flags = i8;
            this.f17895q.getClass();
            this.f17896r.updateViewLayout(this, layoutParams);
        }
        int ordinal = enumC3103m.ordinal();
        if (ordinal != 0) {
            i7 = 1;
            if (ordinal != 1) {
                throw new RuntimeException();
            }
        } else {
            i7 = 0;
        }
        super.setLayoutDirection(i7);
    }

    /* renamed from: k */
    public final void m5772k() {
        InterfaceC3238v parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.mo4923M()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates != null) {
                long mo4926S = parentLayoutCoordinates.mo4926S();
                long mo4933h = parentLayoutCoordinates.mo4933h(0L);
                C3101k m3278c = AbstractC2067b.m3278c((Math.round(Float.intBitsToFloat((int) (mo4933h >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (mo4933h & 4294967295L)))), mo4926S);
                if (!m3278c.equals(this.f17902x)) {
                    this.f17902x = m3278c;
                    m5774m();
                }
            }
        }
    }

    /* renamed from: l */
    public final void m5773l(InterfaceC3238v interfaceC3238v) {
        setParentLayoutCoordinates(interfaceC3238v);
        m5772k();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [u5.u, java.lang.Object] */
    /* renamed from: m */
    public final void m5774m() {
        C3102l m5919getPopupContentSizebOM6tXw;
        C3101k c3101k = this.f17902x;
        if (c3101k != null && (m5919getPopupContentSizebOM6tXw = m5919getPopupContentSizebOM6tXw()) != null) {
            long j6 = m5919getPopupContentSizebOM6tXw.f15702a;
            C3101k visibleDisplayBounds = getVisibleDisplayBounds();
            long m4788b = (visibleDisplayBounds.m4788b() & 4294967295L) | (visibleDisplayBounds.m4789c() << 32);
            ?? obj = new Object();
            obj.f16450e = 0L;
            this.f17886A.m5280c(this, C3752b.f17828l, new C3770t(obj, this, c3101k, m4788b, j6));
            long j7 = obj.f16450e;
            WindowManager.LayoutParams layoutParams = this.f17897s;
            layoutParams.x = (int) (j7 >> 32);
            layoutParams.y = (int) (j7 & 4294967295L);
            boolean z7 = this.f17892n.f17909e;
            C3773w c3773w = this.f17895q;
            if (z7) {
                c3773w.mo5775a(this, (int) (m4788b >> 32), (int) (m4788b & 4294967295L));
            }
            c3773w.getClass();
            this.f17896r.updateViewLayout(this, layoutParams);
        }
    }

    @Override // p170w1.AbstractC3652a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f17886A.m5281d();
        if (this.f17892n.f17907c && Build.VERSION.SDK_INT >= 33) {
            if (this.f17887B == null) {
                this.f17887B = new C3262k(1, this.f17891m);
            }
            AbstractC0497d.m1082d(this, this.f17887B);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C3474u c3474u = this.f17886A;
        C0230e0 c0230e0 = c3474u.f16760h;
        if (c0230e0 != null) {
            c0230e0.m507a();
        }
        c3474u.m5278a();
        if (Build.VERSION.SDK_INT >= 33) {
            AbstractC0497d.m1083e(this, this.f17887B);
        }
        this.f17887B = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f17892n.f17908d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            InterfaceC3277a interfaceC3277a = this.f17891m;
            if (interfaceC3277a != null) {
                interfaceC3277a.mo52a();
                return true;
            }
        } else if (motionEvent != null && motionEvent.getAction() == 4) {
            InterfaceC3277a interfaceC3277a2 = this.f17891m;
            if (interfaceC3277a2 != null) {
                interfaceC3277a2.mo52a();
            }
        } else {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public final void setParentLayoutDirection(EnumC3103m enumC3103m) {
        this.f17899u = enumC3103m;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m5920setPopupContentSizefhxjrPA(C3102l c3102l) {
        this.f17900v.setValue(c3102l);
    }

    public final void setPositionProvider(InterfaceC3774x interfaceC3774x) {
        this.f17898t = interfaceC3774x;
    }

    public final void setTestTag(String str) {
        this.f17893o = str;
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    public AbstractC3652a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i7) {
    }
}
