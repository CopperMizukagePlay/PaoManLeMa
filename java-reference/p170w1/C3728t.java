package p170w1;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Looper;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.PointerIcon;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import android.view.autofill.AutofillValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.TranslationRequestValue;
import android.view.translation.ViewTranslationRequest;
import androidx.compose.p007ui.input.key.AbstractC0169a;
import androidx.compose.p007ui.input.rotary.AbstractC0171a;
import androidx.compose.p007ui.layout.AbstractC0173b;
import androidx.compose.p007ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.AbstractC0194j0;
import androidx.lifecycle.C0216v;
import androidx.lifecycle.InterfaceC0183e;
import androidx.lifecycle.InterfaceC0213t;
import androidx.lifecycle.RunnableC0219y;
import com.paoman.lema.R;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import p001a0.C0019e1;
import p001a0.C0031h1;
import p001a0.C0033i;
import p001a0.C0068q2;
import p002a1.ViewOnDragListenerC0099a;
import p008b.C0230e0;
import p008b.RunnableC0225c;
import p012b3.AbstractC0275c;
import p018c0.C0334d;
import p018c0.InputConnectionC0356z;
import p019c1.AbstractC0362f;
import p019c1.C0360d;
import p019c1.C0363g;
import p019c1.C0365i;
import p019c1.C0367k;
import p019c1.C0368l;
import p019c1.C0377u;
import p019c1.InterfaceC0366j;
import p020c2.C0382b;
import p020c2.C0389i;
import p020c2.ScrollCaptureCallbackC0384d;
import p027d1.C0465c;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0485r;
import p028d2.AbstractC0487t;
import p028d2.C0468a;
import p028d2.C0477j;
import p028d2.C0482o;
import p028d2.C0483p;
import p028d2.C0484q;
import p032d6.AbstractC0525d0;
import p035e1.AbstractC0656h;
import p035e1.AbstractC0659i0;
import p035e1.C0644b;
import p035e1.C0647c0;
import p035e1.C0652f;
import p035e1.C0661j0;
import p035e1.C0675q0;
import p035e1.C0676r;
import p035e1.InterfaceC0682x;
import p036e2.C0685a;
import p036e2.C0686b;
import p039e5.RunnableC1343un;
import p050g2.C1587g;
import p050g2.C1602n0;
import p051g3.AbstractC1653q;
import p051g3.AbstractC1655r;
import p051g3.AbstractC1657s;
import p053g5.C1694m;
import p053g5.InterfaceC1682a;
import p056h0.C1748v;
import p057h1.C1752b;
import p059h3.C1781g;
import p060h5.AbstractC1793a0;
import p060h5.AbstractC1804l;
import p060h5.AbstractC1806n;
import p065i2.AbstractC2064e;
import p066i3.AbstractC2067b;
import p067i4.AbstractC2072e;
import p077k.AbstractC2203m;
import p077k.AbstractC2204m0;
import p077k.C2184c0;
import p077k.C2194h0;
import p077k.C2209p;
import p077k.C2221w;
import p077k.C2222x;
import p080k2.InterfaceC2292c;
import p080k2.InterfaceC2293d;
import p082k5.InterfaceC2318h;
import p085l0.AbstractC2418w;
import p085l0.C2352e0;
import p085l0.C2361g1;
import p085l0.C2413u0;
import p086l1.C2431b;
import p086l1.InterfaceC2430a;
import p087l2.C2447k;
import p087l2.C2459w;
import p087l2.C2460x;
import p087l2.C2462z;
import p087l2.InputConnectionC2449m;
import p087l2.InputConnectionC2455s;
import p090l5.EnumC2465a;
import p092m.AbstractC2487d;
import p094m1.C2547a;
import p094m1.C2549c;
import p094m1.InterfaceC2548b;
import p096m3.C2560j;
import p096m3.C2572v;
import p098m5.AbstractC2583c;
import p100n.C2673p1;
import p101n0.C2702b;
import p101n0.C2705e;
import p109o1.C2803h;
import p117p1.C2843a0;
import p117p1.C2848d;
import p117p1.C2854g;
import p117p1.C2857h0;
import p117p1.C2870u;
import p117p1.InterfaceC2852f;
import p117p1.InterfaceC2865p;
import p121p6.RunnableC2885d;
import p131r1.C3025a;
import p139s1.AbstractC3088a;
import p140s2.C3091a;
import p140s2.C3095e;
import p140s2.C3100j;
import p140s2.C3101k;
import p140s2.EnumC3103m;
import p140s2.InterfaceC3093c;
import p146t1.AbstractC3191c1;
import p146t1.AbstractC3237u0;
import p146t1.AbstractC3243x0;
import p146t1.C3208i0;
import p146t1.C3245y0;
import p146t1.RunnableC3226p;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p150t5.InterfaceC3281e;
import p154u1.C3348d;
import p155u2.AbstractC3353a;
import p158u5.AbstractC3358a;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p160v.C3423m0;
import p161v0.AbstractC3465l;
import p161v0.C3473t;
import p161v0.C3474u;
import p162v1.AbstractC3497e1;
import p162v1.AbstractC3498f;
import p162v1.AbstractC3519m;
import p162v1.AbstractC3556y0;
import p162v1.C3490c1;
import p162v1.C3494d1;
import p162v1.C3502g0;
import p162v1.C3508i0;
import p162v1.C3514k0;
import p162v1.C3530p1;
import p162v1.C3531q;
import p162v1.C3544u0;
import p162v1.C3547v0;
import p162v1.C3553x0;
import p162v1.EnumC3496e0;
import p162v1.EnumC3540t;
import p162v1.InterfaceC3518l1;
import p162v1.InterfaceC3521m1;
import p162v1.InterfaceC3524n1;
import p162v1.InterfaceC3539s1;
import p162v1.InterfaceC3542t1;
import p162v1.InterfaceC3545u1;
import p170w1.C3728t;
import p170w1.C3743x0;
import p172w3.InterfaceC3782f;
import p174w5.AbstractC3784a;
import p177x0.AbstractC3809q;
import p177x0.C3812t;
import p177x0.InterfaceC3810r;
import p183y0.AbstractC3832a;
import p183y0.AbstractC3840i;
import p183y0.C3834c;
import p183y0.C3839h;
import p183y0.C3841j;
import p183y0.InterfaceC3837f;
import p191z0.ViewOnAttachStateChangeListenerC3864c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.t */
/* loaded from: classes.dex */
public final class C3728t extends ViewGroup implements InterfaceC3524n1, InterfaceC3545u1, InterfaceC2852f, InterfaceC0183e, InterfaceC3518l1 {

    /* renamed from: L0 */
    public static Class f17696L0;

    /* renamed from: M0 */
    public static Method f17697M0;

    /* renamed from: N0 */
    public static Method f17698N0;

    /* renamed from: O0 */
    public static final C2184c0 f17699O0 = new C2184c0();

    /* renamed from: P0 */
    public static RunnableC1343un f17700P0;

    /* renamed from: A */
    public final C3841j f17701A;

    /* renamed from: A0 */
    public float f17702A0;

    /* renamed from: B */
    public final ArrayList f17703B;

    /* renamed from: B0 */
    public float f17704B0;

    /* renamed from: C */
    public ArrayList f17705C;

    /* renamed from: C0 */
    public final RunnableC2885d f17706C0;

    /* renamed from: D */
    public boolean f17707D;

    /* renamed from: D0 */
    public final RunnableC0219y f17708D0;

    /* renamed from: E */
    public boolean f17709E;

    /* renamed from: E0 */
    public boolean f17710E0;

    /* renamed from: F */
    public final C2854g f17711F;

    /* renamed from: F0 */
    public final C3720r f17712F0;

    /* renamed from: G */
    public final C1748v f17713G;

    /* renamed from: G0 */
    public final InterfaceC3746y0 f17714G0;

    /* renamed from: H */
    public InterfaceC3279c f17715H;

    /* renamed from: H0 */
    public boolean f17716H0;

    /* renamed from: I */
    public final C2572v f17717I;

    /* renamed from: I0 */
    public final C0019e1 f17718I0;

    /* renamed from: J */
    public final C3834c f17719J;

    /* renamed from: J0 */
    public View f17720J0;

    /* renamed from: K */
    public boolean f17721K;

    /* renamed from: K0 */
    public final C3716q f17722K0;

    /* renamed from: L */
    public final C3680h f17723L;

    /* renamed from: M */
    public final C3676g f17724M;

    /* renamed from: N */
    public final C3530p1 f17725N;

    /* renamed from: O */
    public boolean f17726O;

    /* renamed from: P */
    public C3733u0 f17727P;

    /* renamed from: Q */
    public C3091a f17728Q;

    /* renamed from: R */
    public boolean f17729R;

    /* renamed from: S */
    public final C3547v0 f17730S;

    /* renamed from: T */
    public long f17731T;

    /* renamed from: U */
    public final int[] f17732U;

    /* renamed from: V */
    public final float[] f17733V;

    /* renamed from: W */
    public final float[] f17734W;

    /* renamed from: a0 */
    public final float[] f17735a0;

    /* renamed from: b0 */
    public long f17736b0;

    /* renamed from: c0 */
    public boolean f17737c0;

    /* renamed from: d0 */
    public long f17738d0;

    /* renamed from: e */
    public long f17739e;

    /* renamed from: e0 */
    public final C2361g1 f17740e0;

    /* renamed from: f */
    public final boolean f17741f;

    /* renamed from: f0 */
    public final C2352e0 f17742f0;

    /* renamed from: g */
    public final C3508i0 f17743g;

    /* renamed from: g0 */
    public InterfaceC3279c f17744g0;

    /* renamed from: h */
    public final C2361g1 f17745h;

    /* renamed from: h0 */
    public final ViewTreeObserverOnGlobalLayoutListenerC3684i f17746h0;

    /* renamed from: i */
    public final View f17747i;

    /* renamed from: i0 */
    public final ViewTreeObserverOnScrollChangedListenerC3688j f17748i0;

    /* renamed from: j */
    public final boolean f17749j;

    /* renamed from: j0 */
    public final ViewTreeObserverOnTouchModeChangeListenerC3692k f17750j0;

    /* renamed from: k */
    public final C0368l f17751k;

    /* renamed from: k0 */
    public final C2462z f17752k0;

    /* renamed from: l */
    public InterfaceC2318h f17753l;

    /* renamed from: l0 */
    public final C2460x f17754l0;

    /* renamed from: m */
    public final ViewOnDragListenerC0099a f17755m;

    /* renamed from: m0 */
    public final AtomicReference f17756m0;

    /* renamed from: n */
    public final C3726s1 f17757n;

    /* renamed from: n0 */
    public final C3682h1 f17758n0;

    /* renamed from: o */
    public final C0676r f17759o;

    /* renamed from: o0 */
    public final C3714p1 f17760o0;

    /* renamed from: p */
    public final C3729t0 f17761p;

    /* renamed from: p0 */
    public final C2361g1 f17762p0;

    /* renamed from: q */
    public final RunnableC3226p f17763q;

    /* renamed from: q0 */
    public int f17764q0;

    /* renamed from: r */
    public final C3502g0 f17765r;

    /* renamed from: r0 */
    public final C2361g1 f17766r0;

    /* renamed from: s */
    public final C2221w f17767s;

    /* renamed from: s0 */
    public final C2431b f17768s0;

    /* renamed from: t */
    public final C0685a f17769t;

    /* renamed from: t0 */
    public final C2549c f17770t0;

    /* renamed from: u */
    public final C3728t f17771u;

    /* renamed from: u0 */
    public final C3348d f17772u0;

    /* renamed from: v */
    public final C0484q f17773v;

    /* renamed from: v0 */
    public final C3709o0 f17774v0;

    /* renamed from: w */
    public final C3653a0 f17775w;

    /* renamed from: w0 */
    public MotionEvent f17776w0;

    /* renamed from: x */
    public ViewOnAttachStateChangeListenerC3864c f17777x;

    /* renamed from: x0 */
    public long f17778x0;

    /* renamed from: y */
    public final C3672f f17779y;

    /* renamed from: y0 */
    public final C0068q2 f17780y0;

    /* renamed from: z */
    public final C0652f f17781z;

    /* renamed from: z0 */
    public final C2184c0 f17782z0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v12, types: [h0.v, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v19, types: [w1.g, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [d2.d, x0.q] */
    /* JADX WARN: Type inference failed for: r0v41, types: [java.lang.Object, m3.v] */
    /* JADX WARN: Type inference failed for: r0v7, types: [w1.f, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v33, types: [w1.i] */
    /* JADX WARN: Type inference failed for: r1v34, types: [w1.j] */
    /* JADX WARN: Type inference failed for: r1v35, types: [w1.k] */
    /* JADX WARN: Type inference failed for: r1v39, types: [w1.p1, java.lang.Object] */
    public C3728t(Context context, InterfaceC2318h interfaceC2318h) {
        super(context);
        boolean z7;
        C2572v c2572v;
        C3834c c3834c;
        int i7;
        EnumC3103m enumC3103m;
        int i8;
        InterfaceC3746y0 c3749z0;
        AutofillId autofillId;
        final C3728t c3728t = this;
        c3728t.f17739e = 9205357640488583168L;
        int i9 = 1;
        c3728t.f17741f = true;
        c3728t.f17743g = new C3508i0();
        C3095e m3277b = AbstractC2067b.m3277b(context);
        C2413u0 c2413u0 = C2413u0.f13573h;
        c3728t.f17745h = new C2361g1(m3277b, c2413u0);
        int i10 = Build.VERSION.SDK_INT;
        int i11 = 0;
        if (i10 >= 35) {
            z7 = true;
        } else {
            z7 = false;
        }
        c3728t.f17749j = z7;
        ?? abstractC3809q = new AbstractC3809q();
        EmptySemanticsElement emptySemanticsElement = new EmptySemanticsElement(abstractC3809q);
        AbstractC3556y0 abstractC3556y0 = new AbstractC3556y0() { // from class: androidx.compose.ui.platform.AndroidComposeView$bringIntoViewNode$1
            public final boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                return false;
            }

            @Override // p162v1.AbstractC3556y0
            /* renamed from: h */
            public final AbstractC3809q mo312h() {
                return new AbstractC3809q();
            }

            public final int hashCode() {
                return C3728t.this.hashCode();
            }

            @Override // p162v1.AbstractC3556y0
            /* renamed from: i */
            public final void mo313i(AbstractC3809q abstractC3809q2) {
                ((C3743x0) abstractC3809q2).getClass();
            }
        };
        c3728t.f17751k = new C0368l(c3728t, c3728t);
        c3728t.f17753l = interfaceC2318h;
        c3728t.f17755m = new ViewOnDragListenerC0099a();
        c3728t.f17757n = new C3726s1();
        InterfaceC3810r m387a = AbstractC0169a.m387a(new C3712p(c3728t, i11));
        InterfaceC3810r m390a = AbstractC0171a.m390a();
        c3728t.f17759o = new C0676r();
        c3728t.f17761p = new C3729t0(ViewConfiguration.get(context));
        RunnableC3226p runnableC3226p = new RunnableC3226p();
        c3728t.f17763q = runnableC3226p;
        C3502g0 c3502g0 = new C3502g0(3);
        c3502g0.m5430f0(C3245y0.f16065b);
        c3502g0.m5424c0(c3728t.getDensity());
        c3502g0.m5434h0(c3728t.getViewConfiguration());
        c3502g0.m5432g0(AbstractC0173b.m397b(runnableC3226p).mo5829e(emptySemanticsElement).mo5829e(m390a).mo5829e(m387a).mo5829e(((C0368l) c3728t.getFocusOwner()).f1242e).mo5829e(c3728t.m5916getDragAndDropManager().f469c).mo5829e(abstractC3556y0));
        c3728t.f17765r = c3502g0;
        C2221w c2221w = AbstractC2203m.f12711a;
        c3728t.f17767s = new C2221w();
        c3728t.getLayoutNodes();
        c3728t.f17769t = new C0685a();
        c3728t.f17771u = c3728t;
        c3728t.f17773v = new C0484q(c3728t.getRoot(), abstractC3809q, c3728t.getLayoutNodes());
        C3653a0 c3653a0 = new C3653a0(c3728t);
        c3728t.f17775w = c3653a0;
        c3728t.f17777x = new ViewOnAttachStateChangeListenerC3864c(c3728t, new C0363g(0, c3728t, AbstractC3681h0.class, "getContentCaptureSessionCompat", "getContentCaptureSessionCompat(Landroid/view/View;)Landroidx/compose/ui/platform/coreshims/ContentCaptureSessionCompat;", 1, 0, 8));
        ?? obj = new Object();
        Object systemService = context.getSystemService("accessibility");
        AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.view.accessibility.AccessibilityManager");
        c3728t.f17779y = obj;
        c3728t.f17781z = new C0652f(c3728t);
        c3728t.f17701A = new C3841j();
        c3728t.f17703B = new ArrayList();
        c3728t.f17711F = new C2854g();
        C3502g0 root = c3728t.getRoot();
        ?? obj2 = new Object();
        obj2.f10651b = root;
        obj2.f10652c = new C2848d(root.f16872I.f16799c);
        obj2.f10653d = new C2673p1(4);
        obj2.f10654e = new C3531q();
        c3728t.f17713G = obj2;
        c3728t.f17715H = C3704n.f17611g;
        if (m5720h()) {
            C3841j autofillTree = c3728t.getAutofillTree();
            ?? obj3 = new Object();
            obj3.f13966e = c3728t;
            obj3.f13967f = autofillTree;
            AutofillManager m5843d = AbstractC3832a.m5843d(c3728t.getContext().getSystemService(AbstractC0656h.m1374h()));
            if (m5843d != null) {
                obj3.f13968g = m5843d;
                c3728t.setImportantForAutofill(1);
                C1781g m3334l = AbstractC2072e.m3334l(c3728t);
                if (m3334l != null) {
                    autofillId = AbstractC3832a.m5840a(m3334l.f10824a);
                } else {
                    autofillId = null;
                }
                if (autofillId != null) {
                    obj3.f13969h = autofillId;
                    c2572v = obj3;
                } else {
                    throw AbstractC2487d.m4041e("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Autofill service could not be located.");
            }
        } else {
            c2572v = null;
        }
        c3728t.f17717I = c2572v;
        if (m5720h()) {
            AutofillManager m5843d2 = AbstractC3832a.m5843d(context.getSystemService(AbstractC0656h.m1374h()));
            if (m5843d2 != null) {
                c3728t = this;
                c3834c = new C3834c(new C2673p1(14, m5843d2), getSemanticsOwner(), this, getRectManager(), context.getPackageName());
            } else {
                throw AbstractC2487d.m4041e("Autofill service could not be located.");
            }
        } else {
            c3834c = null;
        }
        c3728t.f17719J = c3834c;
        c3728t.f17723L = new C3680h(context);
        c3728t.getClipboardManager();
        c3728t.f17724M = new Object();
        c3728t.f17725N = new C3530p1(new C3712p(c3728t, i9));
        c3728t.f17730S = new C3547v0(c3728t.getRoot());
        long j6 = Integer.MAX_VALUE;
        c3728t.f17731T = (j6 & 4294967295L) | (j6 << 32);
        c3728t.f17732U = new int[]{0, 0};
        float[] m1350a = C0647c0.m1350a();
        c3728t.f17733V = m1350a;
        c3728t.f17734W = C0647c0.m1350a();
        c3728t.f17735a0 = C0647c0.m1350a();
        c3728t.f17736b0 = -1L;
        c3728t.f17738d0 = 9187343241974906880L;
        c3728t.f17740e0 = AbstractC2418w.m3980x(null);
        c3728t.f17742f0 = AbstractC2418w.m3974q(new C3720r(c3728t, i9));
        c3728t.f17746h0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: w1.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C3728t.this.m5737L();
            }
        };
        c3728t.f17748i0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: w1.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                C3728t.this.m5737L();
            }
        };
        c3728t.f17750j0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: w1.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z8) {
                int i12;
                C2549c c2549c = C3728t.this.f17770t0;
                if (z8) {
                    i12 = 1;
                } else {
                    i12 = 2;
                }
                c2549c.f13916a.setValue(new C2547a(i12));
            }
        };
        C2462z c2462z = new C2462z(c3728t.getView(), c3728t);
        c3728t.f17752k0 = c2462z;
        c3728t.f17754l0 = new C2460x(c2462z);
        c3728t.f17756m0 = new AtomicReference(null);
        c3728t.f17758n0 = new C3682h1(c3728t.getTextInputService());
        c3728t.f17760o0 = new Object();
        c3728t.f17762p0 = new C2361g1(AbstractC2067b.m3285j(context), c2413u0);
        Configuration configuration = context.getResources().getConfiguration();
        if (i10 >= 31) {
            i7 = configuration.fontWeightAdjustment;
        } else {
            i7 = 0;
        }
        c3728t.f17764q0 = i7;
        int layoutDirection = context.getResources().getConfiguration().getLayoutDirection();
        EnumC3103m enumC3103m2 = EnumC3103m.f15703e;
        if (layoutDirection != 0) {
            if (layoutDirection != 1) {
                enumC3103m = null;
            } else {
                enumC3103m = EnumC3103m.f15704f;
            }
        } else {
            enumC3103m = enumC3103m2;
        }
        c3728t.f17766r0 = AbstractC2418w.m3980x(enumC3103m != null ? enumC3103m : enumC3103m2);
        c3728t.f17768s0 = new C2431b(c3728t, 0);
        if (c3728t.isInTouchMode()) {
            i8 = 1;
        } else {
            i8 = 2;
        }
        c3728t.f17770t0 = new C2549c(i8);
        c3728t.f17772u0 = new C3348d(c3728t);
        c3728t.f17774v0 = new C3709o0(c3728t);
        c3728t.f17780y0 = new C0068q2(29);
        c3728t.f17782z0 = new C2184c0();
        c3728t.f17706C0 = new RunnableC2885d(i9, c3728t);
        c3728t.f17708D0 = new RunnableC0219y(13, c3728t);
        c3728t.f17712F0 = new C3720r(c3728t, 0);
        if (i10 < 29) {
            c3749z0 = new C0068q2(m1350a);
        } else {
            c3749z0 = new C3749z0();
        }
        c3728t.f17714G0 = c3749z0;
        c3728t.addOnAttachStateChangeListener(c3728t.f17777x);
        c3728t.setWillNotDraw(false);
        c3728t.setFocusable(true);
        if (i10 >= 26) {
            C3677g0.f17532a.m5669a(c3728t, 1, false);
        }
        c3728t.setFocusableInTouchMode(true);
        c3728t.setClipChildren(false);
        AbstractC1653q.m2698a(c3728t, c3653a0);
        c3728t.setOnDragListener(c3728t.m5916getDragAndDropManager());
        c3728t.getRoot().m5425d(c3728t);
        if (i10 >= 29) {
            C3661c0.f17498a.m5662a(c3728t);
        }
        if (z7) {
            View view = new View(context);
            view.setLayoutParams(new ViewGroup.LayoutParams(1, 1));
            view.setTag(R.id.hide_in_inspector_tag, Boolean.TRUE);
            c3728t.f17747i = view;
            c3728t.addView(view, -1);
        }
        c3728t.f17718I0 = i10 >= 31 ? new C0019e1(5, false) : null;
        c3728t.f17722K0 = new C3716q(c3728t);
    }

    /* renamed from: a */
    public static final void m5717a(C3728t c3728t, int i7, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        int m3640d;
        C3653a0 c3653a0 = c3728t.f17775w;
        if (AbstractC3367j.m5096a(str, c3653a0.f17444G)) {
            int m3640d2 = c3653a0.f17442E.m3640d(i7);
            if (m3640d2 != -1) {
                accessibilityNodeInfo.getExtras().putInt(str, m3640d2);
                return;
            }
            return;
        }
        if (AbstractC3367j.m5096a(str, c3653a0.f17445H) && (m3640d = c3653a0.f17443F.m3640d(i7)) != -1) {
            accessibilityNodeInfo.getExtras().putInt(str, m3640d);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3696l get_viewTreeOwners() {
        return (C3696l) this.f17740e0.getValue();
    }

    /* renamed from: h */
    public static boolean m5720h() {
        if (Build.VERSION.SDK_INT >= 26) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static void m5721i(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = viewGroup.getChildAt(i7);
            if (childAt instanceof C3728t) {
                ((C3728t) childAt).m5750y();
            } else if (childAt instanceof ViewGroup) {
                m5721i((ViewGroup) childAt);
            }
        }
    }

    /* renamed from: j */
    public static long m5722j(int i7) {
        int mode = View.MeasureSpec.getMode(i7);
        int size = View.MeasureSpec.getSize(i7);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824) {
                    long j6 = size;
                    return j6 | (j6 << 32);
                }
                throw new IllegalStateException();
            }
            return (0 << 32) | Integer.MAX_VALUE;
        }
        return (0 << 32) | size;
    }

    /* renamed from: l */
    public static View m5723l(View view, int i7) {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (AbstractC3367j.m5096a(declaredMethod.invoke(view, null), Integer.valueOf(i7))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i8 = 0; i8 < childCount; i8++) {
                    View m5723l = m5723l(viewGroup.getChildAt(i8), i7);
                    if (m5723l != null) {
                        return m5723l;
                    }
                }
            }
        }
        return null;
    }

    /* renamed from: o */
    public static void m5724o(C3502g0 c3502g0) {
        c3502g0.m5402D();
        C2705e m5451y = c3502g0.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            m5724o((C3502g0) objArr[i8]);
        }
    }

    /* renamed from: q */
    public static boolean m5725q(MotionEvent motionEvent) {
        boolean z7;
        if ((Float.floatToRawIntBits(motionEvent.getX()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawX()) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY()) & Integer.MAX_VALUE) < 2139095040) {
            z7 = false;
        } else {
            z7 = true;
        }
        if (!z7) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i7 = 1; i7 < pointerCount; i7++) {
                if ((Float.floatToRawIntBits(motionEvent.getX(i7)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getY(i7)) & Integer.MAX_VALUE) < 2139095040 && (Build.VERSION.SDK_INT < 29 || C3734u1.f17793a.m5754a(motionEvent, i7))) {
                    z7 = false;
                } else {
                    z7 = true;
                }
                if (z7) {
                    break;
                }
            }
        }
        return z7;
    }

    private void setDensity(InterfaceC3093c interfaceC3093c) {
        this.f17745h.setValue(interfaceC3093c);
    }

    private void setFontFamilyResolver(InterfaceC2293d interfaceC2293d) {
        this.f17762p0.setValue(interfaceC2293d);
    }

    private void setLayoutDirection(EnumC3103m enumC3103m) {
        this.f17766r0.setValue(enumC3103m);
    }

    private final void set_viewTreeOwners(C3696l c3696l) {
        this.f17740e0.setValue(c3696l);
    }

    /* renamed from: A */
    public final void m5726A(C3502g0 c3502g0, boolean z7, boolean z8, boolean z9) {
        C3502g0 m5447u;
        C3502g0 m5447u2;
        C3547v0 c3547v0 = this.f17730S;
        if (z7) {
            C0031h1 c0031h1 = c3547v0.f17052b;
            C3502g0 c3502g02 = c3502g0.f16890k;
            C3514k0 c3514k0 = c3502g0.f16873J;
            if (c3502g02 == null) {
                AbstractC3088a.m4750b("Error: requestLookaheadRemeasure cannot be called on a node outside LookaheadScope");
            }
            int ordinal = c3514k0.f16941d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2 && ordinal != 3) {
                        if (ordinal == 4) {
                            if (!c3514k0.f16942e || z8) {
                                c3514k0.f16942e = true;
                                c3514k0.f16953p.f17102z = true;
                                if (!c3502g0.f16883T) {
                                    if ((!AbstractC3367j.m5096a(c3502g0.m5409K(), Boolean.TRUE) && !C3547v0.m5510h(c3502g0)) || ((m5447u = c3502g0.m5447u()) != null && m5447u.f16873J.f16942e)) {
                                        if ((c3502g0.m5408J() || C3547v0.m5511i(c3502g0)) && ((m5447u2 = c3502g0.m5447u()) == null || !m5447u2.m5443q())) {
                                            c0031h1.m89b(c3502g0, EnumC3540t.f17018g);
                                        }
                                    } else {
                                        c0031h1.m89b(c3502g0, EnumC3540t.f17016e);
                                    }
                                    if (!c3547v0.f17054d && z9) {
                                        m5732G(c3502g0);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        throw new RuntimeException();
                    }
                } else {
                    return;
                }
            }
            c3547v0.f17058h.m4300b(new C3544u0(c3502g0, true, z8));
            return;
        }
        if (c3547v0.m5523p(c3502g0, z8) && z9) {
            m5732G(c3502g0);
        }
    }

    /* renamed from: B */
    public final void m5727B(C3502g0 c3502g0, boolean z7, boolean z8) {
        boolean z9;
        C3514k0 c3514k0 = c3502g0.f16873J;
        EnumC3540t enumC3540t = EnumC3540t.f17019h;
        C3547v0 c3547v0 = this.f17730S;
        if (z7) {
            C0031h1 c0031h1 = c3547v0.f17052b;
            int ordinal = c3514k0.f16941d.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new RuntimeException();
                            }
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            }
            if ((!c3514k0.f16942e && !c3514k0.f16943f) || z8) {
                c3514k0.f16943f = true;
                c3514k0.f16944g = true;
                C3553x0 c3553x0 = c3514k0.f16953p;
                c3553x0.f17069A = true;
                c3553x0.f17070B = true;
                if (!c3502g0.f16883T) {
                    C3502g0 m5447u = c3502g0.m5447u();
                    if (AbstractC3367j.m5096a(c3502g0.m5409K(), Boolean.TRUE) && ((m5447u == null || !m5447u.f16873J.f16942e) && (m5447u == null || !m5447u.f16873J.f16943f))) {
                        c0031h1.m89b(c3502g0, EnumC3540t.f17017f);
                    } else if (c3502g0.m5408J() && ((m5447u == null || !m5447u.m5442p()) && (m5447u == null || !m5447u.m5443q()))) {
                        c0031h1.m89b(c3502g0, enumC3540t);
                    }
                    if (!c3547v0.f17054d) {
                        m5732G(null);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        c3547v0.getClass();
        int ordinal2 = c3514k0.f16941d.ordinal();
        if (ordinal2 != 0 && ordinal2 != 1 && ordinal2 != 2 && ordinal2 != 3) {
            if (ordinal2 == 4) {
                C3502g0 m5447u2 = c3502g0.m5447u();
                if (m5447u2 != null && !m5447u2.m5408J()) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                if (!z8) {
                    if (!c3502g0.m5443q()) {
                        if (c3502g0.m5442p() && c3502g0.m5408J() == z9 && c3502g0.m5408J() == c3514k0.f16953p.f17101y) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                C3553x0 c3553x02 = c3514k0.f16953p;
                c3553x02.f17069A = true;
                c3553x02.f17070B = true;
                if (!c3502g0.f16883T && c3553x02.f17101y && z9) {
                    if ((m5447u2 == null || !m5447u2.m5442p()) && (m5447u2 == null || !m5447u2.m5443q())) {
                        c3547v0.f17052b.m89b(c3502g0, enumC3540t);
                    }
                    if (!c3547v0.f17054d) {
                        m5732G(null);
                        return;
                    }
                    return;
                }
                return;
            }
            throw new RuntimeException();
        }
    }

    /* renamed from: C */
    public final void m5728C() {
        C3653a0 c3653a0 = this.f17775w;
        c3653a0.f17438A = true;
        if (c3653a0.m5648o() && !c3653a0.f17449L) {
            c3653a0.f17449L = true;
            c3653a0.f17462l.post(c3653a0.f17451N);
        }
        ViewOnAttachStateChangeListenerC3864c viewOnAttachStateChangeListenerC3864c = this.f17777x;
        viewOnAttachStateChangeListenerC3864c.f18110k = true;
        if (viewOnAttachStateChangeListenerC3864c.m5877h() && !viewOnAttachStateChangeListenerC3864c.f18117r) {
            viewOnAttachStateChangeListenerC3864c.f18117r = true;
            viewOnAttachStateChangeListenerC3864c.f18112m.post(viewOnAttachStateChangeListenerC3864c.f18118s);
        }
    }

    /* renamed from: D */
    public final void m5729D() {
        if (!this.f17737c0) {
            long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
            if (currentAnimationTimeMillis != this.f17736b0) {
                this.f17736b0 = currentAnimationTimeMillis;
                InterfaceC3746y0 interfaceC3746y0 = this.f17714G0;
                float[] fArr = this.f17734W;
                interfaceC3746y0.mo143g(this, fArr);
                AbstractC3681h0.m5694u(fArr, this.f17735a0);
                ViewParent parent = getParent();
                View view = this;
                while (parent instanceof ViewGroup) {
                    view = (View) parent;
                    parent = ((ViewGroup) view).getParent();
                }
                int[] iArr = this.f17732U;
                view.getLocationOnScreen(iArr);
                float f7 = iArr[0];
                float f8 = iArr[1];
                view.getLocationInWindow(iArr);
                float f9 = iArr[0];
                float f10 = f8 - iArr[1];
                this.f17738d0 = (Float.floatToRawIntBits(f7 - f9) << 32) | (Float.floatToRawIntBits(f10) & 4294967295L);
            }
        }
    }

    /* renamed from: E */
    public final void m5730E(MotionEvent motionEvent) {
        this.f17736b0 = AnimationUtils.currentAnimationTimeMillis();
        InterfaceC3746y0 interfaceC3746y0 = this.f17714G0;
        float[] fArr = this.f17734W;
        interfaceC3746y0.mo143g(this, fArr);
        AbstractC3681h0.m5694u(fArr, this.f17735a0);
        float x6 = motionEvent.getX();
        float y7 = motionEvent.getY();
        long m1351b = C0647c0.m1351b((Float.floatToRawIntBits(x6) << 32) | (Float.floatToRawIntBits(y7) & 4294967295L), fArr);
        float rawX = motionEvent.getRawX() - Float.intBitsToFloat((int) (m1351b >> 32));
        float rawY = motionEvent.getRawY() - Float.intBitsToFloat((int) (m1351b & 4294967295L));
        this.f17738d0 = (Float.floatToRawIntBits(rawX) << 32) | (Float.floatToRawIntBits(rawY) & 4294967295L);
    }

    /* renamed from: F */
    public final boolean m5731F() {
        if (!isFocused() && !hasFocus()) {
            return super.requestFocus(130, null);
        }
        return true;
    }

    /* renamed from: G */
    public final void m5732G(C3502g0 c3502g0) {
        if (!isLayoutRequested() && isAttachedToWindow()) {
            if (c3502g0 != null) {
                while (c3502g0 != null && c3502g0.m5444r() == EnumC3496e0.f16824e) {
                    if (!this.f17729R) {
                        C3502g0 m5447u = c3502g0.m5447u();
                        if (m5447u == null) {
                            break;
                        }
                        long j6 = m5447u.f16872I.f16799c.f16056h;
                        if (C3091a.m4758f(j6) && C3091a.m4757e(j6)) {
                            break;
                        }
                    }
                    c3502g0 = c3502g0.m5447u();
                }
                if (c3502g0 == getRoot()) {
                    requestLayout();
                    return;
                }
            }
            if (getWidth() != 0 && getHeight() != 0) {
                invalidate();
            } else {
                requestLayout();
            }
        }
    }

    /* renamed from: H */
    public final long m5733H(long j6) {
        m5729D();
        float intBitsToFloat = Float.intBitsToFloat((int) (j6 >> 32)) - Float.intBitsToFloat((int) (this.f17738d0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j6 & 4294967295L)) - Float.intBitsToFloat((int) (this.f17738d0 & 4294967295L));
        return C0647c0.m1351b((Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), this.f17735a0);
    }

    /* renamed from: I */
    public final int m5734I(MotionEvent motionEvent) {
        Object obj;
        if (this.f17716H0) {
            this.f17716H0 = false;
            int metaState = motionEvent.getMetaState();
            this.f17757n.getClass();
            AbstractC3691j2.f17578a.setValue(new C2843a0(metaState));
        }
        C2854g c2854g = this.f17711F;
        C0068q2 m4510a = c2854g.m4510a(motionEvent, this);
        C1748v c1748v = this.f17713G;
        if (m4510a != null) {
            List list = (List) m4510a.f344f;
            int size = list.size() - 1;
            if (size >= 0) {
                while (true) {
                    int i7 = size - 1;
                    obj = list.get(size);
                    if (((C2870u) obj).f15028e) {
                        break;
                    }
                    if (i7 < 0) {
                        break;
                    }
                    size = i7;
                }
            }
            obj = null;
            C2870u c2870u = (C2870u) obj;
            if (c2870u != null) {
                this.f17739e = c2870u.f15027d;
            }
            int m2802c = c1748v.m2802c(m4510a, this, m5743r(motionEvent));
            m4510a.f345g = null;
            int actionMasked = motionEvent.getActionMasked();
            if ((actionMasked != 0 && actionMasked != 5) || (m2802c & 1) != 0) {
                return m2802c;
            }
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            c2854g.f14960c.delete(pointerId);
            c2854g.f14959b.delete(pointerId);
            return m2802c;
        }
        if (!c1748v.f10650a) {
            C2209p c2209p = (C2209p) ((C2673p1) c1748v.f10653d).f14390f;
            int i8 = c2209p.f12721h;
            Object[] objArr = c2209p.f12720g;
            for (int i9 = 0; i9 < i8; i9++) {
                objArr[i9] = null;
            }
            c2209p.f12721h = 0;
            c2209p.f12718e = false;
            ((C2848d) c1748v.f10652c).m4508c();
        }
        return 0;
    }

    /* renamed from: J */
    public final void m5735J(MotionEvent motionEvent, int i7, long j6, boolean z7) {
        int i8;
        int buttonState;
        long downTime;
        int i9;
        int actionMasked = motionEvent.getActionMasked();
        int i10 = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                i10 = motionEvent.getActionIndex();
            }
        } else if (i7 != 9 && i7 != 10) {
            i10 = 0;
        }
        int pointerCount = motionEvent.getPointerCount();
        if (i10 >= 0) {
            i8 = 1;
        } else {
            i8 = 0;
        }
        int i11 = pointerCount - i8;
        if (i11 == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            pointerPropertiesArr[i12] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            pointerCoordsArr[i13] = new MotionEvent.PointerCoords();
        }
        for (int i14 = 0; i14 < i11; i14++) {
            if (i10 >= 0 && i14 >= i10) {
                i9 = 1;
            } else {
                i9 = 0;
            }
            int i15 = i9 + i14;
            motionEvent.getPointerProperties(i15, pointerPropertiesArr[i14]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i14];
            motionEvent.getPointerCoords(i15, pointerCoords);
            float f7 = pointerCoords.x;
            float f8 = pointerCoords.y;
            long m5746u = m5746u((Float.floatToRawIntBits(f8) & 4294967295L) | (Float.floatToRawIntBits(f7) << 32));
            pointerCoords.x = Float.intBitsToFloat((int) (m5746u >> 32));
            pointerCoords.y = Float.intBitsToFloat((int) (m5746u & 4294967295L));
        }
        if (z7) {
            buttonState = 0;
        } else {
            buttonState = motionEvent.getButtonState();
        }
        if (motionEvent.getDownTime() == motionEvent.getEventTime()) {
            downTime = j6;
        } else {
            downTime = motionEvent.getDownTime();
        }
        MotionEvent obtain = MotionEvent.obtain(downTime, j6, i7, i11, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), buttonState, motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        C0068q2 m4510a = this.f17711F.m4510a(obtain, this);
        AbstractC3367j.m5097b(m4510a);
        this.f17713G.m2802c(m4510a, this, true);
        obtain.recycle();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* renamed from: K */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5736K(InterfaceC3281e interfaceC3281e, AbstractC2583c abstractC2583c) {
        C3724s c3724s;
        int i7;
        if (abstractC2583c instanceof C3724s) {
            c3724s = (C3724s) abstractC2583c;
            int i8 = c3724s.f17691j;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c3724s.f17691j = i8 - Integer.MIN_VALUE;
                Object obj = c3724s.f17689h;
                i7 = c3724s.f17691j;
                if (i7 == 0) {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC1793a0.m2972L(obj);
                } else {
                    AbstractC1793a0.m2972L(obj);
                    C3712p c3712p = new C3712p(this, 2);
                    c3724s.f17691j = 1;
                    if (AbstractC0525d0.m1130h(new C0334d(c3712p, this.f17756m0, interfaceC3281e, null), c3724s) == EnumC2465a.f13750e) {
                        return;
                    }
                }
                throw new RuntimeException();
            }
        }
        c3724s = new C3724s(this, abstractC2583c);
        Object obj2 = c3724s.f17689h;
        i7 = c3724s.f17691j;
        if (i7 == 0) {
        }
        throw new RuntimeException();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0078  */
    /* renamed from: L */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m5737L() {
        boolean z7;
        View view;
        long j6;
        long m3225F;
        float[] fArr;
        int m5130a;
        C0686b c0686b;
        boolean z8;
        long j7;
        boolean z9;
        int[] iArr = this.f17732U;
        getLocationOnScreen(iArr);
        long j8 = this.f17731T;
        int i7 = (int) (j8 >> 32);
        int i8 = (int) (j8 & 4294967295L);
        int i9 = iArr[0];
        if (i7 != i9 || i8 != iArr[1] || this.f17736b0 < 0) {
            this.f17731T = (i9 << 32) | (iArr[1] & 4294967295L);
            if (i7 != Integer.MAX_VALUE && i8 != Integer.MAX_VALUE) {
                getRoot().f16873J.f16953p.m5533y0();
                z7 = true;
                m5729D();
                view = this.f17720J0;
                if (view == null) {
                    view = getRootView();
                    this.f17720J0 = view;
                }
                C0685a rectManager = getRectManager();
                j6 = this.f17731T;
                m3225F = AbstractC2064e.m3225F(this.f17738d0);
                int width = view.getWidth();
                int height = view.getHeight();
                rectManager.getClass();
                fArr = this.f17734W;
                m5130a = AbstractC3393k.m5130a(fArr);
                c0686b = rectManager.f2218b;
                if ((m5130a & 2) != 0) {
                    fArr = null;
                }
                if (C3100j.m4783a(m3225F, c0686b.f2229c)) {
                    c0686b.f2229c = m3225F;
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!C3100j.m4783a(j6, c0686b.f2230d)) {
                    c0686b.f2230d = j6;
                    z8 = true;
                }
                if (fArr != null) {
                    z8 = true;
                }
                j7 = (width << 32) | (height & 4294967295L);
                if (j7 != c0686b.f2231e) {
                    c0686b.f2231e = j7;
                    z8 = true;
                }
                if (z8 && !rectManager.f2221e) {
                    z9 = false;
                } else {
                    z9 = true;
                }
                rectManager.f2221e = z9;
                this.f17730S.m5512a(z7);
                getRectManager().m1466b();
            }
        }
        z7 = false;
        m5729D();
        view = this.f17720J0;
        if (view == null) {
        }
        C0685a rectManager2 = getRectManager();
        j6 = this.f17731T;
        m3225F = AbstractC2064e.m3225F(this.f17738d0);
        int width2 = view.getWidth();
        int height2 = view.getHeight();
        rectManager2.getClass();
        fArr = this.f17734W;
        m5130a = AbstractC3393k.m5130a(fArr);
        c0686b = rectManager2.f2218b;
        if ((m5130a & 2) != 0) {
        }
        if (C3100j.m4783a(m3225F, c0686b.f2229c)) {
        }
        if (!C3100j.m4783a(j6, c0686b.f2230d)) {
        }
        if (fArr != null) {
        }
        j7 = (width2 << 32) | (height2 & 4294967295L);
        if (j7 != c0686b.f2231e) {
        }
        if (z8) {
        }
        z9 = true;
        rectManager2.f2221e = z9;
        this.f17730S.m5512a(z7);
        getRectManager().m1466b();
    }

    /* renamed from: M */
    public final void m5738M(float f7) {
        if (this.f17749j) {
            if (f7 > 0.0f) {
                if (Float.isNaN(this.f17702A0) || f7 > this.f17702A0) {
                    this.f17702A0 = f7;
                    return;
                }
                return;
            }
            if (f7 < 0.0f) {
                if (Float.isNaN(this.f17704B0) || f7 < this.f17704B0) {
                    this.f17704B0 = f7;
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view) {
        addView(view, -1);
    }

    @Override // android.view.View
    public final void autofill(SparseArray sparseArray) {
        boolean isText;
        boolean isDate;
        boolean isList;
        boolean isToggle;
        CharSequence textValue;
        boolean isText2;
        boolean isDate2;
        boolean isList2;
        boolean isToggle2;
        C0477j m5449w;
        InterfaceC3279c interfaceC3279c;
        CharSequence textValue2;
        if (m5720h()) {
            C3834c c3834c = this.f17719J;
            if (c3834c != null) {
                int size = sparseArray.size();
                for (int i7 = 0; i7 < size; i7++) {
                    int keyAt = sparseArray.keyAt(i7);
                    AutofillValue m5844e = AbstractC3832a.m5844e(sparseArray.get(keyAt));
                    isText2 = m5844e.isText();
                    if (!isText2) {
                        isDate2 = m5844e.isDate();
                        if (!isDate2) {
                            isList2 = m5844e.isList();
                            if (!isList2) {
                                isToggle2 = m5844e.isToggle();
                                if (isToggle2) {
                                    Log.w("ComposeAutofillManager", "Auto filling toggle fields are not yet supported.");
                                }
                            } else {
                                Log.w("ComposeAutofillManager", "Auto filling dropdown lists is not yet supported.");
                            }
                        } else {
                            Log.w("ComposeAutofillManager", "Auto filling Date fields is not yet supported.");
                        }
                    } else {
                        C3502g0 c3502g0 = (C3502g0) c3834c.f18046b.f1702c.m3612b(keyAt);
                        if (c3502g0 != null && (m5449w = c3502g0.m5449w()) != null) {
                            Object m3592g = m5449w.f1683e.m3592g(AbstractC0476i.f1663g);
                            if (m3592g == null) {
                                m3592g = null;
                            }
                            C0468a c0468a = (C0468a) m3592g;
                            if (c0468a != null && (interfaceC3279c = (InterfaceC3279c) c0468a.f1639b) != null) {
                                textValue2 = m5844e.getTextValue();
                            }
                        }
                    }
                }
            }
            C2572v c2572v = this.f17717I;
            if (c2572v != null) {
                C3841j c3841j = (C3841j) c2572v.f13967f;
                if (!c3841j.f18055a.isEmpty()) {
                    int size2 = sparseArray.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        int keyAt2 = sparseArray.keyAt(i8);
                        AutofillValue m5844e2 = AbstractC3832a.m5844e(sparseArray.get(keyAt2));
                        isText = m5844e2.isText();
                        if (isText) {
                            textValue = m5844e2.getTextValue();
                            textValue.toString();
                            if (c3841j.f18055a.get(Integer.valueOf(keyAt2)) != null) {
                                throw new ClassCastException();
                            }
                        } else {
                            isDate = m5844e2.isDate();
                            if (!isDate) {
                                isList = m5844e2.isList();
                                if (!isList) {
                                    isToggle = m5844e2.isToggle();
                                    if (isToggle) {
                                        throw new Error("An operation is not implemented: b/138604541:  Add onFill() callback for toggle");
                                    }
                                } else {
                                    throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for list");
                                }
                            } else {
                                throw new Error("An operation is not implemented: b/138604541: Add onFill() callback for date");
                            }
                        }
                    }
                }
            }
        }
    }

    @Override // androidx.lifecycle.InterfaceC0183e
    /* renamed from: b */
    public final void mo450b(InterfaceC0213t interfaceC0213t) {
        if (Build.VERSION.SDK_INT < 30) {
            setShowLayoutBounds(AbstractC3681h0.m5692s());
        }
    }

    @Override // android.view.View
    public final boolean canScrollHorizontally(int i7) {
        return this.f17775w.m5640f(false, i7, this.f17739e);
    }

    @Override // android.view.View
    public final boolean canScrollVertically(int i7) {
        return this.f17775w.m5640f(true, i7, this.f17739e);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            m5724o(getRoot());
        }
        m5747v(true);
        AbstractC3465l.m5244k().mo5201m();
        this.f17707D = true;
        C0676r c0676r = this.f17759o;
        C0644b c0644b = c0676r.f2203a;
        Canvas canvas2 = c0644b.f2123a;
        c0644b.f2123a = canvas;
        getRoot().m5435i(c0644b, null);
        c0676r.f2203a.f2123a = canvas2;
        ArrayList arrayList = this.f17703B;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            for (int i7 = 0; i7 < size; i7++) {
                ((C3710o1) ((InterfaceC3521m1) arrayList.get(i7))).m5713f();
            }
        }
        int i8 = AbstractC3683h2.f17537e;
        arrayList.clear();
        this.f17707D = false;
        ArrayList arrayList2 = this.f17705C;
        if (arrayList2 != null) {
            arrayList.addAll(arrayList2);
            arrayList2.clear();
        }
        if (this.f17749j) {
            AbstractC3740w0.m5757a(this, this.f17702A0);
            View view = this.f17747i;
            if (view != null) {
                AbstractC3740w0.m5757a(view, this.f17704B0);
                if (!Float.isNaN(this.f17704B0)) {
                    view.invalidate();
                    drawChild(canvas, view, getDrawingTime());
                }
                this.f17702A0 = Float.NaN;
                this.f17704B0 = Float.NaN;
            } else {
                AbstractC3367j.m5105j("frameRateCategoryView");
                throw null;
            }
        }
        getRectManager().m1466b();
    }

    @Override // android.view.View
    public final boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        C3490c1 c3490c1;
        C3025a c3025a;
        int size;
        C3490c1 c3490c12;
        AbstractC3809q abstractC3809q;
        C3490c1 c3490c13;
        if (this.f17710E0) {
            RunnableC0219y runnableC0219y = this.f17708D0;
            removeCallbacks(runnableC0219y);
            if (motionEvent.getActionMasked() == 8) {
                this.f17710E0 = false;
            } else {
                runnableC0219y.run();
            }
        }
        if (!m5725q(motionEvent) && isAttachedToWindow()) {
            if (motionEvent.getActionMasked() == 8) {
                if (motionEvent.isFromSource(4194304)) {
                    ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
                    motionEvent.getAxisValue(26);
                    Context context = getContext();
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 26) {
                        Method method = AbstractC1657s.f10425a;
                        AbstractC1655r.m2702c(viewConfiguration);
                    } else {
                        AbstractC1657s.m2705a(viewConfiguration, context);
                    }
                    Context context2 = getContext();
                    if (i7 >= 26) {
                        AbstractC1655r.m2701b(viewConfiguration);
                    } else {
                        AbstractC1657s.m2705a(viewConfiguration, context2);
                    }
                    motionEvent.getEventTime();
                    motionEvent.getDeviceId();
                    C0368l c0368l = (C0368l) getFocusOwner();
                    if (c0368l.f1241d.f1234e) {
                        System.out.println((Object) "FocusRelatedWarning: Dispatching rotary event while the focus system is invalidated.");
                        return false;
                    }
                    C0377u m809g = AbstractC0362f.m809g(c0368l.f1240c);
                    if (m809g != null) {
                        if (!m809g.f17992e.f18005r) {
                            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
                        }
                        AbstractC3809q abstractC3809q2 = m809g.f17992e;
                        C3502g0 m5382v = AbstractC3498f.m5382v(m809g);
                        loop0: while (true) {
                            if (m5382v != null) {
                                if ((m5382v.f16872I.f16802f.f17995h & 16384) != 0) {
                                    while (abstractC3809q2 != null) {
                                        if ((abstractC3809q2.f17994g & 16384) != 0) {
                                            abstractC3809q = abstractC3809q2;
                                            C2705e c2705e = null;
                                            while (abstractC3809q != null) {
                                                if (abstractC3809q instanceof C3025a) {
                                                    break loop0;
                                                }
                                                if ((abstractC3809q.f17994g & 16384) != 0 && (abstractC3809q instanceof AbstractC3519m)) {
                                                    int i8 = 0;
                                                    for (AbstractC3809q abstractC3809q3 = ((AbstractC3519m) abstractC3809q).f16962t; abstractC3809q3 != null; abstractC3809q3 = abstractC3809q3.f17997j) {
                                                        if ((abstractC3809q3.f17994g & 16384) != 0) {
                                                            i8++;
                                                            if (i8 == 1) {
                                                                abstractC3809q = abstractC3809q3;
                                                            } else {
                                                                if (c2705e == null) {
                                                                    c2705e = new C2705e(new AbstractC3809q[16]);
                                                                }
                                                                if (abstractC3809q != null) {
                                                                    c2705e.m4300b(abstractC3809q);
                                                                    abstractC3809q = null;
                                                                }
                                                                c2705e.m4300b(abstractC3809q3);
                                                            }
                                                        }
                                                    }
                                                    if (i8 == 1) {
                                                    }
                                                }
                                                abstractC3809q = AbstractC3498f.m5366f(c2705e);
                                            }
                                        }
                                        abstractC3809q2 = abstractC3809q2.f17996i;
                                    }
                                }
                                m5382v = m5382v.m5447u();
                                if (m5382v != null && (c3490c13 = m5382v.f16872I) != null) {
                                    abstractC3809q2 = c3490c13.f16801e;
                                } else {
                                    abstractC3809q2 = null;
                                }
                            } else {
                                abstractC3809q = null;
                                break;
                            }
                        }
                        c3025a = (C3025a) abstractC3809q;
                    } else {
                        c3025a = null;
                    }
                    if (c3025a != null) {
                        C3025a c3025a2 = c3025a;
                        if (!c3025a2.f17992e.f18005r) {
                            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
                        }
                        AbstractC3809q abstractC3809q4 = c3025a2.f17992e.f17996i;
                        C3502g0 m5382v2 = AbstractC3498f.m5382v(c3025a);
                        ArrayList arrayList = null;
                        while (m5382v2 != null) {
                            if ((m5382v2.f16872I.f16802f.f17995h & 16384) != 0) {
                                while (abstractC3809q4 != null) {
                                    if ((abstractC3809q4.f17994g & 16384) != 0) {
                                        AbstractC3809q abstractC3809q5 = abstractC3809q4;
                                        C2705e c2705e2 = null;
                                        while (abstractC3809q5 != null) {
                                            if (abstractC3809q5 instanceof C3025a) {
                                                if (arrayList == null) {
                                                    arrayList = new ArrayList();
                                                }
                                                arrayList.add(abstractC3809q5);
                                            } else if ((abstractC3809q5.f17994g & 16384) != 0 && (abstractC3809q5 instanceof AbstractC3519m)) {
                                                int i9 = 0;
                                                for (AbstractC3809q abstractC3809q6 = ((AbstractC3519m) abstractC3809q5).f16962t; abstractC3809q6 != null; abstractC3809q6 = abstractC3809q6.f17997j) {
                                                    if ((abstractC3809q6.f17994g & 16384) != 0) {
                                                        i9++;
                                                        if (i9 == 1) {
                                                            abstractC3809q5 = abstractC3809q6;
                                                        } else {
                                                            if (c2705e2 == null) {
                                                                c2705e2 = new C2705e(new AbstractC3809q[16]);
                                                            }
                                                            if (abstractC3809q5 != null) {
                                                                c2705e2.m4300b(abstractC3809q5);
                                                                abstractC3809q5 = null;
                                                            }
                                                            c2705e2.m4300b(abstractC3809q6);
                                                        }
                                                    }
                                                }
                                                if (i9 == 1) {
                                                }
                                            }
                                            abstractC3809q5 = AbstractC3498f.m5366f(c2705e2);
                                        }
                                    }
                                    abstractC3809q4 = abstractC3809q4.f17996i;
                                }
                            }
                            m5382v2 = m5382v2.m5447u();
                            if (m5382v2 != null && (c3490c12 = m5382v2.f16872I) != null) {
                                abstractC3809q4 = c3490c12.f16801e;
                            } else {
                                abstractC3809q4 = null;
                            }
                        }
                        if (arrayList != null && arrayList.size() - 1 >= 0) {
                            while (true) {
                                int i10 = size - 1;
                                ((C3025a) arrayList.get(size)).getClass();
                                if (i10 < 0) {
                                    break;
                                }
                                size = i10;
                            }
                        }
                        AbstractC3809q abstractC3809q7 = c3025a2.f17992e;
                        C2705e c2705e3 = null;
                        while (abstractC3809q7 != null) {
                            if (abstractC3809q7 instanceof C3025a) {
                            } else if ((abstractC3809q7.f17994g & 16384) != 0 && (abstractC3809q7 instanceof AbstractC3519m)) {
                                int i11 = 0;
                                for (AbstractC3809q abstractC3809q8 = ((AbstractC3519m) abstractC3809q7).f16962t; abstractC3809q8 != null; abstractC3809q8 = abstractC3809q8.f17997j) {
                                    if ((abstractC3809q8.f17994g & 16384) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            abstractC3809q7 = abstractC3809q8;
                                        } else {
                                            if (c2705e3 == null) {
                                                c2705e3 = new C2705e(new AbstractC3809q[16]);
                                            }
                                            if (abstractC3809q7 != null) {
                                                c2705e3.m4300b(abstractC3809q7);
                                                abstractC3809q7 = null;
                                            }
                                            c2705e3.m4300b(abstractC3809q8);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            abstractC3809q7 = AbstractC3498f.m5366f(c2705e3);
                        }
                        if (!super.dispatchGenericMotionEvent(motionEvent)) {
                            AbstractC3809q abstractC3809q9 = c3025a2.f17992e;
                            C2705e c2705e4 = null;
                            while (abstractC3809q9 != null) {
                                if (abstractC3809q9 instanceof C3025a) {
                                } else if ((abstractC3809q9.f17994g & 16384) != 0 && (abstractC3809q9 instanceof AbstractC3519m)) {
                                    int i12 = 0;
                                    for (AbstractC3809q abstractC3809q10 = ((AbstractC3519m) abstractC3809q9).f16962t; abstractC3809q10 != null; abstractC3809q10 = abstractC3809q10.f17997j) {
                                        if ((abstractC3809q10.f17994g & 16384) != 0) {
                                            i12++;
                                            if (i12 == 1) {
                                                abstractC3809q9 = abstractC3809q10;
                                            } else {
                                                if (c2705e4 == null) {
                                                    c2705e4 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3809q9 != null) {
                                                    c2705e4.m4300b(abstractC3809q9);
                                                    abstractC3809q9 = null;
                                                }
                                                c2705e4.m4300b(abstractC3809q10);
                                            }
                                        }
                                    }
                                    if (i12 == 1) {
                                    }
                                }
                                abstractC3809q9 = AbstractC3498f.m5366f(c2705e4);
                            }
                            if (arrayList != null) {
                                int size2 = arrayList.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    C3704n c3704n = ((C3025a) arrayList.get(i13)).f15584s;
                                }
                            }
                        }
                        return true;
                    }
                    return false;
                }
                if ((m5741n(motionEvent) & 1) == 0) {
                    return false;
                }
                return true;
            }
            if (!motionEvent.isFromSource(2)) {
                float x6 = motionEvent.getX();
                float y7 = motionEvent.getY();
                Float.floatToRawIntBits(x6);
                Float.floatToRawIntBits(y7);
                motionEvent.getEventTime();
                motionEvent.getActionMasked();
                C0368l c0368l2 = (C0368l) getFocusOwner();
                if (c0368l2.f1241d.f1234e) {
                    System.out.println((Object) "FocusRelatedWarning: Dispatching indirect touch event while the focus system is invalidated.");
                } else {
                    C0377u m809g2 = AbstractC0362f.m809g(c0368l2.f1240c);
                    if (m809g2 != null) {
                        if (!m809g2.f17992e.f18005r) {
                            AbstractC3088a.m4750b("visitAncestors called on an unattached node");
                        }
                        AbstractC3809q abstractC3809q11 = m809g2.f17992e;
                        C3502g0 m5382v3 = AbstractC3498f.m5382v(m809g2);
                        while (m5382v3 != null) {
                            if ((m5382v3.f16872I.f16802f.f17995h & 2097152) != 0) {
                                while (abstractC3809q11 != null) {
                                    if ((abstractC3809q11.f17994g & 2097152) != 0) {
                                        AbstractC3809q abstractC3809q12 = abstractC3809q11;
                                        C2705e c2705e5 = null;
                                        while (abstractC3809q12 != null) {
                                            if ((abstractC3809q12.f17994g & 2097152) != 0 && (abstractC3809q12 instanceof AbstractC3519m)) {
                                                int i14 = 0;
                                                for (AbstractC3809q abstractC3809q13 = ((AbstractC3519m) abstractC3809q12).f16962t; abstractC3809q13 != null; abstractC3809q13 = abstractC3809q13.f17997j) {
                                                    if ((abstractC3809q13.f17994g & 2097152) != 0) {
                                                        i14++;
                                                        if (i14 == 1) {
                                                            abstractC3809q12 = abstractC3809q13;
                                                        } else {
                                                            if (c2705e5 == null) {
                                                                c2705e5 = new C2705e(new AbstractC3809q[16]);
                                                            }
                                                            if (abstractC3809q12 != null) {
                                                                c2705e5.m4300b(abstractC3809q12);
                                                                abstractC3809q12 = null;
                                                            }
                                                            c2705e5.m4300b(abstractC3809q13);
                                                        }
                                                    }
                                                }
                                                if (i14 == 1) {
                                                }
                                            }
                                            abstractC3809q12 = AbstractC3498f.m5366f(c2705e5);
                                        }
                                    }
                                    abstractC3809q11 = abstractC3809q11.f17996i;
                                }
                            }
                            m5382v3 = m5382v3.m5447u();
                            if (m5382v3 != null && (c3490c1 = m5382v3.f16872I) != null) {
                                abstractC3809q11 = c3490c1.f16801e;
                            } else {
                                abstractC3809q11 = null;
                            }
                        }
                    }
                }
            }
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        return super.dispatchGenericMotionEvent(motionEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0155, code lost:
    
        if (m5744s(r24) == false) goto L69;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        int i7;
        boolean z7 = this.f17710E0;
        RunnableC0219y runnableC0219y = this.f17708D0;
        if (z7) {
            removeCallbacks(runnableC0219y);
            runnableC0219y.run();
        }
        if (!m5725q(motionEvent) && isAttachedToWindow()) {
            C3653a0 c3653a0 = this.f17775w;
            C3728t c3728t = c3653a0.f17454d;
            AccessibilityManager accessibilityManager = c3653a0.f17457g;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled()) {
                int action = motionEvent.getAction();
                if (action != 7 && action != 9) {
                    if (action == 10) {
                        int i8 = c3653a0.f17455e;
                        if (i8 != Integer.MIN_VALUE) {
                            if (i8 != Integer.MIN_VALUE) {
                                c3653a0.f17455e = Integer.MIN_VALUE;
                                C3653a0.m5631x(c3653a0, Integer.MIN_VALUE, 128, null, 12);
                                C3653a0.m5631x(c3653a0, i8, 256, null, 12);
                            }
                        } else {
                            c3728t.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                        }
                    }
                } else {
                    float x6 = motionEvent.getX();
                    float y7 = motionEvent.getY();
                    c3728t.m5747v(true);
                    C3531q c3531q = new C3531q();
                    C3490c1 c3490c1 = c3728t.getRoot().f16872I;
                    AbstractC3497e1 abstractC3497e1 = c3490c1.f16800d;
                    C0661j0 c0661j0 = AbstractC3497e1.f16828O;
                    c3490c1.f16800d.m5338a1(AbstractC3497e1.f16832S, abstractC3497e1.m5330S0((Float.floatToRawIntBits(x6) << 32) | (Float.floatToRawIntBits(y7) & 4294967295L)), c3531q, 1, true);
                    for (int m3066N = AbstractC1806n.m3066N(c3531q); -1 < m3066N; m3066N--) {
                        Object m3560e = c3531q.f16999e.m3560e(m3066N);
                        AbstractC3367j.m5098c(m3560e, "null cannot be cast to non-null type androidx.compose.ui.Modifier.Node");
                        C3502g0 m5382v = AbstractC3498f.m5382v((AbstractC3809q) m3560e);
                        if (c3728t.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().get(m5382v) != null) {
                            break;
                        }
                        if (m5382v.f16872I.m5308d(8)) {
                            int m5650t = c3653a0.m5650t(m5382v.f16885f);
                            C0482o m1057a = AbstractC0485r.m1057a(m5382v, false);
                            if (AbstractC0485r.m1062f(m1057a)) {
                                if (!m1057a.m1048k().f1683e.m3588c(AbstractC0487t.f1765z)) {
                                    i7 = m5650t;
                                    break;
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                    i7 = Integer.MIN_VALUE;
                    c3728t.getAndroidViewsHandler$ui_release().dispatchGenericMotionEvent(motionEvent);
                    int i9 = c3653a0.f17455e;
                    if (i9 != i7) {
                        c3653a0.f17455e = i7;
                        C3653a0.m5631x(c3653a0, i7, 128, null, 12);
                        C3653a0.m5631x(c3653a0, i9, 256, null, 12);
                    }
                }
            }
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked != 7) {
                if (actionMasked == 10 && m5743r(motionEvent)) {
                    if (motionEvent.getToolType(0) != 3 || motionEvent.getButtonState() == 0) {
                        MotionEvent motionEvent2 = this.f17776w0;
                        if (motionEvent2 != null) {
                            motionEvent2.recycle();
                        }
                        this.f17776w0 = MotionEvent.obtainNoHistory(motionEvent);
                        this.f17710E0 = true;
                        postDelayed(runnableC0219y, 8L);
                        return false;
                    }
                }
                if ((m5741n(motionEvent) & 1) != 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (isFocused()) {
            int metaState = keyEvent.getMetaState();
            this.f17757n.getClass();
            AbstractC3691j2.f17578a.setValue(new C2843a0(metaState));
            if (!((C0368l) getFocusOwner()).m833d(keyEvent, C0365i.f1235f) && !super.dispatchKeyEvent(keyEvent)) {
                return false;
            }
            return true;
        }
        return ((C0368l) getFocusOwner()).m833d(keyEvent, new C0033i(15, this, keyEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        C3490c1 c3490c1;
        if (isFocused()) {
            C0368l c0368l = (C0368l) getFocusOwner();
            if (c0368l.f1241d.f1234e) {
                System.out.println((Object) "FocusRelatedWarning: Dispatching intercepted soft keyboard event while the focus system is invalidated.");
            } else {
                C0377u m809g = AbstractC0362f.m809g(c0368l.f1240c);
                if (m809g != null) {
                    if (!m809g.f17992e.f18005r) {
                        AbstractC3088a.m4750b("visitAncestors called on an unattached node");
                    }
                    AbstractC3809q abstractC3809q = m809g.f17992e;
                    C3502g0 m5382v = AbstractC3498f.m5382v(m809g);
                    while (m5382v != null) {
                        if ((m5382v.f16872I.f16802f.f17995h & 131072) != 0) {
                            while (abstractC3809q != null) {
                                if ((abstractC3809q.f17994g & 131072) != 0) {
                                    AbstractC3809q abstractC3809q2 = abstractC3809q;
                                    C2705e c2705e = null;
                                    while (abstractC3809q2 != null) {
                                        if ((abstractC3809q2.f17994g & 131072) != 0 && (abstractC3809q2 instanceof AbstractC3519m)) {
                                            int i7 = 0;
                                            for (AbstractC3809q abstractC3809q3 = ((AbstractC3519m) abstractC3809q2).f16962t; abstractC3809q3 != null; abstractC3809q3 = abstractC3809q3.f17997j) {
                                                if ((abstractC3809q3.f17994g & 131072) != 0) {
                                                    i7++;
                                                    if (i7 == 1) {
                                                        abstractC3809q2 = abstractC3809q3;
                                                    } else {
                                                        if (c2705e == null) {
                                                            c2705e = new C2705e(new AbstractC3809q[16]);
                                                        }
                                                        if (abstractC3809q2 != null) {
                                                            c2705e.m4300b(abstractC3809q2);
                                                            abstractC3809q2 = null;
                                                        }
                                                        c2705e.m4300b(abstractC3809q3);
                                                    }
                                                }
                                            }
                                            if (i7 == 1) {
                                            }
                                        }
                                        abstractC3809q2 = AbstractC3498f.m5366f(c2705e);
                                    }
                                }
                                abstractC3809q = abstractC3809q.f17996i;
                            }
                        }
                        m5382v = m5382v.m5447u();
                        if (m5382v != null && (c3490c1 = m5382v.f16872I) != null) {
                            abstractC3809q = c3490c1.f16801e;
                        } else {
                            abstractC3809q = null;
                        }
                    }
                }
            }
        }
        if (!super.dispatchKeyEventPreIme(keyEvent)) {
            return false;
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchProvideStructure(ViewStructure viewStructure) {
        if (Build.VERSION.SDK_INT < 28) {
            C3657b0.f17490a.m5660a(viewStructure, getView());
        } else {
            super.dispatchProvideStructure(viewStructure);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f17710E0) {
            RunnableC0219y runnableC0219y = this.f17708D0;
            removeCallbacks(runnableC0219y);
            MotionEvent motionEvent2 = this.f17776w0;
            AbstractC3367j.m5097b(motionEvent2);
            if (motionEvent.getActionMasked() == 0 && motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) {
                this.f17710E0 = false;
            } else {
                runnableC0219y.run();
            }
        }
        if (!m5725q(motionEvent) && isAttachedToWindow() && (motionEvent.getActionMasked() != 2 || m5744s(motionEvent))) {
            int m5741n = m5741n(motionEvent);
            if ((m5741n & 2) != 0) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            if ((m5741n & 1) != 0) {
                return true;
            }
        }
        return false;
    }

    public final View findViewByAccessibilityIdTraversal(int i7) {
        try {
            if (Build.VERSION.SDK_INT >= 29) {
                Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
                declaredMethod.setAccessible(true);
                Object invoke = declaredMethod.invoke(this, Integer.valueOf(i7));
                if (invoke instanceof View) {
                    return (View) invoke;
                }
                return null;
            }
            return m5723l(this, i7);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, u5.v] */
    @Override // android.view.ViewGroup, android.view.ViewParent
    public final View focusSearch(View view, int i7) {
        C0465c m806d;
        int i8;
        if (view != null && !this.f17730S.f17053c) {
            Object obj = C3694k1.f17581f.get();
            AbstractC3367j.m5097b(obj);
            View m5705b = ((C3694k1) obj).m5705b(this, view, i7);
            if (view == this) {
                C0377u m809g = AbstractC0362f.m809g(((C0368l) getFocusOwner()).f1240c);
                if (m809g != null) {
                    m806d = AbstractC0362f.m812j(m809g);
                } else {
                    m806d = null;
                }
                if (m806d == null) {
                    m806d = AbstractC0362f.m806d(view, this);
                }
            } else {
                m806d = AbstractC0362f.m806d(view, this);
            }
            C0360d m801D = AbstractC0362f.m801D(i7);
            if (m801D != null) {
                i8 = m801D.f1227a;
            } else {
                i8 = 6;
            }
            ?? obj2 = new Object();
            if (((C0368l) getFocusOwner()).m834e(i8, m806d, new C2803h(obj2, 3)) != null) {
                Object obj3 = obj2.f16451e;
                if (obj3 == null) {
                    if (m5705b == null) {
                    }
                } else {
                    if (m5705b != null) {
                        if (i8 == 1 || i8 == 2) {
                            return super.focusSearch(view, i7);
                        }
                        if (AbstractC0362f.m817o(AbstractC0362f.m812j((C0377u) obj3), AbstractC0362f.m806d(m5705b, this), m806d, i8)) {
                        }
                    }
                    return this;
                }
                return m5705b;
            }
            return view;
        }
        return super.focusSearch(view, i7);
    }

    public final C3733u0 getAndroidViewsHandler$ui_release() {
        if (this.f17727P == null) {
            C3733u0 c3733u0 = new C3733u0(getContext());
            this.f17727P = c3733u0;
            addView(c3733u0, -1);
            requestLayout();
        }
        C3733u0 c3733u02 = this.f17727P;
        AbstractC3367j.m5097b(c3733u02);
        return c3733u02;
    }

    public InterfaceC3837f getAutofill() {
        return this.f17717I;
    }

    public AbstractC3840i getAutofillManager() {
        return this.f17719J;
    }

    public C3841j getAutofillTree() {
        return this.f17701A;
    }

    public final InterfaceC3279c getConfigurationChangeObserver() {
        return this.f17715H;
    }

    public final ViewOnAttachStateChangeListenerC3864c getContentCaptureManager$ui_release() {
        return this.f17777x;
    }

    public InterfaceC2318h getCoroutineContext() {
        return this.f17753l;
    }

    public InterfaceC3093c getDensity() {
        return (InterfaceC3093c) this.f17745h.getValue();
    }

    public C0465c getEmbeddedViewFocusRect() {
        if (isFocused()) {
            C0377u m809g = AbstractC0362f.m809g(((C0368l) getFocusOwner()).f1240c);
            if (m809g == null) {
                return null;
            }
            return AbstractC0362f.m812j(m809g);
        }
        View findFocus = findFocus();
        if (findFocus == null) {
            return null;
        }
        return AbstractC0362f.m806d(findFocus, this);
    }

    public InterfaceC0366j getFocusOwner() {
        return this.f17751k;
    }

    @Override // android.view.View
    public final void getFocusedRect(Rect rect) {
        C0465c embeddedViewFocusRect = getEmbeddedViewFocusRect();
        if (embeddedViewFocusRect != null) {
            rect.left = Math.round(embeddedViewFocusRect.f1625a);
            rect.top = Math.round(embeddedViewFocusRect.f1626b);
            rect.right = Math.round(embeddedViewFocusRect.f1627c);
            rect.bottom = Math.round(embeddedViewFocusRect.f1628d);
            return;
        }
        if (!AbstractC3367j.m5096a(((C0368l) getFocusOwner()).m834e(6, null, C3704n.f17612h), Boolean.TRUE)) {
            rect.set(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        } else {
            super.getFocusedRect(rect);
        }
    }

    public InterfaceC2293d getFontFamilyResolver() {
        return (InterfaceC2293d) this.f17762p0.getValue();
    }

    public InterfaceC2292c getFontLoader() {
        return this.f17760o0;
    }

    public InterfaceC0682x getGraphicsContext() {
        return this.f17781z;
    }

    public InterfaceC2430a getHapticFeedBack() {
        return this.f17768s0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f17730S.f17052b.m77A();
    }

    @Override // android.view.View
    public int getImportantForAutofill() {
        return 1;
    }

    public InterfaceC2548b getInputModeManager() {
        return this.f17770t0;
    }

    public final RunnableC3226p getInsetsListener() {
        return this.f17763q;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f17736b0;
    }

    @Override // android.view.View, android.view.ViewParent
    public EnumC3103m getLayoutDirection() {
        return (EnumC3103m) this.f17766r0.getValue();
    }

    public long getMeasureIteration() {
        C3547v0 c3547v0 = this.f17730S;
        if (!c3547v0.f17053c) {
            AbstractC3088a.m4749a("measureIteration should be only used during the measure/layout pass");
        }
        return c3547v0.f17057g;
    }

    public C3348d getModifierLocalManager() {
        return this.f17772u0;
    }

    public AbstractC3237u0 getPlacementScope() {
        int i7 = AbstractC3243x0.f16063b;
        return new C3208i0(1, this);
    }

    public InterfaceC2865p getPointerIconService() {
        return this.f17722K0;
    }

    public C0685a getRectManager() {
        return this.f17769t;
    }

    public C3502g0 getRoot() {
        return this.f17765r;
    }

    public InterfaceC3545u1 getRootForTest() {
        return this.f17771u;
    }

    public final boolean getScrollCaptureInProgress$ui_release() {
        C0019e1 c0019e1;
        if (Build.VERSION.SDK_INT >= 31 && (c0019e1 = this.f17718I0) != null) {
            return ((Boolean) ((C2361g1) c0019e1.f109e).getValue()).booleanValue();
        }
        return false;
    }

    public C0484q getSemanticsOwner() {
        return this.f17773v;
    }

    public C3508i0 getSharedDrawScope() {
        return this.f17743g;
    }

    public boolean getShowLayoutBounds() {
        if (Build.VERSION.SDK_INT >= 30) {
            return C3737v0.f17796a.m5756a(this);
        }
        return this.f17726O;
    }

    public C3530p1 getSnapshotObserver() {
        return this.f17725N;
    }

    public InterfaceC3663c2 getSoftwareKeyboardController() {
        return this.f17758n0;
    }

    public C2460x getTextInputService() {
        return this.f17754l0;
    }

    public InterfaceC3667d2 getTextToolbar() {
        return this.f17774v0;
    }

    public final InterfaceC3542t1 getUncaughtExceptionHandler$ui_release() {
        return null;
    }

    public InterfaceC3679g2 getViewConfiguration() {
        return this.f17761p;
    }

    public final C3696l getViewTreeOwners() {
        return (C3696l) this.f17742f0.getValue();
    }

    public InterfaceC3687i2 getWindowInfo() {
        return this.f17757n;
    }

    public final C3834c get_autofillManager$ui_release() {
        return this.f17719J;
    }

    /* renamed from: k */
    public final InterfaceC3521m1 m5739k(InterfaceC3281e interfaceC3281e, C3494d1 c3494d1, C1752b c1752b) {
        C2705e c2705e;
        Reference poll;
        Object obj;
        if (c1752b != null) {
            return new C3710o1(c1752b, null, this, interfaceC3281e, c3494d1);
        }
        do {
            C0068q2 c0068q2 = this.f17780y0;
            ReferenceQueue referenceQueue = (ReferenceQueue) c0068q2.f345g;
            c2705e = (C2705e) c0068q2.f344f;
            poll = referenceQueue.poll();
            if (poll != null) {
                c2705e.m4308j(poll);
            }
        } while (poll != null);
        while (true) {
            int i7 = c2705e.f14519g;
            if (i7 != 0) {
                obj = ((Reference) c2705e.m4309k(i7 - 1)).get();
                if (obj != null) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        InterfaceC3521m1 interfaceC3521m1 = (InterfaceC3521m1) obj;
        if (interfaceC3521m1 != null) {
            C3710o1 c3710o1 = (C3710o1) interfaceC3521m1;
            InterfaceC0682x interfaceC0682x = c3710o1.f17631f;
            if (interfaceC0682x != null) {
                if (!c3710o1.f17630e.f10681s) {
                    AbstractC3088a.m4749a("layer should have been released before reuse");
                }
                c3710o1.f17630e = interfaceC0682x.mo1360b();
                c3710o1.f17636k = false;
                c3710o1.f17633h = interfaceC3281e;
                c3710o1.f17634i = c3494d1;
                c3710o1.f17646u = false;
                c3710o1.f17647v = false;
                c3710o1.f17648w = true;
                C0647c0.m1353d(c3710o1.f17637l);
                float[] fArr = c3710o1.f17638m;
                if (fArr != null) {
                    C0647c0.m1353d(fArr);
                }
                c3710o1.f17644s = C0675q0.f2200b;
                c3710o1.f17649x = false;
                long j6 = Integer.MAX_VALUE;
                c3710o1.f17635j = (j6 & 4294967295L) | (j6 << 32);
                c3710o1.f17645t = null;
                c3710o1.f17643r = 0;
                return interfaceC3521m1;
            }
            throw AbstractC2487d.m4041e("currently reuse is only supported when we manage the layer lifecycle");
        }
        return new C3710o1(getGraphicsContext().mo1360b(), getGraphicsContext(), this, interfaceC3281e, c3494d1);
    }

    /* renamed from: m */
    public final void m5740m(C3502g0 c3502g0, boolean z7) {
        this.f17730S.m5515f(c3502g0, z7);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00cc A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0111 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011b A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0136 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014e A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0160 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0163 A[Catch: all -> 0x002b, TryCatch #2 {all -> 0x002b, blocks: (B:5:0x0018, B:7:0x0021, B:25:0x00c4, B:27:0x00cc, B:28:0x00cf, B:30:0x00d3, B:32:0x00d9, B:34:0x00dd, B:35:0x00e3, B:38:0x00eb, B:41:0x00f3, B:42:0x00ff, B:44:0x0105, B:46:0x010b, B:48:0x0111, B:49:0x0117, B:51:0x011b, B:52:0x011f, B:57:0x0132, B:59:0x0136, B:60:0x013d, B:66:0x014e, B:67:0x0158, B:69:0x0160, B:70:0x0163, B:76:0x016a), top: B:4:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x004e A[Catch: all -> 0x0076, TryCatch #0 {all -> 0x0076, blocks: (B:90:0x0034, B:92:0x003e, B:97:0x004e, B:100:0x007d, B:102:0x0081, B:104:0x0090, B:106:0x0096, B:13:0x00a1, B:21:0x00b4, B:23:0x00ba, B:107:0x0056, B:113:0x0062, B:116:0x006a), top: B:89:0x0034 }] */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m5741n(MotionEvent motionEvent) {
        boolean z7;
        boolean z8;
        int actionMasked;
        MotionEvent motionEvent2;
        boolean z9;
        C3728t c3728t;
        MotionEvent motionEvent3;
        MotionEvent motionEvent4;
        int i7;
        int action;
        MotionEvent motionEvent5;
        float f7;
        MotionEvent motionEvent6;
        float x6;
        boolean z10;
        MotionEvent motionEvent7;
        long j6;
        boolean z11;
        C2848d c2848d;
        removeCallbacks(this.f17706C0);
        try {
            m5730E(motionEvent);
            this.f17737c0 = true;
            m5747v(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked2 = motionEvent.getActionMasked();
                MotionEvent motionEvent8 = this.f17776w0;
                if (motionEvent8 != null && motionEvent8.getToolType(0) == 3) {
                    z7 = true;
                } else {
                    z7 = false;
                }
                C1748v c1748v = this.f17713G;
                if (motionEvent8 != null) {
                    try {
                        if (motionEvent8.getSource() == motionEvent.getSource() && motionEvent8.getToolType(0) == motionEvent.getToolType(0)) {
                            z8 = false;
                            if (z8) {
                                if (motionEvent8.getButtonState() != 0 || (actionMasked = motionEvent8.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6) {
                                    motionEvent2 = motionEvent8;
                                    if (!c1748v.f10650a) {
                                        C2209p c2209p = (C2209p) ((C2673p1) c1748v.f10653d).f14390f;
                                        int i8 = c2209p.f12721h;
                                        Object[] objArr = c2209p.f12720g;
                                        for (int i9 = 0; i9 < i8; i9++) {
                                            objArr[i9] = null;
                                        }
                                        c2209p.f12721h = 0;
                                        c2209p.f12718e = false;
                                        ((C2848d) c1748v.f10652c).m4508c();
                                    }
                                } else if (motionEvent8.getActionMasked() != 10 && z7) {
                                    m5735J(motionEvent8, 10, motionEvent8.getEventTime(), true);
                                    motionEvent2 = motionEvent8;
                                }
                                if (motionEvent.getToolType(0) != 3) {
                                    z9 = true;
                                } else {
                                    z9 = false;
                                }
                                if (z7 && z9 && actionMasked2 != 3 && actionMasked2 != 9 && m5743r(motionEvent)) {
                                    c3728t = this;
                                    c3728t.m5735J(motionEvent, 9, motionEvent.getEventTime(), true);
                                } else {
                                    c3728t = this;
                                }
                                if (motionEvent2 != null) {
                                    motionEvent2.recycle();
                                }
                                motionEvent3 = c3728t.f17776w0;
                                if (motionEvent3 != null && motionEvent3.getAction() == 10) {
                                    motionEvent4 = c3728t.f17776w0;
                                    if (motionEvent4 == null) {
                                        i7 = motionEvent4.getPointerId(0);
                                    } else {
                                        i7 = -1;
                                    }
                                    action = motionEvent.getAction();
                                    C2854g c2854g = c3728t.f17711F;
                                    if (action != 9 && motionEvent.getHistorySize() == 0) {
                                        if (i7 >= 0) {
                                            c2854g.f14960c.delete(i7);
                                            c2854g.f14959b.delete(i7);
                                        }
                                    } else if (motionEvent.getAction() == 0 && motionEvent.getHistorySize() == 0) {
                                        motionEvent5 = c3728t.f17776w0;
                                        float f8 = Float.NaN;
                                        if (motionEvent5 == null) {
                                            f7 = motionEvent5.getX();
                                        } else {
                                            f7 = Float.NaN;
                                        }
                                        motionEvent6 = c3728t.f17776w0;
                                        if (motionEvent6 != null) {
                                            f8 = motionEvent6.getY();
                                        }
                                        x6 = motionEvent.getX();
                                        float y7 = motionEvent.getY();
                                        if (f7 != x6 && f8 == y7) {
                                            z10 = false;
                                        } else {
                                            z10 = true;
                                        }
                                        motionEvent7 = c3728t.f17776w0;
                                        if (motionEvent7 == null) {
                                            j6 = motionEvent7.getEventTime();
                                        } else {
                                            j6 = -1;
                                        }
                                        if (j6 == motionEvent.getEventTime()) {
                                            z11 = true;
                                        } else {
                                            z11 = false;
                                        }
                                        if (!z10 || z11) {
                                            if (i7 >= 0) {
                                                c2854g.f14960c.delete(i7);
                                                c2854g.f14959b.delete(i7);
                                            }
                                            c2848d = (C2848d) c1748v.f10652c;
                                            if (!c2848d.f14945d) {
                                                c2848d.f14945d = true;
                                            } else {
                                                c2848d.f14948g.f14989a.m4305g();
                                            }
                                        }
                                    }
                                }
                                c3728t.f17776w0 = MotionEvent.obtainNoHistory(motionEvent);
                                int m5734I = m5734I(motionEvent);
                                Trace.endSection();
                                c3728t.f17737c0 = false;
                                return m5734I;
                            }
                        }
                        z8 = true;
                        if (z8) {
                        }
                    } catch (Throwable th) {
                        th = th;
                        Trace.endSection();
                        throw th;
                    }
                }
                motionEvent2 = motionEvent8;
                if (motionEvent.getToolType(0) != 3) {
                }
                if (z7) {
                }
                c3728t = this;
                if (motionEvent2 != null) {
                }
                motionEvent3 = c3728t.f17776w0;
                if (motionEvent3 != null) {
                    motionEvent4 = c3728t.f17776w0;
                    if (motionEvent4 == null) {
                    }
                    action = motionEvent.getAction();
                    C2854g c2854g2 = c3728t.f17711F;
                    if (action != 9) {
                    }
                    if (motionEvent.getAction() == 0) {
                        motionEvent5 = c3728t.f17776w0;
                        float f82 = Float.NaN;
                        if (motionEvent5 == null) {
                        }
                        motionEvent6 = c3728t.f17776w0;
                        if (motionEvent6 != null) {
                        }
                        x6 = motionEvent.getX();
                        float y72 = motionEvent.getY();
                        if (f7 != x6) {
                        }
                        z10 = true;
                        motionEvent7 = c3728t.f17776w0;
                        if (motionEvent7 == null) {
                        }
                        if (j6 == motionEvent.getEventTime()) {
                        }
                        if (!z10) {
                        }
                        if (i7 >= 0) {
                        }
                        c2848d = (C2848d) c1748v.f10652c;
                        if (!c2848d.f14945d) {
                        }
                    }
                }
                c3728t.f17776w0 = MotionEvent.obtainNoHistory(motionEvent);
                int m5734I2 = m5734I(motionEvent);
                Trace.endSection();
                c3728t.f17737c0 = false;
                return m5734I2;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Throwable th3) {
            this.f17737c0 = false;
            throw th3;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C0216v mo415g;
        InterfaceC0213t interfaceC0213t;
        C2572v c2572v;
        Method method;
        super.onAttachedToWindow();
        int i7 = Build.VERSION.SDK_INT;
        if (i7 < 30) {
            setShowLayoutBounds(AbstractC3681h0.m5692s());
        }
        this.f17763q.onViewAttachedToWindow(this);
        int i8 = 1;
        C0216v c0216v = null;
        if (i7 > 28) {
            if (f17700P0 == null) {
                RunnableC1343un runnableC1343un = new RunnableC1343un(i8);
                f17700P0 = runnableC1343un;
                StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
                try {
                    if (f17696L0 == null) {
                        f17696L0 = Class.forName("android.os.SystemProperties");
                    }
                    if (f17698N0 == null) {
                        StrictMode.setVmPolicy(StrictMode.VmPolicy.LAX);
                        Class cls = f17696L0;
                        if (cls != null) {
                            method = cls.getDeclaredMethod("addChangeCallback", Runnable.class);
                        } else {
                            method = null;
                        }
                        f17698N0 = method;
                    }
                    Method method2 = f17698N0;
                    if (method2 != null) {
                        method2.invoke(null, runnableC1343un);
                    }
                } catch (Throwable unused) {
                }
                StrictMode.setVmPolicy(vmPolicy);
            }
            C2184c0 c2184c0 = f17699O0;
            synchronized (c2184c0) {
                c2184c0.m3556a(this);
            }
        }
        this.f17757n.f17692a.setValue(Boolean.valueOf(hasWindowFocus()));
        this.f17757n.getClass();
        this.f17757n.getClass();
        m5742p(getRoot());
        m5724o(getRoot());
        getSnapshotObserver().f16991a.m5281d();
        if (m5720h() && (c2572v = this.f17717I) != null) {
            C3839h c3839h = C3839h.f18054a;
            c3839h.getClass();
            ((AutofillManager) c2572v.f13968g).registerCallback(AbstractC3832a.m5842c(c3839h));
        }
        InterfaceC0213t m458c = AbstractC0194j0.m458c(this);
        InterfaceC3782f m3333j = AbstractC2072e.m3333j(this);
        C3696l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (m458c != null && m3333j != null && (m458c != (interfaceC0213t = viewTreeOwners.f17587a) || m3333j != interfaceC0213t))) {
            if (m458c != null) {
                if (m3333j != null) {
                    if (viewTreeOwners != null && (mo415g = viewTreeOwners.f17587a.mo415g()) != null) {
                        mo415g.m473f(this);
                    }
                    m458c.mo415g().m468a(this);
                    C3696l c3696l = new C3696l(m458c, m3333j);
                    set_viewTreeOwners(c3696l);
                    InterfaceC3279c interfaceC3279c = this.f17744g0;
                    if (interfaceC3279c != null) {
                        interfaceC3279c.mo23f(c3696l);
                    }
                    this.f17744g0 = null;
                } else {
                    throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
                }
            } else {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
        }
        C2549c c2549c = this.f17770t0;
        if (!isInTouchMode()) {
            i8 = 2;
        }
        c2549c.f13916a.setValue(new C2547a(i8));
        C3696l viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null) {
            c0216v = viewTreeOwners2.f17587a.mo415g();
        }
        if (c0216v != null) {
            c0216v.m468a(this);
            c0216v.m468a(this.f17777x);
            getViewTreeObserver().addOnGlobalLayoutListener(this.f17746h0);
            getViewTreeObserver().addOnScrollChangedListener(this.f17748i0);
            getViewTreeObserver().addOnTouchModeChangeListener(this.f17750j0);
            if (Build.VERSION.SDK_INT >= 31) {
                C3669e0.f17503a.m5665b(this);
            }
            C3834c c3834c = this.f17719J;
            if (c3834c != null) {
                ((C0368l) getFocusOwner()).f1244g.m3556a(c3834c);
                getSemanticsOwner().f1703d.m3556a(c3834c);
                return;
            }
            return;
        }
        throw AbstractC2487d.m4041e("No lifecycle owner exists");
    }

    @Override // android.view.View
    public final boolean onCheckIsTextEditor() {
        Object obj;
        C3812t c3812t = (C3812t) this.f17756m0.get();
        Object obj2 = null;
        if (c3812t != null) {
            obj = c3812t.f18007b;
        } else {
            obj = null;
        }
        C3705n0 c3705n0 = (C3705n0) obj;
        if (c3705n0 == null) {
            return this.f17752k0.f13736d;
        }
        C3812t c3812t2 = (C3812t) c3705n0.f17620h.get();
        if (c3812t2 != null) {
            obj2 = c3812t2.f18007b;
        }
        if (((C3718q1) obj2) != null && (!r1.f17679e)) {
            return true;
        }
        return false;
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        int i7;
        super.onConfigurationChanged(configuration);
        setDensity(AbstractC2067b.m3277b(getContext()));
        this.f17757n.getClass();
        int i8 = Build.VERSION.SDK_INT;
        int i9 = 0;
        if (i8 >= 31) {
            i7 = configuration.fontWeightAdjustment;
        } else {
            i7 = 0;
        }
        if (i7 != this.f17764q0) {
            if (i8 >= 31) {
                i9 = configuration.fontWeightAdjustment;
            }
            this.f17764q0 = i9;
            setFontFamilyResolver(AbstractC2067b.m3285j(getContext()));
        }
        this.f17715H.mo23f(configuration);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0056  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        Object obj;
        Object obj2;
        InputConnectionC2449m inputConnectionC2449m;
        int i7;
        int i8;
        int i9;
        C3812t c3812t = (C3812t) this.f17756m0.get();
        if (c3812t != null) {
            obj = c3812t.f18007b;
        } else {
            obj = null;
        }
        C3705n0 c3705n0 = (C3705n0) obj;
        if (c3705n0 == null) {
            C2462z c2462z = this.f17752k0;
            if (c2462z.f13736d) {
                C2447k c2447k = c2462z.f13740h;
                C2459w c2459w = c2462z.f13739g;
                int i10 = c2447k.f13703e;
                boolean z7 = c2447k.f13699a;
                if (i10 == 1) {
                    if (!z7) {
                        i7 = 0;
                        editorInfo.imeOptions = i7;
                        i8 = c2447k.f13702d;
                        if (i8 == 1) {
                            editorInfo.inputType = 1;
                        } else if (i8 == 2) {
                            editorInfo.inputType = 1;
                            editorInfo.imeOptions = Integer.MIN_VALUE | i7;
                        } else if (i8 == 3) {
                            editorInfo.inputType = 2;
                        } else if (i8 == 4) {
                            editorInfo.inputType = 3;
                        } else if (i8 == 5) {
                            editorInfo.inputType = 17;
                        } else if (i8 == 6) {
                            editorInfo.inputType = 33;
                        } else if (i8 == 7) {
                            editorInfo.inputType = 129;
                        } else if (i8 == 8) {
                            editorInfo.inputType = 18;
                        } else if (i8 == 9) {
                            editorInfo.inputType = 8194;
                        } else {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        if (!z7) {
                            int i11 = editorInfo.inputType;
                            if ((i11 & 1) == 1) {
                                editorInfo.inputType = i11 | 131072;
                                if (i10 == 1) {
                                    editorInfo.imeOptions |= 1073741824;
                                }
                            }
                        }
                        i9 = editorInfo.inputType;
                        if ((i9 & 1) == 1) {
                            int i12 = c2447k.f13700b;
                            if (i12 == 1) {
                                editorInfo.inputType = i9 | 4096;
                            } else if (i12 == 2) {
                                editorInfo.inputType = i9 | 8192;
                            } else if (i12 == 3) {
                                editorInfo.inputType = i9 | 16384;
                            }
                            if (c2447k.f13701c) {
                                editorInfo.inputType |= 32768;
                            }
                        }
                        long j6 = c2459w.f13724b;
                        int i13 = C1602n0.f10303c;
                        editorInfo.initialSelStart = (int) (j6 >> 32);
                        editorInfo.initialSelEnd = (int) (j6 & 4294967295L);
                        AbstractC2067b.m3299x(editorInfo, c2459w.f13723a.f10239f);
                        editorInfo.imeOptions |= 33554432;
                        if (C2560j.m4082d()) {
                            C2560j.m4081a().m4087g(editorInfo);
                        }
                        InputConnectionC2455s inputConnectionC2455s = new InputConnectionC2455s(c2462z.f13739g, new C0019e1(c2462z), c2462z.f13740h.f13701c);
                        c2462z.f13741i.add(new WeakReference(inputConnectionC2455s));
                        return inputConnectionC2455s;
                    }
                    i7 = 6;
                    editorInfo.imeOptions = i7;
                    i8 = c2447k.f13702d;
                    if (i8 == 1) {
                    }
                    if (!z7) {
                    }
                    i9 = editorInfo.inputType;
                    if ((i9 & 1) == 1) {
                    }
                    long j62 = c2459w.f13724b;
                    int i132 = C1602n0.f10303c;
                    editorInfo.initialSelStart = (int) (j62 >> 32);
                    editorInfo.initialSelEnd = (int) (j62 & 4294967295L);
                    AbstractC2067b.m3299x(editorInfo, c2459w.f13723a.f10239f);
                    editorInfo.imeOptions |= 33554432;
                    if (C2560j.m4082d()) {
                    }
                    InputConnectionC2455s inputConnectionC2455s2 = new InputConnectionC2455s(c2462z.f13739g, new C0019e1(c2462z), c2462z.f13740h.f13701c);
                    c2462z.f13741i.add(new WeakReference(inputConnectionC2455s2));
                    return inputConnectionC2455s2;
                }
                if (i10 == 0) {
                    i7 = 1;
                } else if (i10 == 2) {
                    i7 = 2;
                } else if (i10 == 6) {
                    i7 = 5;
                } else if (i10 == 5) {
                    i7 = 7;
                } else if (i10 == 3) {
                    i7 = 3;
                } else if (i10 == 4) {
                    i7 = 4;
                } else {
                    if (i10 != 7) {
                        throw new IllegalStateException("invalid ImeAction");
                    }
                    i7 = 6;
                }
                editorInfo.imeOptions = i7;
                i8 = c2447k.f13702d;
                if (i8 == 1) {
                }
                if (!z7) {
                }
                i9 = editorInfo.inputType;
                if ((i9 & 1) == 1) {
                }
                long j622 = c2459w.f13724b;
                int i1322 = C1602n0.f10303c;
                editorInfo.initialSelStart = (int) (j622 >> 32);
                editorInfo.initialSelEnd = (int) (j622 & 4294967295L);
                AbstractC2067b.m3299x(editorInfo, c2459w.f13723a.f10239f);
                editorInfo.imeOptions |= 33554432;
                if (C2560j.m4082d()) {
                }
                InputConnectionC2455s inputConnectionC2455s22 = new InputConnectionC2455s(c2462z.f13739g, new C0019e1(c2462z), c2462z.f13740h.f13701c);
                c2462z.f13741i.add(new WeakReference(inputConnectionC2455s22));
                return inputConnectionC2455s22;
            }
        } else {
            C3812t c3812t2 = (C3812t) c3705n0.f17620h.get();
            if (c3812t2 != null) {
                obj2 = c3812t2.f18007b;
            } else {
                obj2 = null;
            }
            C3718q1 c3718q1 = (C3718q1) obj2;
            if (c3718q1 != null) {
                synchronized (c3718q1.f17677c) {
                    if (c3718q1.f17679e) {
                        return null;
                    }
                    InputConnectionC0356z m792a = c3718q1.f17675a.m792a(editorInfo);
                    C3423m0 c3423m0 = new C3423m0(11, c3718q1);
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 34) {
                        inputConnectionC2449m = new InputConnectionC2449m(m792a, c3423m0);
                    } else if (i14 >= 25) {
                        inputConnectionC2449m = new InputConnectionC2449m(m792a, c3423m0);
                    } else {
                        inputConnectionC2449m = new InputConnectionC2449m(m792a, c3423m0);
                    }
                    c3718q1.f17678d.m4300b(new WeakReference(inputConnectionC2449m));
                    return inputConnectionC2449m;
                }
            }
        }
        return null;
    }

    @Override // android.view.View
    public final void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        C0482o c0482o;
        AutofillId autofillId;
        String m5086a;
        TranslationRequestValue forText;
        ViewTranslationRequest build;
        ViewOnAttachStateChangeListenerC3864c viewOnAttachStateChangeListenerC3864c = this.f17777x;
        viewOnAttachStateChangeListenerC3864c.getClass();
        for (long j6 : jArr) {
            C0483p c0483p = (C0483p) viewOnAttachStateChangeListenerC3864c.m5876g().m3612b((int) j6);
            if (c0483p != null && (c0482o = c0483p.f1698a) != null) {
                AbstractC0275c.m602r();
                autofillId = viewOnAttachStateChangeListenerC3864c.f18104e.getAutofillId();
                ViewTranslationRequest.Builder m598n = AbstractC0275c.m598n(autofillId, c0482o.f1697g);
                Object m3592g = c0482o.f1694d.f1683e.m3592g(AbstractC0487t.f1725A);
                if (m3592g == null) {
                    m3592g = null;
                }
                List list = (List) m3592g;
                if (list != null && (m5086a = AbstractC3353a.m5086a(list, "\n", null, 62)) != null) {
                    forText = TranslationRequestValue.forText(new C1587g(m5086a));
                    m598n.setValue("android:text", forText);
                    build = m598n.build();
                    consumer.accept(build);
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        C2572v c2572v;
        super.onDetachedFromWindow();
        this.f17763q.onViewDetachedFromWindow(this);
        C0216v c0216v = null;
        if (this.f17749j) {
            View view = this.f17747i;
            if (view != null) {
                removeView(view);
            } else {
                AbstractC3367j.m5105j("frameRateCategoryView");
                throw null;
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 > 28) {
            C2184c0 c2184c0 = f17699O0;
            synchronized (c2184c0) {
                c2184c0.m3564i(this);
            }
        }
        C3474u c3474u = getSnapshotObserver().f16991a;
        C0230e0 c0230e0 = c3474u.f16760h;
        if (c0230e0 != null) {
            c0230e0.m507a();
        }
        c3474u.m5278a();
        this.f17757n.getClass();
        C3696l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            c0216v = viewTreeOwners.f17587a.mo415g();
        }
        if (c0216v != null) {
            c0216v.m473f(this.f17777x);
            c0216v.m473f(this);
            if (m5720h() && (c2572v = this.f17717I) != null) {
                C3839h c3839h = C3839h.f18054a;
                c3839h.getClass();
                ((AutofillManager) c2572v.f13968g).unregisterCallback(AbstractC3832a.m5842c(c3839h));
            }
            getViewTreeObserver().removeOnGlobalLayoutListener(this.f17746h0);
            getViewTreeObserver().removeOnScrollChangedListener(this.f17748i0);
            getViewTreeObserver().removeOnTouchModeChangeListener(this.f17750j0);
            if (i7 >= 31) {
                C3669e0.f17503a.m5664a(this);
            }
            C3834c c3834c = this.f17719J;
            if (c3834c != null) {
                getSemanticsOwner().f1703d.m3564i(c3834c);
                ((C0368l) getFocusOwner()).f1244g.m3564i(c3834c);
                return;
            }
            return;
        }
        throw AbstractC2487d.m4041e("No lifecycle owner exists");
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z7, int i7, Rect rect) {
        super.onFocusChanged(z7, i7, rect);
        if (!z7 && !hasFocus()) {
            AbstractC0362f.m807e(((C0368l) getFocusOwner()).f1240c, true);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z7, int i7, int i8, int i9, int i10) {
        this.f17736b0 = 0L;
        this.f17730S.m5517j(this.f17712F0);
        this.f17728Q = null;
        m5737L();
        if (this.f17727P != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i9 - i7, i10 - i8);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i7, int i8) {
        C3547v0 c3547v0 = this.f17730S;
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                m5742p(getRoot());
            }
            long m5722j = m5722j(i7);
            long m5722j2 = m5722j(i8);
            long m3331h = AbstractC2072e.m3331h((int) (m5722j >>> 32), (int) (m5722j & 4294967295L), (int) (m5722j2 >>> 32), (int) (4294967295L & m5722j2));
            C3091a c3091a = this.f17728Q;
            if (c3091a == null) {
                this.f17728Q = new C3091a(m3331h);
                this.f17729R = false;
            } else if (!C3091a.m4754b(c3091a.f15687a, m3331h)) {
                this.f17729R = true;
            }
            c3547v0.m5524q(m3331h);
            c3547v0.m5519l();
            setMeasuredDimension(getRoot().f16873J.f16953p.f16053e, getRoot().f16873J.f16953p.f16054f);
            if (this.f17727P != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().f16873J.f16953p.f16053e, 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().f16873J.f16953p.f16054f, 1073741824));
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.view.View
    public final void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i7) {
        if (m5720h() && viewStructure != null) {
            C3834c c3834c = this.f17719J;
            if (c3834c != null) {
                C3502g0 c3502g0 = c3834c.f18046b.f1700a;
                AutofillId autofillId = c3834c.f18050f;
                String str = c3834c.f18049e;
                C0685a c0685a = c3834c.f18048d;
                AbstractC2072e.m3339q(viewStructure, c3502g0, autofillId, str, c0685a);
                Object[] objArr = AbstractC2204m0.f12712a;
                C2184c0 c2184c0 = new C2184c0(2);
                c2184c0.m3556a(c3502g0);
                c2184c0.m3556a(viewStructure);
                while (c2184c0.m3563h()) {
                    Object m3565j = c2184c0.m3565j(c2184c0.f12629b - 1);
                    AbstractC3367j.m5098c(m3565j, "null cannot be cast to non-null type android.view.ViewStructure");
                    ViewStructure viewStructure2 = (ViewStructure) m3565j;
                    Object m3565j2 = c2184c0.m3565j(c2184c0.f12629b - 1);
                    AbstractC3367j.m5098c(m3565j2, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsInfo");
                    C2702b c2702b = (C2702b) ((C3502g0) m3565j2).m5440n();
                    int i8 = c2702b.f14511e.f14519g;
                    for (int i9 = 0; i9 < i8; i9++) {
                        C3502g0 c3502g02 = (C3502g0) c2702b.get(i9);
                        if (!c3502g02.f16883T && c3502g02.m5407I() && c3502g02.m5408J()) {
                            C0477j m5449w = c3502g02.m5449w();
                            if (m5449w != null) {
                                C2194h0 c2194h0 = m5449w.f1683e;
                                if (c2194h0.m3587b(AbstractC0476i.f1663g) || c2194h0.m3587b(AbstractC0487t.f1756q) || c2194h0.m3587b(AbstractC0487t.f1757r)) {
                                    ViewStructure newChild = viewStructure2.newChild(viewStructure2.addChildCount(1));
                                    AbstractC2072e.m3339q(newChild, c3502g02, c3834c.f18050f, str, c0685a);
                                    c2184c0.m3556a(c3502g02);
                                    c2184c0.m3556a(newChild);
                                }
                            }
                            c2184c0.m3556a(c3502g02);
                            c2184c0.m3556a(viewStructure2);
                        }
                    }
                }
            }
            C2572v c2572v = this.f17717I;
            if (c2572v != null) {
                C3841j c3841j = (C3841j) c2572v.f13967f;
                LinkedHashMap linkedHashMap = c3841j.f18055a;
                LinkedHashMap linkedHashMap2 = c3841j.f18055a;
                if (!linkedHashMap.isEmpty()) {
                    int addChildCount = viewStructure.addChildCount(linkedHashMap2.size());
                    Iterator it = linkedHashMap2.entrySet().iterator();
                    if (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        int intValue = ((Number) entry.getKey()).intValue();
                        if (entry.getValue() == null) {
                            ViewStructure newChild2 = viewStructure.newChild(addChildCount);
                            newChild2.setAutofillId((AutofillId) c2572v.f13969h, intValue);
                            newChild2.setId(intValue, ((C3728t) c2572v.f13966e).getContext().getPackageName(), null, null);
                            newChild2.setAutofillType(1);
                            throw null;
                        }
                        throw new ClassCastException();
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final PointerIcon onResolvePointerIcon(MotionEvent motionEvent, int i7) {
        int toolType = motionEvent.getToolType(i7);
        if (!motionEvent.isFromSource(8194) && motionEvent.isFromSource(16386) && (toolType == 2 || toolType == 4)) {
            getPointerIconService().getClass();
        }
        return super.onResolvePointerIcon(motionEvent, i7);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i7) {
        EnumC3103m enumC3103m;
        if (this.f17741f) {
            EnumC3103m enumC3103m2 = EnumC3103m.f15703e;
            if (i7 != 0) {
                if (i7 != 1) {
                    enumC3103m = null;
                } else {
                    enumC3103m = EnumC3103m.f15704f;
                }
            } else {
                enumC3103m = enumC3103m2;
            }
            if (enumC3103m != null) {
                enumC3103m2 = enumC3103m;
            }
            setLayoutDirection(enumC3103m2);
        }
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [c2.h, u5.a] */
    @Override // android.view.View
    public final void onScrollCaptureSearch(Rect rect, Point point, Consumer consumer) {
        C0019e1 c0019e1;
        Object obj;
        if (Build.VERSION.SDK_INT >= 31 && (c0019e1 = this.f17718I0) != null) {
            C0484q semanticsOwner = getSemanticsOwner();
            InterfaceC2318h coroutineContext = getCoroutineContext();
            C2705e c2705e = new C2705e(new C0389i[16]);
            AbstractC3784a.m5796J(semanticsOwner.m1055a(), 0, new AbstractC3358a(1, C2705e.class, c2705e, "add", "add(Ljava/lang/Object;)Z"));
            AbstractC1804l.m3030W(c2705e.f14517e, AbstractC2067b.m3283h(C0382b.f1291h, C0382b.f1292i), 0, c2705e.f14519g);
            int i7 = c2705e.f14519g;
            if (i7 == 0) {
                obj = null;
            } else {
                obj = c2705e.f14517e[i7 - 1];
            }
            C0389i c0389i = (C0389i) obj;
            if (c0389i != null) {
                C3101k c3101k = c0389i.f1313c;
                ScrollCaptureCallbackC0384d scrollCaptureCallbackC0384d = new ScrollCaptureCallbackC0384d(c0389i.f1311a, c3101k, AbstractC0525d0.m1123a(coroutineContext), c0019e1, this);
                AbstractC3497e1 abstractC3497e1 = c0389i.f1314d;
                long j6 = (c3101k.f15698a << 32) | (c3101k.f15699b & 4294967295L);
                ScrollCaptureTarget m594j = AbstractC0275c.m594j(this, AbstractC0659i0.m1424x(AbstractC2067b.m3298w(AbstractC3191c1.m4897h(abstractC3497e1).mo4934j(abstractC3497e1, true))), new Point((int) (j6 >> 32), (int) (j6 & 4294967295L)), scrollCaptureCallbackC0384d);
                m594j.setScrollBounds(AbstractC0659i0.m1424x(c3101k));
                consumer.accept(m594j);
            }
        }
    }

    @Override // android.view.View
    public final void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        ViewOnAttachStateChangeListenerC3864c viewOnAttachStateChangeListenerC3864c = this.f17777x;
        viewOnAttachStateChangeListenerC3864c.getClass();
        if (Build.VERSION.SDK_INT < 31) {
            return;
        }
        if (AbstractC3367j.m5096a(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            AbstractC2067b.m3286k(viewOnAttachStateChangeListenerC3864c, longSparseArray);
        } else {
            viewOnAttachStateChangeListenerC3864c.f18104e.post(new RunnableC0225c(2, viewOnAttachStateChangeListenerC3864c, longSparseArray));
        }
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z7) {
        boolean m5692s;
        this.f17757n.f17692a.setValue(Boolean.valueOf(z7));
        this.f17716H0 = true;
        super.onWindowFocusChanged(z7);
        if (z7 && Build.VERSION.SDK_INT < 30 && getShowLayoutBounds() != (m5692s = AbstractC3681h0.m5692s())) {
            setShowLayoutBounds(m5692s);
            m5724o(getRoot());
        }
    }

    /* renamed from: p */
    public final void m5742p(C3502g0 c3502g0) {
        this.f17730S.m5523p(c3502g0, false);
        C2705e m5451y = c3502g0.m5451y();
        Object[] objArr = m5451y.f14517e;
        int i7 = m5451y.f14519g;
        for (int i8 = 0; i8 < i7; i8++) {
            m5742p((C3502g0) objArr[i8]);
        }
    }

    /* renamed from: r */
    public final boolean m5743r(MotionEvent motionEvent) {
        float x6 = motionEvent.getX();
        float y7 = motionEvent.getY();
        if (0.0f <= x6 && x6 <= getWidth() && 0.0f <= y7 && y7 <= getHeight()) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i7, Rect rect) {
        int i8;
        C0465c c0465c;
        if (isFocused()) {
            return true;
        }
        int ordinal = ((C0368l) getFocusOwner()).f1240c.m847M0().ordinal();
        if (ordinal != 0 && ordinal != 1 && ordinal != 2) {
            if (ordinal == 3) {
                C0360d m801D = AbstractC0362f.m801D(i7);
                if (m801D != null) {
                    i8 = m801D.f1227a;
                } else {
                    i8 = 7;
                }
                InterfaceC0366j focusOwner = getFocusOwner();
                if (rect != null) {
                    c0465c = AbstractC0659i0.m1395B(rect);
                } else {
                    c0465c = null;
                }
                return AbstractC3367j.m5096a(((C0368l) focusOwner).m834e(i8, c0465c, new C0367k(i8, 2)), Boolean.TRUE);
            }
            throw new RuntimeException();
        }
        return super.requestFocus(i7, rect);
    }

    /* renamed from: s */
    public final boolean m5744s(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        if (motionEvent.getPointerCount() != 1 || (motionEvent2 = this.f17776w0) == null || motionEvent2.getPointerCount() != motionEvent.getPointerCount() || motionEvent.getRawX() != motionEvent2.getRawX() || motionEvent.getRawY() != motionEvent2.getRawY()) {
            return true;
        }
        return false;
    }

    public void setAccessibilityEventBatchIntervalMillis(long j6) {
        this.f17775w.f17458h = j6;
    }

    public final void setConfigurationChangeObserver(InterfaceC3279c interfaceC3279c) {
        this.f17715H = interfaceC3279c;
    }

    public final void setContentCaptureManager$ui_release(ViewOnAttachStateChangeListenerC3864c viewOnAttachStateChangeListenerC3864c) {
        this.f17777x = viewOnAttachStateChangeListenerC3864c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5, types: [x0.q] */
    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [n0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public void setCoroutineContext(InterfaceC2318h interfaceC2318h) {
        this.f17753l = interfaceC2318h;
        AbstractC3809q abstractC3809q = getRoot().f16872I.f16802f;
        if (abstractC3809q instanceof C2857h0) {
            ((C2857h0) abstractC3809q).m4535M0();
        }
        if (!abstractC3809q.f17992e.f18005r) {
            AbstractC3088a.m4750b("visitSubtreeIf called on an unattached node");
        }
        C2705e c2705e = new C2705e(new AbstractC3809q[16]);
        AbstractC3809q abstractC3809q2 = abstractC3809q.f17992e;
        AbstractC3809q abstractC3809q3 = abstractC3809q2.f17997j;
        if (abstractC3809q3 == null) {
            AbstractC3498f.m5362b(c2705e, abstractC3809q2);
        } else {
            c2705e.m4300b(abstractC3809q3);
        }
        while (true) {
            int i7 = c2705e.f14519g;
            if (i7 != 0) {
                AbstractC3809q abstractC3809q4 = (AbstractC3809q) c2705e.m4309k(i7 - 1);
                if ((abstractC3809q4.f17995h & 16) != 0) {
                    for (AbstractC3809q abstractC3809q5 = abstractC3809q4; abstractC3809q5 != null; abstractC3809q5 = abstractC3809q5.f17997j) {
                        if ((abstractC3809q5.f17994g & 16) != 0) {
                            AbstractC3519m abstractC3519m = abstractC3809q5;
                            ?? r52 = 0;
                            while (abstractC3519m != 0) {
                                if (abstractC3519m instanceof InterfaceC3539s1) {
                                    InterfaceC3539s1 interfaceC3539s1 = (InterfaceC3539s1) abstractC3519m;
                                    if (interfaceC3539s1 instanceof C2857h0) {
                                        ((C2857h0) interfaceC3539s1).m4535M0();
                                    }
                                } else if ((abstractC3519m.f17994g & 16) != 0 && (abstractC3519m instanceof AbstractC3519m)) {
                                    AbstractC3809q abstractC3809q6 = abstractC3519m.f16962t;
                                    int i8 = 0;
                                    abstractC3519m = abstractC3519m;
                                    r52 = r52;
                                    while (abstractC3809q6 != null) {
                                        if ((abstractC3809q6.f17994g & 16) != 0) {
                                            i8++;
                                            r52 = r52;
                                            if (i8 == 1) {
                                                abstractC3519m = abstractC3809q6;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new C2705e(new AbstractC3809q[16]);
                                                }
                                                if (abstractC3519m != 0) {
                                                    r52.m4300b(abstractC3519m);
                                                    abstractC3519m = 0;
                                                }
                                                r52.m4300b(abstractC3809q6);
                                            }
                                        }
                                        abstractC3809q6 = abstractC3809q6.f17997j;
                                        abstractC3519m = abstractC3519m;
                                        r52 = r52;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                abstractC3519m = AbstractC3498f.m5366f(r52);
                            }
                        }
                    }
                }
                AbstractC3498f.m5362b(c2705e, abstractC3809q4);
            } else {
                return;
            }
        }
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j6) {
        this.f17736b0 = j6;
    }

    public final void setOnViewTreeOwnersAvailable(InterfaceC3279c interfaceC3279c) {
        C3696l viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            interfaceC3279c.mo23f(viewTreeOwners);
        }
        if (!isAttachedToWindow()) {
            this.f17744g0 = interfaceC3279c;
        }
    }

    public void setShowLayoutBounds(boolean z7) {
        this.f17726O = z7;
    }

    public void setUncaughtExceptionHandler(InterfaceC3542t1 interfaceC3542t1) {
        this.f17730S.getClass();
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    /* renamed from: t */
    public final void m5745t(float[] fArr) {
        m5729D();
        C0647c0.m1354e(fArr, this.f17734W);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f17738d0 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f17738d0 & 4294967295L));
        float[] fArr2 = this.f17733V;
        C0647c0.m1353d(fArr2);
        C0647c0.m1355f(fArr2, intBitsToFloat, intBitsToFloat2);
        AbstractC3681h0.m5697x(fArr, fArr2);
    }

    /* renamed from: u */
    public final long m5746u(long j6) {
        m5729D();
        long m1351b = C0647c0.m1351b(j6, this.f17734W);
        float intBitsToFloat = Float.intBitsToFloat((int) (this.f17738d0 >> 32)) + Float.intBitsToFloat((int) (m1351b >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (this.f17738d0 & 4294967295L)) + Float.intBitsToFloat((int) (m1351b & 4294967295L));
        return (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
    }

    /* renamed from: v */
    public final void m5747v(boolean z7) {
        C3720r c3720r;
        C3547v0 c3547v0 = this.f17730S;
        if (!c3547v0.f17052b.m77A() && ((C2705e) c3547v0.f17055e.f344f).f14519g == 0) {
            return;
        }
        Trace.beginSection("AndroidOwner:measureAndLayout");
        if (z7) {
            try {
                c3720r = this.f17712F0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } else {
            c3720r = null;
        }
        if (c3547v0.m5517j(c3720r)) {
            requestLayout();
        }
        c3547v0.m5512a(false);
        if (this.f17709E) {
            getViewTreeObserver().dispatchOnGlobalLayout();
            this.f17709E = false;
        }
        Trace.endSection();
    }

    /* renamed from: w */
    public final void m5748w(C3502g0 c3502g0, long j6) {
        C3547v0 c3547v0 = this.f17730S;
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            c3547v0.m5518k(c3502g0, j6);
            if (!c3547v0.f17052b.m77A()) {
                c3547v0.m5512a(false);
                if (this.f17709E) {
                    getViewTreeObserver().dispatchOnGlobalLayout();
                    this.f17709E = false;
                }
            }
            getRectManager().m1466b();
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    /* renamed from: x */
    public final void m5749x(InterfaceC3521m1 interfaceC3521m1, boolean z7) {
        ArrayList arrayList = this.f17703B;
        if (!z7) {
            if (!this.f17707D) {
                arrayList.remove(interfaceC3521m1);
                ArrayList arrayList2 = this.f17705C;
                if (arrayList2 != null) {
                    arrayList2.remove(interfaceC3521m1);
                    return;
                }
                return;
            }
            return;
        }
        if (!this.f17707D) {
            arrayList.add(interfaceC3521m1);
            return;
        }
        ArrayList arrayList3 = this.f17705C;
        if (arrayList3 == null) {
            arrayList3 = new ArrayList();
            this.f17705C = arrayList3;
        }
        arrayList3.add(interfaceC3521m1);
    }

    /* renamed from: y */
    public final void m5750y() {
        C3834c c3834c;
        if (this.f17721K) {
            C3474u c3474u = getSnapshotObserver().f16991a;
            synchronized (c3474u.f16759g) {
                try {
                    C2705e c2705e = c3474u.f16758f;
                    int i7 = c2705e.f14519g;
                    int i8 = 0;
                    for (int i9 = 0; i9 < i7; i9++) {
                        C3473t c3473t = (C3473t) c2705e.f14517e[i9];
                        c3473t.m5277e();
                        if (!c3473t.f16746f.m3595j()) {
                            i8++;
                        } else if (i8 > 0) {
                            Object[] objArr = c2705e.f14517e;
                            objArr[i9 - i8] = objArr[i9];
                        }
                    }
                    int i10 = i7 - i8;
                    AbstractC1804l.m3023P(c2705e.f14517e, i10, i7);
                    c2705e.f14519g = i10;
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.f17721K = false;
        }
        C3733u0 c3733u0 = this.f17727P;
        if (c3733u0 != null) {
            m5721i(c3733u0);
        }
        if (m5720h() && (c3834c = this.f17719J) != null) {
            C2222x c2222x = c3834c.f18051g;
            if (c2222x.f12760d == 0 && c3834c.f18052h) {
                ((AutofillManager) c3834c.f18045a.f14390f).commit();
                c3834c.f18052h = false;
            }
            if (c2222x.f12760d != 0) {
                c3834c.f18052h = true;
            }
        }
        while (this.f17782z0.m3563h() && this.f17782z0.m3560e(0) != null) {
            int i11 = this.f17782z0.f12629b;
            for (int i12 = 0; i12 < i11; i12++) {
                InterfaceC3277a interfaceC3277a = (InterfaceC3277a) this.f17782z0.m3560e(i12);
                C2184c0 c2184c0 = this.f17782z0;
                if (i12 >= 0 && i12 < c2184c0.f12629b) {
                    Object[] objArr2 = c2184c0.f12628a;
                    Object obj = objArr2[i12];
                    objArr2[i12] = null;
                    if (interfaceC3277a != null) {
                        interfaceC3277a.mo52a();
                    }
                } else {
                    c2184c0.m3568m(i12);
                    throw null;
                }
            }
            this.f17782z0.m3566k(0, i11);
        }
    }

    /* renamed from: z */
    public final void m5751z(C3502g0 c3502g0) {
        C3653a0 c3653a0 = this.f17775w;
        c3653a0.f17438A = true;
        if (c3653a0.m5648o()) {
            c3653a0.m5649p(c3502g0);
        }
        ViewOnAttachStateChangeListenerC3864c viewOnAttachStateChangeListenerC3864c = this.f17777x;
        viewOnAttachStateChangeListenerC3864c.f18110k = true;
        if (viewOnAttachStateChangeListenerC3864c.m5877h()) {
            viewOnAttachStateChangeListenerC3864c.f18111l.mo2505v(C1694m.f10482a);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7) {
        AbstractC3367j.m5097b(view);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = generateDefaultLayoutParams();
        }
        addViewInLayout(view, i7, layoutParams, true);
    }

    public C3672f getAccessibilityManager() {
        return this.f17779y;
    }

    public C3676g getClipboard() {
        return this.f17724M;
    }

    public C3680h getClipboardManager() {
        return this.f17723L;
    }

    /* renamed from: getDragAndDropManager, reason: merged with bridge method [inline-methods] */
    public ViewOnDragListenerC0099a m5916getDragAndDropManager() {
        return this.f17755m;
    }

    public C2221w getLayoutNodes() {
        return this.f17767s;
    }

    public C3728t getOutOfFrameExecutor() {
        if (isAttachedToWindow()) {
            return this;
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, int i8) {
        ViewGroup.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        generateDefaultLayoutParams.width = i7;
        generateDefaultLayoutParams.height = i8;
        addViewInLayout(view, -1, generateDefaultLayoutParams, true);
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i7, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, i7, layoutParams, true);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(View view, ViewGroup.LayoutParams layoutParams) {
        addViewInLayout(view, -1, layoutParams, true);
    }

    @InterfaceC1682a
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getRoot$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    @InterfaceC1682a
    public static /* synthetic */ void getTextInputService$annotations() {
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public final void setUncaughtExceptionHandler$ui_release(InterfaceC3542t1 interfaceC3542t1) {
    }
}
