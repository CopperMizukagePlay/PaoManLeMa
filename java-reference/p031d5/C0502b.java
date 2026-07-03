package p031d5;

import android.hardware.Camera;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import p023c5.C0424p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: d5.b */
/* loaded from: classes.dex */
public final class C0502b {

    /* renamed from: g */
    public static final ArrayList f1787g;

    /* renamed from: a */
    public boolean f1788a;

    /* renamed from: b */
    public boolean f1789b;

    /* renamed from: c */
    public final boolean f1790c;

    /* renamed from: d */
    public final Camera f1791d;

    /* renamed from: e */
    public final Handler f1792e;

    /* renamed from: f */
    public final C0501a f1793f;

    static {
        ArrayList arrayList = new ArrayList(2);
        f1787g = arrayList;
        arrayList.add("auto");
        arrayList.add("macro");
    }

    public C0502b(Camera camera, C0510j c0510j) {
        C0424p c0424p = new C0424p(1, this);
        this.f1793f = new C0501a(this);
        this.f1792e = new Handler(c0424p);
        this.f1791d = camera;
        String focusMode = camera.getParameters().getFocusMode();
        c0510j.getClass();
        boolean contains = f1787g.contains(focusMode);
        this.f1790c = contains;
        Log.i("b", "Current focus mode '" + focusMode + "'; use auto focus? " + contains);
        this.f1788a = false;
        m1085b();
    }

    /* renamed from: a */
    public final synchronized void m1084a() {
        if (!this.f1788a && !this.f1792e.hasMessages(1)) {
            Handler handler = this.f1792e;
            handler.sendMessageDelayed(handler.obtainMessage(1), 2000L);
        }
    }

    /* renamed from: b */
    public final void m1085b() {
        if (this.f1790c && !this.f1788a && !this.f1789b) {
            try {
                this.f1791d.autoFocus(this.f1793f);
                this.f1789b = true;
            } catch (RuntimeException e7) {
                Log.w("b", "Unexpected exception while focusing", e7);
                m1084a();
            }
        }
    }

    /* renamed from: c */
    public final void m1086c() {
        this.f1788a = true;
        this.f1789b = false;
        this.f1792e.removeMessages(1);
        if (this.f1790c) {
            try {
                this.f1791d.cancelAutoFocus();
            } catch (RuntimeException e7) {
                Log.w("b", "Unexpected exception while cancelling focusing", e7);
            }
        }
    }
}
