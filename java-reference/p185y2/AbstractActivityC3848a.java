package p185y2;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import androidx.lifecycle.AbstractC0180c0;
import androidx.lifecycle.C0216v;
import androidx.lifecycle.EnumC0203o;
import androidx.lifecycle.FragmentC0186f0;
import androidx.lifecycle.InterfaceC0213t;
import com.paoman.lema.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.WeakHashMap;
import p051g3.AbstractC1653q;
import p051g3.C1651p;
import p102n1.AbstractC2710c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: y2.a */
/* loaded from: classes.dex */
public abstract class AbstractActivityC3848a extends Activity implements InterfaceC0213t {

    /* renamed from: e */
    public final C0216v f18075e = new C0216v(this, true);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v9, types: [g3.p, java.lang.Object] */
    @Override // android.app.Activity, android.view.Window.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Object invoke;
        boolean booleanValue;
        AbstractC3367j.m5100e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView, "getDecorView(...)");
        if (AbstractC2710c.m4334h(decorView, keyEvent)) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return super.dispatchKeyEvent(keyEvent);
        }
        onUserInteraction();
        Window window = getWindow();
        boolean z7 = false;
        if (window.hasFeature(8)) {
            ActionBar actionBar = getActionBar();
            if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                if (!AbstractC2710c.f14557t) {
                    try {
                        AbstractC2710c.f14558u = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                    } catch (NoSuchMethodException unused) {
                    }
                    AbstractC2710c.f14557t = true;
                }
                Method method = AbstractC2710c.f14558u;
                if (method != null) {
                    try {
                        invoke = method.invoke(actionBar, keyEvent);
                    } catch (IllegalAccessException | InvocationTargetException unused2) {
                    }
                    if (invoke != null) {
                        booleanValue = ((Boolean) invoke).booleanValue();
                        if (booleanValue) {
                            return true;
                        }
                    }
                }
                booleanValue = false;
                if (booleanValue) {
                }
            }
        }
        if (window.superDispatchKeyEvent(keyEvent)) {
            return true;
        }
        View decorView2 = window.getDecorView();
        int i7 = AbstractC1653q.f10423a;
        KeyEvent.DispatcherState dispatcherState = null;
        if (Build.VERSION.SDK_INT < 28) {
            ArrayList arrayList = C1651p.f10416d;
            C1651p c1651p = (C1651p) decorView2.getTag(R.id.tag_unhandled_key_event_manager);
            C1651p c1651p2 = c1651p;
            if (c1651p == null) {
                ?? obj = new Object();
                obj.f10417a = null;
                obj.f10418b = null;
                obj.f10419c = null;
                decorView2.setTag(R.id.tag_unhandled_key_event_manager, obj);
                c1651p2 = obj;
            }
            if (keyEvent.getAction() == 0) {
                WeakHashMap weakHashMap = c1651p2.f10417a;
                if (weakHashMap != null) {
                    weakHashMap.clear();
                }
                ArrayList arrayList2 = C1651p.f10416d;
                if (!arrayList2.isEmpty()) {
                    synchronized (arrayList2) {
                        try {
                            if (c1651p2.f10417a == null) {
                                c1651p2.f10417a = new WeakHashMap();
                            }
                            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                                ArrayList arrayList3 = C1651p.f10416d;
                                View view = (View) ((WeakReference) arrayList3.get(size)).get();
                                if (view == null) {
                                    arrayList3.remove(size);
                                } else {
                                    c1651p2.f10417a.put(view, Boolean.TRUE);
                                    for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                                        c1651p2.f10417a.put((View) parent, Boolean.TRUE);
                                    }
                                }
                            }
                        } finally {
                        }
                    }
                }
            }
            View m2694a = c1651p2.m2694a(decorView2);
            if (keyEvent.getAction() == 0) {
                int keyCode = keyEvent.getKeyCode();
                if (m2694a != null && !KeyEvent.isModifierKey(keyCode)) {
                    if (c1651p2.f10418b == null) {
                        c1651p2.f10418b = new SparseArray();
                    }
                    c1651p2.f10418b.put(keyCode, new WeakReference(m2694a));
                }
            }
            if (m2694a != null) {
                z7 = true;
            }
        }
        if (z7) {
            return true;
        }
        if (decorView2 != 0) {
            dispatcherState = decorView2.getKeyDispatcherState();
        }
        return keyEvent.dispatch(this, dispatcherState, this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        AbstractC3367j.m5100e(keyEvent, "event");
        View decorView = getWindow().getDecorView();
        AbstractC3367j.m5099d(decorView, "getDecorView(...)");
        if (AbstractC2710c.m4334h(decorView, keyEvent)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        int i7 = FragmentC0186f0.f837f;
        AbstractC0180c0.m417b(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        AbstractC3367j.m5100e(bundle, "outState");
        C0216v c0216v = this.f18075e;
        c0216v.m470c("setCurrentState");
        c0216v.m472e(EnumC0203o.f865g);
        super.onSaveInstanceState(bundle);
    }
}
