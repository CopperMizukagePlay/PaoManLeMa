package p008b;

import android.app.PictureInPictureUiState;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Trace;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.lifecycle.AbstractC0180c0;
import androidx.lifecycle.AbstractC0194j0;
import androidx.lifecycle.AbstractC0206p0;
import androidx.lifecycle.C0196k0;
import androidx.lifecycle.C0198l0;
import androidx.lifecycle.C0212s0;
import androidx.lifecycle.C0216v;
import androidx.lifecycle.EnumC0201n;
import androidx.lifecycle.EnumC0203o;
import androidx.lifecycle.FragmentC0186f0;
import androidx.lifecycle.InterfaceC0193j;
import androidx.lifecycle.InterfaceC0209r;
import androidx.lifecycle.InterfaceC0213t;
import androidx.lifecycle.InterfaceC0214t0;
import com.paoman.lema.MainActivity;
import com.paoman.lema.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import p001a0.C0019e1;
import p033e.C0592a;
import p041f.InterfaceC1512d;
import p044f3.InterfaceC1534a;
import p053g5.C1691j;
import p096m3.C2572v;
import p102n1.AbstractC2710c;
import p147t2.C3250c;
import p148t3.C3252a;
import p148t3.InterfaceC3254c;
import p150t5.InterfaceC3277a;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p172w3.C3778b;
import p172w3.C3781e;
import p172w3.InterfaceC3780d;
import p172w3.InterfaceC3782f;
import p185y2.AbstractActivityC3848a;
import p186y3.C3850a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: b.m */
/* loaded from: classes.dex */
public abstract class AbstractActivityC0245m extends AbstractActivityC3848a implements InterfaceC0214t0, InterfaceC0193j, InterfaceC3782f, InterfaceC0240j0, InterfaceC3254c, InterfaceC1512d {

    /* renamed from: f */
    public final C0592a f950f;

    /* renamed from: g */
    public final C0019e1 f951g;

    /* renamed from: h */
    public final C3781e f952h;

    /* renamed from: i */
    public C0212s0 f953i;

    /* renamed from: j */
    public final ViewTreeObserverOnDrawListenerC0237i f954j;

    /* renamed from: k */
    public final C1691j f955k;

    /* renamed from: l */
    public final C0243l f956l;

    /* renamed from: m */
    public final CopyOnWriteArrayList f957m;

    /* renamed from: n */
    public final CopyOnWriteArrayList f958n;

    /* renamed from: o */
    public final CopyOnWriteArrayList f959o;

    /* renamed from: p */
    public final CopyOnWriteArrayList f960p;

    /* renamed from: q */
    public final CopyOnWriteArrayList f961q;

    /* renamed from: r */
    public final CopyOnWriteArrayList f962r;

    /* renamed from: s */
    public final CopyOnWriteArrayList f963s;

    /* renamed from: t */
    public boolean f964t;

    /* renamed from: u */
    public boolean f965u;

    /* renamed from: v */
    public final C1691j f966v;

    /* renamed from: w */
    public final C1691j f967w;

    public AbstractActivityC0245m() {
        InterfaceC3780d interfaceC3780d;
        C0592a c0592a = new C0592a();
        this.f950f = c0592a;
        final MainActivity mainActivity = (MainActivity) this;
        this.f951g = new C0019e1(15, false);
        C3850a c3850a = new C3850a(this, new C0226c0(18, this));
        C3781e c3781e = new C3781e(c3850a, 1);
        this.f952h = c3781e;
        this.f954j = new ViewTreeObserverOnDrawListenerC0237i(mainActivity);
        this.f955k = AbstractC2710c.m4327J(new C0196k0(mainActivity, 2));
        new AtomicInteger();
        this.f956l = new C0243l(mainActivity);
        this.f957m = new CopyOnWriteArrayList();
        this.f958n = new CopyOnWriteArrayList();
        this.f959o = new CopyOnWriteArrayList();
        this.f960p = new CopyOnWriteArrayList();
        this.f961q = new CopyOnWriteArrayList();
        this.f962r = new CopyOnWriteArrayList();
        this.f963s = new CopyOnWriteArrayList();
        this.f966v = AbstractC2710c.m4327J(new C0196k0(mainActivity, 3));
        C0216v c0216v = this.f18075e;
        if (c0216v != null) {
            final int i7 = 0;
            c0216v.m468a(new InterfaceC0209r() { // from class: b.e
                @Override // androidx.lifecycle.InterfaceC0209r
                /* renamed from: c */
                public final void mo454c(InterfaceC0213t interfaceC0213t, EnumC0201n enumC0201n) {
                    Window window;
                    View peekDecorView;
                    switch (i7) {
                        case 0:
                            MainActivity mainActivity2 = mainActivity;
                            if (enumC0201n == EnumC0201n.ON_STOP && (window = mainActivity2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            MainActivity mainActivity3 = mainActivity;
                            if (enumC0201n == EnumC0201n.ON_DESTROY) {
                                mainActivity3.f950f.f1946b = null;
                                if (!mainActivity3.isChangingConfigurations()) {
                                    LinkedHashMap linkedHashMap = mainActivity3.m522e().f876a;
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((AbstractC0206p0) it.next()).m466a();
                                    }
                                    linkedHashMap.clear();
                                }
                                ViewTreeObserverOnDrawListenerC0237i viewTreeObserverOnDrawListenerC0237i = mainActivity3.f954j;
                                MainActivity mainActivity4 = viewTreeObserverOnDrawListenerC0237i.f925h;
                                mainActivity4.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0237i);
                                mainActivity4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0237i);
                                return;
                            }
                            return;
                    }
                }
            });
            final int i8 = 1;
            this.f18075e.m468a(new InterfaceC0209r() { // from class: b.e
                @Override // androidx.lifecycle.InterfaceC0209r
                /* renamed from: c */
                public final void mo454c(InterfaceC0213t interfaceC0213t, EnumC0201n enumC0201n) {
                    Window window;
                    View peekDecorView;
                    switch (i8) {
                        case 0:
                            MainActivity mainActivity2 = mainActivity;
                            if (enumC0201n == EnumC0201n.ON_STOP && (window = mainActivity2.getWindow()) != null && (peekDecorView = window.peekDecorView()) != null) {
                                peekDecorView.cancelPendingInputEvents();
                                return;
                            }
                            return;
                        default:
                            MainActivity mainActivity3 = mainActivity;
                            if (enumC0201n == EnumC0201n.ON_DESTROY) {
                                mainActivity3.f950f.f1946b = null;
                                if (!mainActivity3.isChangingConfigurations()) {
                                    LinkedHashMap linkedHashMap = mainActivity3.m522e().f876a;
                                    Iterator it = linkedHashMap.values().iterator();
                                    while (it.hasNext()) {
                                        ((AbstractC0206p0) it.next()).m466a();
                                    }
                                    linkedHashMap.clear();
                                }
                                ViewTreeObserverOnDrawListenerC0237i viewTreeObserverOnDrawListenerC0237i = mainActivity3.f954j;
                                MainActivity mainActivity4 = viewTreeObserverOnDrawListenerC0237i.f925h;
                                mainActivity4.getWindow().getDecorView().removeCallbacks(viewTreeObserverOnDrawListenerC0237i);
                                mainActivity4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(viewTreeObserverOnDrawListenerC0237i);
                                return;
                            }
                            return;
                    }
                }
            });
            this.f18075e.m468a(new C3778b(3, mainActivity));
            c3850a.m5867a();
            EnumC0203o enumC0203o = this.f18075e.f881c;
            if (enumC0203o != EnumC0203o.f864f && enumC0203o != EnumC0203o.f865g) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            C3850a c3850a2 = (C3850a) ((C3781e) c3781e.f17918c).f17917b;
            synchronized (c3850a2.f18079c) {
                Iterator it = c3850a2.f18080d.entrySet().iterator();
                do {
                    interfaceC3780d = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    Map.Entry entry = (Map.Entry) it.next();
                    String str = (String) entry.getKey();
                    InterfaceC3780d interfaceC3780d2 = (InterfaceC3780d) entry.getValue();
                    if (AbstractC3367j.m5096a(str, "androidx.lifecycle.internal.SavedStateHandlesProvider")) {
                        interfaceC3780d = interfaceC3780d2;
                    }
                } while (interfaceC3780d == null);
            }
            if (interfaceC3780d == null) {
                C0198l0 c0198l0 = new C0198l0((C3781e) c3781e.f17918c, mainActivity);
                ((C3781e) c3781e.f17918c).m5787l("androidx.lifecycle.internal.SavedStateHandlesProvider", c0198l0);
                this.f18075e.m468a(new C3778b(2, c0198l0));
            }
            ((C3781e) c3781e.f17918c).m5787l("android:support:activity-result", new C0231f(0, mainActivity));
            C0233g c0233g = new C0233g(mainActivity);
            AbstractActivityC0245m abstractActivityC0245m = c0592a.f1946b;
            if (abstractActivityC0245m != null) {
                c0233g.m509a(abstractActivityC0245m);
            }
            c0592a.f1945a.add(c0233g);
            AbstractC2710c.m4327J(new C0196k0(mainActivity, 4));
            this.f967w = AbstractC2710c.m4327J(new C0196k0(mainActivity, 5));
            return;
        }
        throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
    }

    /* renamed from: d */
    public static void m519d(MainActivity mainActivity) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e7) {
            if (AbstractC3367j.m5096a(e7.getMessage(), "Can not perform this action after onSaveInstanceState")) {
            } else {
                throw e7;
            }
        } catch (NullPointerException e8) {
            if (!AbstractC3367j.m5096a(e8.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e8;
            }
        }
    }

    @Override // p008b.InterfaceC0240j0
    /* renamed from: a */
    public final C0236h0 mo516a() {
        return (C0236h0) this.f967w.getValue();
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m523f();
        View decorView = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView, "getDecorView(...)");
        this.f954j.m512a(decorView);
        super.addContentView(view, layoutParams);
    }

    @Override // p172w3.InterfaceC3782f
    /* renamed from: b */
    public final C3781e mo520b() {
        return (C3781e) this.f952h.f17918c;
    }

    @Override // p148t3.InterfaceC3254c
    /* renamed from: c */
    public final C2572v mo521c() {
        return mo516a().m510a();
    }

    /* renamed from: e */
    public final C0212s0 m522e() {
        if (getApplication() != null) {
            if (this.f953i == null) {
                C0235h c0235h = (C0235h) getLastNonConfigurationInstance();
                if (c0235h != null) {
                    this.f953i = c0235h.f919a;
                }
                if (this.f953i == null) {
                    this.f953i = new C0212s0(0);
                }
            }
            C0212s0 c0212s0 = this.f953i;
            AbstractC3367j.m5097b(c0212s0);
            return c0212s0;
        }
        throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
    }

    /* renamed from: f */
    public final void m523f() {
        View decorView = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView, "getDecorView(...)");
        AbstractC0194j0.m461f(decorView, this);
        View decorView2 = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView2, "getDecorView(...)");
        decorView2.setTag(R.id.view_tree_view_model_store_owner, this);
        View decorView3 = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView3, "getDecorView(...)");
        decorView3.setTag(R.id.view_tree_saved_state_registry_owner, this);
        View decorView4 = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView4, "getDecorView(...)");
        decorView4.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
        View decorView5 = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView5, "getDecorView(...)");
        decorView5.setTag(R.id.report_drawn, this);
        View decorView6 = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView6, "getDecorView(...)");
        decorView6.setTag(R.id.view_tree_navigation_event_dispatcher_owner, this);
    }

    @Override // androidx.lifecycle.InterfaceC0213t
    /* renamed from: g */
    public final C0216v mo415g() {
        return this.f18075e;
    }

    @Override // android.app.Activity
    public final void onActivityResult(int i7, int i8, Intent intent) {
        if (!this.f956l.m517a(i7, i8, intent)) {
            super.onActivityResult(i7, i8, intent);
        }
    }

    @Override // android.app.Activity
    public final void onBackPressed() {
        ((C3252a) this.f966v.getValue()).m4972a();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        AbstractC3367j.m5100e(configuration, "newConfig");
        super.onConfigurationChanged(configuration);
        Iterator it = this.f957m.iterator();
        AbstractC3367j.m5099d(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC1534a) it.next()).accept(configuration);
        }
    }

    @Override // p185y2.AbstractActivityC3848a, android.app.Activity
    public void onCreate(Bundle bundle) {
        this.f952h.m5785j(bundle);
        C0592a c0592a = this.f950f;
        c0592a.getClass();
        c0592a.f1946b = this;
        Iterator it = c0592a.f1945a.iterator();
        while (it.hasNext()) {
            ((C0233g) it.next()).m509a(this);
        }
        super.onCreate(bundle);
        int i7 = FragmentC0186f0.f837f;
        AbstractC0180c0.m417b(this);
        getPackageManager().hasSystemFeature("android.software.picture_in_picture");
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onCreatePanelMenu(int i7, Menu menu) {
        AbstractC3367j.m5100e(menu, "menu");
        if (i7 == 0) {
            super.onCreatePanelMenu(i7, menu);
            getMenuInflater();
            Iterator it = ((CopyOnWriteArrayList) this.f951g.f109e).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i7, MenuItem menuItem) {
        AbstractC3367j.m5100e(menuItem, "item");
        if (super.onMenuItemSelected(i7, menuItem)) {
            return true;
        }
        if (i7 == 0) {
            Iterator it = ((CopyOnWriteArrayList) this.f951g.f109e).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            return false;
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z7) {
        if (this.f964t) {
            return;
        }
        Iterator it = this.f960p.iterator();
        AbstractC3367j.m5099d(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC1534a) it.next()).accept(new C3250c(10));
        }
    }

    @Override // android.app.Activity
    public void onNewIntent(Intent intent) {
        AbstractC3367j.m5100e(intent, "intent");
        super.onNewIntent(intent);
        Iterator it = this.f959o.iterator();
        AbstractC3367j.m5099d(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC1534a) it.next()).accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i7, Menu menu) {
        AbstractC3367j.m5100e(menu, "menu");
        Iterator it = ((CopyOnWriteArrayList) this.f951g.f109e).iterator();
        if (!it.hasNext()) {
            super.onPanelClosed(i7, menu);
        } else {
            it.next().getClass();
            throw new ClassCastException();
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z7) {
        if (this.f965u) {
            return;
        }
        Iterator it = this.f961q.iterator();
        AbstractC3367j.m5099d(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC1534a) it.next()).accept(new C3250c(11));
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureUiStateChanged(PictureInPictureUiState pictureInPictureUiState) {
        C3250c c3250c;
        AbstractC3367j.m5100e(pictureInPictureUiState, "pipState");
        super.onPictureInPictureUiStateChanged(pictureInPictureUiState);
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 35) {
            pictureInPictureUiState.isStashed();
            pictureInPictureUiState.isTransitioningToPip();
            c3250c = new C3250c(12);
        } else if (i7 >= 31) {
            pictureInPictureUiState.isStashed();
            c3250c = new C3250c(12);
        } else {
            c3250c = new C3250c(12);
        }
        Iterator it = this.f962r.iterator();
        AbstractC3367j.m5099d(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC1534a) it.next()).accept(c3250c);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onPreparePanel(int i7, View view, Menu menu) {
        AbstractC3367j.m5100e(menu, "menu");
        if (i7 == 0) {
            super.onPreparePanel(i7, view, menu);
            Iterator it = ((CopyOnWriteArrayList) this.f951g.f109e).iterator();
            if (it.hasNext()) {
                it.next().getClass();
                throw new ClassCastException();
            }
            return true;
        }
        return true;
    }

    @Override // android.app.Activity
    public final void onRequestPermissionsResult(int i7, String[] strArr, int[] iArr) {
        AbstractC3367j.m5100e(strArr, "permissions");
        AbstractC3367j.m5100e(iArr, "grantResults");
        if (!this.f956l.m517a(i7, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", iArr))) {
            super.onRequestPermissionsResult(i7, strArr, iArr);
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, b.h] */
    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        C0235h c0235h;
        C0212s0 c0212s0 = this.f953i;
        if (c0212s0 == null && (c0235h = (C0235h) getLastNonConfigurationInstance()) != null) {
            c0212s0 = c0235h.f919a;
        }
        if (c0212s0 == null) {
            return null;
        }
        ?? obj = new Object();
        obj.f919a = c0212s0;
        return obj;
    }

    @Override // p185y2.AbstractActivityC3848a, android.app.Activity
    public final void onSaveInstanceState(Bundle bundle) {
        AbstractC3367j.m5100e(bundle, "outState");
        C0216v c0216v = this.f18075e;
        if (c0216v != null) {
            c0216v.m470c("setCurrentState");
            c0216v.m472e(EnumC0203o.f865g);
        }
        super.onSaveInstanceState(bundle);
        this.f952h.m5786k(bundle);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i7) {
        super.onTrimMemory(i7);
        Iterator it = this.f958n.iterator();
        AbstractC3367j.m5099d(it, "iterator(...)");
        while (it.hasNext()) {
            ((InterfaceC1534a) it.next()).accept(Integer.valueOf(i7));
        }
    }

    @Override // android.app.Activity
    public final void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator it = this.f963s.iterator();
        AbstractC3367j.m5099d(it, "iterator(...)");
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
    }

    @Override // android.app.Activity
    public final void reportFullyDrawn() {
        try {
            if (AbstractC3393k.m5153x()) {
                AbstractC3393k.m5137h("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            C0258z c0258z = (C0258z) this.f955k.getValue();
            synchronized (c0258z.f979a) {
                try {
                    c0258z.f980b = true;
                    ArrayList arrayList = c0258z.f981c;
                    int size = arrayList.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = arrayList.get(i7);
                        i7++;
                        ((InterfaceC3277a) obj).mo52a();
                    }
                    c0258z.f981c.clear();
                } finally {
                }
            }
            Trace.endSection();
        } catch (Throwable th) {
            Trace.endSection();
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i7) {
        m523f();
        View decorView = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView, "getDecorView(...)");
        this.f954j.m512a(decorView);
        super.setContentView(i7);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7) {
        AbstractC3367j.m5100e(intent, "intent");
        super.startActivityForResult(intent, i7);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10) {
        AbstractC3367j.m5100e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10);
    }

    @Override // android.app.Activity
    public final void startActivityForResult(Intent intent, int i7, Bundle bundle) {
        AbstractC3367j.m5100e(intent, "intent");
        super.startActivityForResult(intent, i7, bundle);
    }

    @Override // android.app.Activity
    public final void startIntentSenderForResult(IntentSender intentSender, int i7, Intent intent, int i8, int i9, int i10, Bundle bundle) {
        AbstractC3367j.m5100e(intentSender, "intent");
        super.startIntentSenderForResult(intentSender, i7, intent, i8, i9, i10, bundle);
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        m523f();
        View decorView = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView, "getDecorView(...)");
        this.f954j.m512a(decorView);
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public final void onMultiWindowModeChanged(boolean z7, Configuration configuration) {
        AbstractC3367j.m5100e(configuration, "newConfig");
        this.f964t = true;
        try {
            super.onMultiWindowModeChanged(z7, configuration);
            this.f964t = false;
            Iterator it = this.f960p.iterator();
            AbstractC3367j.m5099d(it, "iterator(...)");
            while (it.hasNext()) {
                ((InterfaceC1534a) it.next()).accept(new C3250c(10));
            }
        } catch (Throwable th) {
            this.f964t = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void onPictureInPictureModeChanged(boolean z7, Configuration configuration) {
        AbstractC3367j.m5100e(configuration, "newConfig");
        this.f965u = true;
        try {
            super.onPictureInPictureModeChanged(z7, configuration);
            this.f965u = false;
            Iterator it = this.f961q.iterator();
            AbstractC3367j.m5099d(it, "iterator(...)");
            while (it.hasNext()) {
                ((InterfaceC1534a) it.next()).accept(new C3250c(11));
            }
        } catch (Throwable th) {
            this.f965u = false;
            throw th;
        }
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m523f();
        View decorView = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView, "getDecorView(...)");
        this.f954j.m512a(decorView);
        super.setContentView(view, layoutParams);
    }
}
