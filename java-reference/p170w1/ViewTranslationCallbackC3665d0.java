package p170w1;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import p028d2.AbstractC0476i;
import p028d2.AbstractC0487t;
import p028d2.C0468a;
import p028d2.C0483p;
import p077k.AbstractC2201l;
import p077k.C2194h0;
import p150t5.InterfaceC3277a;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p191z0.EnumC3862a;
import p191z0.ViewOnAttachStateChangeListenerC3864c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.d0 */
/* loaded from: classes.dex */
public final class ViewTranslationCallbackC3665d0 implements ViewTranslationCallback {

    /* renamed from: a */
    public static final ViewTranslationCallbackC3665d0 f17501a = new Object();

    public final boolean onClearTranslation(View view) {
        InterfaceC3277a interfaceC3277a;
        AbstractC3367j.m5098c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC3864c contentCaptureManager$ui_release = ((C3728t) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f18109j = EnumC3862a.f18097e;
        AbstractC2201l m5876g = contentCaptureManager$ui_release.m5876g();
        Object[] objArr = m5876g.f12707c;
        long[] jArr = m5876g.f12705a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128) {
                            C2194h0 c2194h0 = ((C0483p) objArr[(i7 << 3) + i9]).f1698a.f1694d.f1683e;
                            Object m3592g = c2194h0.m3592g(AbstractC0487t.f1727C);
                            Object obj = null;
                            if (m3592g == null) {
                                m3592g = null;
                            }
                            if (m3592g != null) {
                                Object m3592g2 = c2194h0.m3592g(AbstractC0476i.f1669m);
                                if (m3592g2 != null) {
                                    obj = m3592g2;
                                }
                                C0468a c0468a = (C0468a) obj;
                                if (c0468a != null && (interfaceC3277a = (InterfaceC3277a) c0468a.f1639b) != null) {
                                }
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        return true;
                    }
                }
                if (i7 != length) {
                    i7++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onHideTranslation(View view) {
        InterfaceC3279c interfaceC3279c;
        AbstractC3367j.m5098c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC3864c contentCaptureManager$ui_release = ((C3728t) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f18109j = EnumC3862a.f18097e;
        AbstractC2201l m5876g = contentCaptureManager$ui_release.m5876g();
        Object[] objArr = m5876g.f12707c;
        long[] jArr = m5876g.f12705a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128) {
                            C2194h0 c2194h0 = ((C0483p) objArr[(i7 << 3) + i9]).f1698a.f1694d.f1683e;
                            Object m3592g = c2194h0.m3592g(AbstractC0487t.f1727C);
                            Object obj = null;
                            if (m3592g == null) {
                                m3592g = null;
                            }
                            if (AbstractC3367j.m5096a(m3592g, Boolean.TRUE)) {
                                Object m3592g2 = c2194h0.m3592g(AbstractC0476i.f1668l);
                                if (m3592g2 != null) {
                                    obj = m3592g2;
                                }
                                C0468a c0468a = (C0468a) obj;
                                if (c0468a != null && (interfaceC3279c = (InterfaceC3279c) c0468a.f1639b) != null) {
                                }
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        return true;
                    }
                }
                if (i7 != length) {
                    i7++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }

    public final boolean onShowTranslation(View view) {
        InterfaceC3279c interfaceC3279c;
        AbstractC3367j.m5098c(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ViewOnAttachStateChangeListenerC3864c contentCaptureManager$ui_release = ((C3728t) view).getContentCaptureManager$ui_release();
        contentCaptureManager$ui_release.getClass();
        contentCaptureManager$ui_release.f18109j = EnumC3862a.f18098f;
        AbstractC2201l m5876g = contentCaptureManager$ui_release.m5876g();
        Object[] objArr = m5876g.f12707c;
        long[] jArr = m5876g.f12705a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j6 = jArr[i7];
                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    for (int i9 = 0; i9 < i8; i9++) {
                        if ((255 & j6) < 128) {
                            C2194h0 c2194h0 = ((C0483p) objArr[(i7 << 3) + i9]).f1698a.f1694d.f1683e;
                            Object m3592g = c2194h0.m3592g(AbstractC0487t.f1727C);
                            Object obj = null;
                            if (m3592g == null) {
                                m3592g = null;
                            }
                            if (AbstractC3367j.m5096a(m3592g, Boolean.FALSE)) {
                                Object m3592g2 = c2194h0.m3592g(AbstractC0476i.f1668l);
                                if (m3592g2 != null) {
                                    obj = m3592g2;
                                }
                                C0468a c0468a = (C0468a) obj;
                                if (c0468a != null && (interfaceC3279c = (InterfaceC3279c) c0468a.f1639b) != null) {
                                }
                            }
                        }
                        j6 >>= 8;
                    }
                    if (i8 != 8) {
                        return true;
                    }
                }
                if (i7 != length) {
                    i7++;
                } else {
                    return true;
                }
            }
        } else {
            return true;
        }
    }
}
