package p184y1;

import android.os.Build;
import android.view.Menu;
import com.paoman.lema.R;
import p001a0.C0022f0;
import p027d1.C0465c;
import p150t5.InterfaceC3277a;
import p170w1.C3701m0;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: y1.c */
/* loaded from: classes.dex */
public final class C3847c {

    /* renamed from: a */
    public final C3701m0 f18069a;

    /* renamed from: b */
    public C0465c f18070b = C0465c.f1624e;

    /* renamed from: c */
    public C0022f0 f18071c = null;

    /* renamed from: d */
    public C0022f0 f18072d = null;

    /* renamed from: e */
    public C0022f0 f18073e = null;

    /* renamed from: f */
    public C0022f0 f18074f = null;

    public C3847c(C3701m0 c3701m0) {
        this.f18069a = c3701m0;
    }

    /* renamed from: a */
    public static void m5865a(Menu menu, EnumC3846b enumC3846b) {
        int i7;
        int i8 = enumC3846b.f18067e;
        int i9 = enumC3846b.f18068f;
        int ordinal = enumC3846b.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            if (Build.VERSION.SDK_INT <= 26) {
                                i7 = R.string.autofill;
                            } else {
                                i7 = android.R.string.autofill;
                            }
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        i7 = android.R.string.selectAll;
                    }
                } else {
                    i7 = android.R.string.cut;
                }
            } else {
                i7 = android.R.string.paste;
            }
        } else {
            i7 = android.R.string.copy;
        }
        menu.add(0, i8, i9, i7).setShowAsAction(1);
    }

    /* renamed from: b */
    public static void m5866b(Menu menu, EnumC3846b enumC3846b, InterfaceC3277a interfaceC3277a) {
        int i7 = enumC3846b.f18067e;
        if (interfaceC3277a != null && menu.findItem(i7) == null) {
            m5865a(menu, enumC3846b);
        } else if (interfaceC3277a == null && menu.findItem(i7) != null) {
            menu.removeItem(i7);
        }
    }
}
