package p171w2;

import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.AbstractC0194j0;
import androidx.lifecycle.C0187g;
import androidx.lifecycle.C0216v;
import androidx.lifecycle.EnumC0201n;
import androidx.lifecycle.EnumC0203o;
import androidx.lifecycle.InterfaceC0213t;
import androidx.lifecycle.RunnableC0219y;
import com.paoman.lema.R;
import java.util.UUID;
import p008b.C0222a0;
import p008b.C0224b0;
import p008b.C0226c0;
import p008b.C0236h0;
import p008b.C0238i0;
import p008b.InterfaceC0240j0;
import p053g5.C1691j;
import p057h1.C1762l;
import p060h5.AbstractC1793a0;
import p067i4.AbstractC2072e;
import p096m3.C2572v;
import p102n1.AbstractC2710c;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p148t3.C3252a;
import p148t3.InterfaceC3254c;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p171w2.DialogC3769s;
import p172w3.C3781e;
import p172w3.InterfaceC3782f;
import p174w5.AbstractC3784a;
import p186y3.C3850a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w2.s */
/* loaded from: classes.dex */
public final class DialogC3769s extends Dialog implements InterfaceC0213t, InterfaceC0240j0, InterfaceC3254c, InterfaceC3782f {

    /* renamed from: e */
    public C0216v f17872e;

    /* renamed from: f */
    public final C3781e f17873f;

    /* renamed from: g */
    public final C1691j f17874g;

    /* renamed from: h */
    public final C1691j f17875h;

    /* renamed from: i */
    public InterfaceC3277a f17876i;

    /* renamed from: j */
    public C3767q f17877j;

    /* renamed from: k */
    public final View f17878k;

    /* renamed from: l */
    public final C3766p f17879l;

    /* renamed from: m */
    public boolean f17880m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogC3769s(InterfaceC3277a interfaceC3277a, C3767q c3767q, View view, EnumC3103m enumC3103m, InterfaceC3093c interfaceC3093c, UUID uuid) {
        super(new ContextThemeWrapper(r1, r2), 0);
        int i7;
        ViewGroup viewGroup;
        Context context = view.getContext();
        if (c3767q.f17870e) {
            i7 = R.style.DialogWindowTheme;
        } else {
            i7 = R.style.FloatingDialogWindowTheme;
        }
        this.f17873f = new C3781e(new C3850a(this, new C0226c0(18, this)), 1);
        final int i8 = 0;
        this.f17874g = AbstractC2710c.m4327J(new InterfaceC3277a(this) { // from class: b.n

            /* renamed from: f */
            public final /* synthetic */ DialogC3769s f969f;

            {
                this.f969f = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [t3.f, java.lang.Object] */
            @Override // p150t5.InterfaceC3277a
            /* renamed from: a */
            public final Object mo52a() {
                switch (i8) {
                    case 0:
                        ?? obj = new Object();
                        this.f969f.mo521c().m4096d(obj);
                        return obj;
                    default:
                        return new C0236h0(new RunnableC0219y(3, this.f969f));
                }
            }
        });
        final int i9 = 1;
        this.f17875h = AbstractC2710c.m4327J(new InterfaceC3277a(this) { // from class: b.n

            /* renamed from: f */
            public final /* synthetic */ DialogC3769s f969f;

            {
                this.f969f = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v1, types: [t3.f, java.lang.Object] */
            @Override // p150t5.InterfaceC3277a
            /* renamed from: a */
            public final Object mo52a() {
                switch (i9) {
                    case 0:
                        ?? obj = new Object();
                        this.f969f.mo521c().m4096d(obj);
                        return obj;
                    default:
                        return new C0236h0(new RunnableC0219y(3, this.f969f));
                }
            }
        });
        this.f17876i = interfaceC3277a;
        this.f17877j = c3767q;
        this.f17878k = view;
        float f7 = 8;
        Window window = getWindow();
        if (window != null) {
            window.requestFeature(1);
            window.setBackgroundDrawableResource(android.R.color.transparent);
            AbstractC1793a0.m2969I(window, this.f17877j.f17870e);
            window.setGravity(17);
            if (!this.f17877j.f17870e) {
                window.addFlags(65792);
                WindowManager.LayoutParams attributes = window.getAttributes();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    C3761k.f17853a.m5762a(attributes);
                }
                if (i10 >= 30) {
                    C3762l c3762l = C3762l.f17854a;
                    c3762l.m5763a(attributes, 0);
                    c3762l.m5764b(attributes, 0);
                }
                window.setAttributes(attributes);
            }
            C3766p c3766p = new C3766p(getContext(), window);
            setTitle(this.f17877j.f17871f);
            c3766p.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
            c3766p.setClipChildren(false);
            c3766p.setElevation(interfaceC3093c.mo4526y(f7));
            c3766p.setOutlineProvider(new C1762l(2));
            this.f17879l = c3766p;
            View decorView = window.getDecorView();
            if (decorView instanceof ViewGroup) {
                viewGroup = (ViewGroup) decorView;
            } else {
                viewGroup = null;
            }
            if (viewGroup != null) {
                m5766e(viewGroup);
            }
            setContentView(c3766p);
            AbstractC0194j0.m461f(c3766p, AbstractC0194j0.m458c(view));
            c3766p.setTag(R.id.view_tree_view_model_store_owner, AbstractC0194j0.m459d(view));
            c3766p.setTag(R.id.view_tree_saved_state_registry_owner, AbstractC2072e.m3333j(view));
            m5768h(this.f17876i, this.f17877j, enumC3103m);
            C0236h0 mo516a = mo516a();
            C3751a c3751a = new C3751a(this, 1);
            AbstractC3367j.m5100e(mo516a, "<this>");
            C0238i0 c0238i0 = new C0238i0(c3751a);
            final C0216v mo415g = mo415g();
            if (mo415g.f881c == EnumC0203o.f863e) {
                return;
            }
            C0222a0 c0222a0 = new C0222a0(c0238i0, new C0224b0(c0238i0, this));
            c0238i0.f926a.add(c0222a0);
            c0222a0.m482g(false);
            C2572v.m4094a(mo516a.m510a(), c0222a0);
            final C0187g c0187g = new C0187g(c0222a0, mo516a, mo415g);
            mo415g.m468a(c0187g);
            c0238i0.f928c.add(new AutoCloseable() { // from class: b.d0
                @Override // java.lang.AutoCloseable
                public final void close() {
                    C0216v.this.m473f(c0187g);
                }
            });
            return;
        }
        throw new IllegalStateException("Dialog has no window");
    }

    /* renamed from: d */
    public static void m5765d(DialogC3769s dialogC3769s) {
        super.onBackPressed();
    }

    /* renamed from: e */
    public static final void m5766e(ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        viewGroup.setClipChildren(false);
        if (!(viewGroup instanceof C3766p)) {
            int childCount = viewGroup.getChildCount();
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = viewGroup.getChildAt(i7);
                if (childAt instanceof ViewGroup) {
                    viewGroup2 = (ViewGroup) childAt;
                } else {
                    viewGroup2 = null;
                }
                if (viewGroup2 != null) {
                    m5766e(viewGroup2);
                }
            }
        }
    }

    @Override // p008b.InterfaceC0240j0
    /* renamed from: a */
    public final C0236h0 mo516a() {
        return (C0236h0) this.f17875h.getValue();
    }

    @Override // android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC3367j.m5100e(view, "view");
        m5767f();
        super.addContentView(view, layoutParams);
    }

    @Override // p172w3.InterfaceC3782f
    /* renamed from: b */
    public final C3781e mo520b() {
        return (C3781e) this.f17873f.f17918c;
    }

    @Override // p148t3.InterfaceC3254c
    /* renamed from: c */
    public final C2572v mo521c() {
        return mo516a().m510a();
    }

    /* renamed from: f */
    public final void m5767f() {
        Window window = getWindow();
        AbstractC3367j.m5097b(window);
        View decorView = window.getDecorView();
        AbstractC3367j.m5099d(decorView, "getDecorView(...)");
        AbstractC0194j0.m461f(decorView, this);
        Window window2 = getWindow();
        AbstractC3367j.m5097b(window2);
        View decorView2 = window2.getDecorView();
        AbstractC3367j.m5099d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        Window window3 = getWindow();
        AbstractC3367j.m5097b(window3);
        View decorView3 = window3.getDecorView();
        AbstractC3367j.m5099d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        Window window4 = getWindow();
        AbstractC3367j.m5097b(window4);
        View decorView4 = window4.getDecorView();
        AbstractC3367j.m5099d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0213t
    /* renamed from: g */
    public final C0216v mo415g() {
        C0216v c0216v = this.f17872e;
        if (c0216v == null) {
            C0216v c0216v2 = new C0216v(this, true);
            this.f17872e = c0216v2;
            return c0216v2;
        }
        return c0216v;
    }

    /* renamed from: h */
    public final void m5768h(InterfaceC3277a interfaceC3277a, C3767q c3767q, EnumC3103m enumC3103m) {
        int i7;
        int i8;
        boolean z7;
        int i9;
        this.f17876i = interfaceC3277a;
        this.f17877j = c3767q;
        EnumC3776z enumC3776z = c3767q.f17868c;
        boolean m5761b = AbstractC3760j.m5761b(this.f17878k);
        int ordinal = enumC3776z.ordinal();
        int i10 = 0;
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    m5761b = false;
                } else {
                    throw new RuntimeException();
                }
            } else {
                m5761b = true;
            }
        }
        Window window = getWindow();
        AbstractC3367j.m5097b(window);
        if (m5761b) {
            i7 = 8192;
        } else {
            i7 = -8193;
        }
        window.setFlags(i7, 8192);
        int ordinal2 = enumC3103m.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 == 1) {
                i8 = 1;
            } else {
                throw new RuntimeException();
            }
        } else {
            i8 = 0;
        }
        C3766p c3766p = this.f17879l;
        c3766p.setLayoutDirection(i8);
        boolean z8 = c3767q.f17870e;
        boolean z9 = c3767q.f17869d;
        Window window2 = c3766p.f17860m;
        if (c3766p.f17864q && z9 == c3766p.f17862o && z8 == c3766p.f17863p) {
            z7 = false;
        } else {
            z7 = true;
        }
        c3766p.f17862o = z9;
        c3766p.f17863p = z8;
        if (z7) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            if (z9) {
                i9 = -2;
            } else {
                i9 = -1;
            }
            if (i9 != attributes.width || !c3766p.f17864q) {
                window2.setLayout(i9, -2);
                c3766p.f17864q = true;
            }
        }
        setCanceledOnTouchOutside(c3767q.f17867b);
        Window window3 = getWindow();
        if (window3 != null) {
            if (!z8) {
                if (Build.VERSION.SDK_INT < 31) {
                    i10 = 16;
                } else {
                    i10 = 48;
                }
            }
            window3.setSoftInputMode(i10);
        }
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        ((C3252a) this.f17874g.getValue()).m4972a();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT >= 33) {
            C0236h0 mo516a = mo516a();
            onBackInvokedDispatcher = getOnBackInvokedDispatcher();
            AbstractC3367j.m5099d(onBackInvokedDispatcher, "getOnBackInvokedDispatcher(...)");
            mo516a.m511b(onBackInvokedDispatcher);
        }
        this.f17873f.m5785j(bundle);
        C0216v c0216v = this.f17872e;
        if (c0216v == null) {
            c0216v = new C0216v(this, true);
            this.f17872e = c0216v;
        }
        c0216v.m471d(EnumC0201n.ON_CREATE);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i7, KeyEvent keyEvent) {
        if (this.f17877j.f17866a && keyEvent.isTracking() && !keyEvent.isCanceled() && i7 == 111) {
            this.f17876i.mo52a();
            return true;
        }
        return super.onKeyUp(i7, keyEvent);
    }

    @Override // android.app.Dialog
    public final Bundle onSaveInstanceState() {
        Bundle onSaveInstanceState = super.onSaveInstanceState();
        AbstractC3367j.m5099d(onSaveInstanceState, "onSaveInstanceState(...)");
        this.f17873f.m5786k(onSaveInstanceState);
        return onSaveInstanceState;
    }

    @Override // android.app.Dialog
    public final void onStart() {
        super.onStart();
        C0216v c0216v = this.f17872e;
        if (c0216v == null) {
            c0216v = new C0216v(this, true);
            this.f17872e = c0216v;
        }
        c0216v.m471d(EnumC0201n.ON_RESUME);
    }

    @Override // android.app.Dialog
    public final void onStop() {
        C0216v c0216v = this.f17872e;
        if (c0216v == null) {
            c0216v = new C0216v(this, true);
            this.f17872e = c0216v;
        }
        c0216v.m471d(EnumC0201n.ON_DESTROY);
        this.f17872e = null;
        super.onStop();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x006b, code lost:
    
        if (r5 <= r1) goto L35;
     */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        View childAt;
        boolean onTouchEvent = super.onTouchEvent(motionEvent);
        if (this.f17877j.f17867b) {
            C3766p c3766p = this.f17879l;
            c3766p.getClass();
            float x6 = motionEvent.getX();
            if (!Float.isInfinite(x6) && !Float.isNaN(x6)) {
                float y7 = motionEvent.getY();
                if (!Float.isInfinite(y7) && !Float.isNaN(y7) && (childAt = c3766p.getChildAt(0)) != null) {
                    int left = childAt.getLeft() + c3766p.getLeft();
                    int width = childAt.getWidth() + left;
                    int top = childAt.getTop() + c3766p.getTop();
                    int height = childAt.getHeight() + top;
                    int m5794D = AbstractC3784a.m5794D(motionEvent.getX());
                    if (left <= m5794D) {
                        if (m5794D <= width) {
                            int m5794D2 = AbstractC3784a.m5794D(motionEvent.getY());
                            if (top <= m5794D2) {
                            }
                        }
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 0) {
                if (actionMasked != 1) {
                    if (actionMasked == 3) {
                        this.f17880m = false;
                        return onTouchEvent;
                    }
                } else if (this.f17880m) {
                    this.f17876i.mo52a();
                    this.f17880m = false;
                    return true;
                }
                return onTouchEvent;
            }
            this.f17880m = true;
            return true;
        }
        int actionMasked2 = motionEvent.getActionMasked();
        if (actionMasked2 == 0 || actionMasked2 == 1 || actionMasked2 == 3) {
            this.f17880m = false;
            return onTouchEvent;
        }
        return onTouchEvent;
    }

    @Override // android.app.Dialog
    public final void setContentView(int i7) {
        m5767f();
        super.setContentView(i7);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view) {
        AbstractC3367j.m5100e(view, "view");
        m5767f();
        super.setContentView(view);
    }

    @Override // android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        AbstractC3367j.m5100e(view, "view");
        m5767f();
        super.setContentView(view, layoutParams);
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
