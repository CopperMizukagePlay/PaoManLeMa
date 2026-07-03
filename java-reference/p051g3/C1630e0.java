package p051g3;

import android.graphics.Rect;
import android.util.Log;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import p012b3.C0274b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g3.e0 */
/* loaded from: classes.dex */
public final class C1630e0 extends AbstractC1644l0 {

    /* renamed from: g */
    public static Field f10377g = null;

    /* renamed from: h */
    public static boolean f10378h = false;

    /* renamed from: i */
    public static Constructor f10379i = null;

    /* renamed from: j */
    public static boolean f10380j = false;

    /* renamed from: e */
    public WindowInsets f10381e;

    /* renamed from: f */
    public C0274b f10382f;

    public C1630e0() {
        this.f10381e = m2640j();
    }

    /* renamed from: j */
    private static WindowInsets m2640j() {
        if (!f10378h) {
            try {
                f10377g = WindowInsets.class.getDeclaredField("CONSUMED");
            } catch (ReflectiveOperationException e7) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e7);
            }
            f10378h = true;
        }
        Field field = f10377g;
        if (field != null) {
            try {
                WindowInsets windowInsets = (WindowInsets) field.get(null);
                if (windowInsets != null) {
                    return new WindowInsets(windowInsets);
                }
            } catch (ReflectiveOperationException e8) {
                Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e8);
            }
        }
        if (!f10380j) {
            try {
                f10379i = WindowInsets.class.getConstructor(Rect.class);
            } catch (ReflectiveOperationException e9) {
                Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e9);
            }
            f10380j = true;
        }
        Constructor constructor = f10379i;
        if (constructor != null) {
            try {
                return (WindowInsets) constructor.newInstance(new Rect());
            } catch (ReflectiveOperationException e10) {
                Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e10);
            }
        }
        return null;
    }

    @Override // p051g3.AbstractC1644l0
    /* renamed from: b */
    public C1672z0 mo2641b() {
        m2652a();
        C1672z0 m2741c = C1672z0.m2741c(null, this.f10381e);
        C0274b[] c0274bArr = this.f10396b;
        C1664v0 c1664v0 = m2741c.f10450a;
        c1664v0.mo2680w(c0274bArr);
        c1664v0.mo2690z(this.f10382f);
        c1664v0.mo2679v(null);
        c1664v0.mo2663B(this.f10397c);
        c1664v0.mo2664C(this.f10398d);
        return m2741c;
    }

    @Override // p051g3.AbstractC1644l0
    /* renamed from: f */
    public void mo2642f(C0274b c0274b) {
        this.f10382f = c0274b;
    }

    @Override // p051g3.AbstractC1644l0
    /* renamed from: h */
    public void mo2643h(C0274b c0274b) {
        WindowInsets windowInsets = this.f10381e;
        if (windowInsets != null) {
            this.f10381e = windowInsets.replaceSystemWindowInsets(c0274b.f1015a, c0274b.f1016b, c0274b.f1017c, c0274b.f1018d);
        }
    }

    public C1630e0(C1672z0 c1672z0) {
        super(c1672z0);
        this.f10381e = c1672z0.m2742b();
    }
}
