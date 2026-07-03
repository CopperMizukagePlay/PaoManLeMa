package p039e5;

import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import p001a0.C0019e1;
import p051g3.C1620a1;
import p060h5.AbstractC1793a0;
import p085l0.C2364h0;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p171w2.C3766p;
import p171w2.InterfaceC3768r;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: e5.sg */
/* loaded from: classes.dex */
public final /* synthetic */ class C1274sg implements InterfaceC3279c {

    /* renamed from: e */
    public final /* synthetic */ int f7587e;

    /* renamed from: f */
    public final /* synthetic */ View f7588f;

    public /* synthetic */ C1274sg(View view, int i7) {
        this.f7587e = i7;
        this.f7588f = view;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [a0.e1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v2, types: [a0.e1, java.lang.Object] */
    @Override // p150t5.InterfaceC3279c
    /* renamed from: f */
    public final Object mo23f(Object obj) {
        InterfaceC3768r interfaceC3768r;
        Window window;
        Float f7;
        WindowManager.LayoutParams attributes;
        InterfaceC3768r interfaceC3768r2;
        C2364h0 c2364h0 = (C2364h0) obj;
        switch (this.f7587e) {
            case 0:
                AbstractC3367j.m5100e(c2364h0, "$this$DisposableEffect");
                View view = this.f7588f;
                ViewParent parent = view.getParent();
                ?? r22 = 0;
                if (parent instanceof InterfaceC3768r) {
                    interfaceC3768r = (InterfaceC3768r) parent;
                } else {
                    interfaceC3768r = null;
                }
                if (interfaceC3768r != null) {
                    window = ((C3766p) interfaceC3768r).f17860m;
                } else {
                    window = null;
                }
                if (window != null && (attributes = window.getAttributes()) != null) {
                    f7 = Float.valueOf(attributes.screenBrightness);
                } else {
                    f7 = null;
                }
                if (window != null) {
                    window.setLayout(-1, -1);
                }
                if (window != null) {
                    r22 = new Object();
                    C0019e1 c0019e1 = new C0019e1(view);
                    int i7 = Build.VERSION.SDK_INT;
                    if (i7 >= 35) {
                        r22.f109e = new C1620a1(window, c0019e1, 1);
                    } else if (i7 >= 30) {
                        r22.f109e = new C1620a1(window, c0019e1, 1);
                    } else if (i7 >= 26) {
                        r22.f109e = new C1620a1(window, c0019e1, 0);
                    } else {
                        r22.f109e = new C1620a1(window, c0019e1, 0);
                    }
                }
                if (window != null) {
                    AbstractC1793a0.m2969I(window, false);
                    if (r22 != 0) {
                        ((AbstractC3784a) r22.f109e).mo2630v();
                    }
                    if (r22 != 0) {
                        ((AbstractC3784a) r22.f109e).mo2626H();
                    }
                }
                return new C1460yg(window, r22, f7, 0);
            default:
                AbstractC3367j.m5100e(c2364h0, "$this$DisposableEffect");
                ViewParent parent2 = this.f7588f.getParent();
                Window window2 = null;
                if (parent2 instanceof InterfaceC3768r) {
                    interfaceC3768r2 = (InterfaceC3768r) parent2;
                } else {
                    interfaceC3768r2 = null;
                }
                if (interfaceC3768r2 != null) {
                    window2 = ((C3766p) interfaceC3768r2).f17860m;
                }
                if (window2 != null) {
                    window2.setLayout(-1, -1);
                }
                return new C0871fh(0);
        }
    }
}
