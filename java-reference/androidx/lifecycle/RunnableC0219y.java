package androidx.lifecycle;

import android.content.Context;
import android.graphics.Typeface;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.Trace;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.journeyapps.barcodescanner.BarcodeView;
import com.paoman.lema.BriefVpnReplaceService;
import com.paoman.lema.MainActivity;
import java.io.FileInputStream;
import java.nio.MappedByteBuffer;
import p001a0.C0019e1;
import p001a0.C0031h1;
import p001a0.C0053n;
import p006a7.C0129l;
import p008b.AbstractActivityC0245m;
import p008b.ViewTreeObserverOnDrawListenerC0237i;
import p012b3.AbstractC0276d;
import p023c5.AbstractC0415g;
import p029d3.AbstractC0498e;
import p031d5.C0501a;
import p031d5.C0502b;
import p037e3.C0692f;
import p039e5.C1100ms;
import p053g5.C1694m;
import p056h0.C1740n;
import p060h5.AbstractC1793a0;
import p065i2.AbstractC2064e;
import p067i4.AbstractC2072e;
import p077k.C2221w;
import p087l2.C2462z;
import p087l2.EnumC2461y;
import p096m3.C2569s;
import p096m3.C2572v;
import p101n0.C2705e;
import p102n1.AbstractC2710c;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p170w1.C3653a0;
import p170w1.C3728t;
import p171w2.DialogC3769s;
import p191z0.C3865d;
import p191z0.EnumC3866e;
import p191z0.ViewOnAttachStateChangeListenerC3864c;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: androidx.lifecycle.y */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0219y implements Runnable {

    /* renamed from: e */
    public final /* synthetic */ int f890e;

    /* renamed from: f */
    public final /* synthetic */ Object f891f;

    public /* synthetic */ RunnableC0219y(int i7, Object obj) {
        this.f890e = i7;
        this.f891f = obj;
    }

    /* JADX WARN: Type inference failed for: r0v42, types: [java.lang.Object, g5.d] */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, g5.d] */
    @Override // java.lang.Runnable
    public final void run() {
        boolean z7;
        View findFocus;
        C3728t c3728t;
        C3728t c3728t2;
        Boolean bool = null;
        switch (this.f890e) {
            case 0:
                C0178b0 c0178b0 = (C0178b0) this.f891f;
                C0216v c0216v = c0178b0.f828j;
                if (c0178b0.f824f == 0) {
                    c0178b0.f825g = true;
                    c0216v.m471d(EnumC0201n.ON_PAUSE);
                }
                if (c0178b0.f823e == 0 && c0178b0.f825g) {
                    c0216v.m471d(EnumC0201n.ON_STOP);
                    c0178b0.f826h = true;
                    return;
                }
                return;
            case 1:
                AbstractActivityC0245m.m519d((MainActivity) this.f891f);
                return;
            case 2:
                ViewTreeObserverOnDrawListenerC0237i viewTreeObserverOnDrawListenerC0237i = (ViewTreeObserverOnDrawListenerC0237i) this.f891f;
                Runnable runnable = viewTreeObserverOnDrawListenerC0237i.f923f;
                if (runnable != null) {
                    runnable.run();
                    viewTreeObserverOnDrawListenerC0237i.f923f = null;
                    return;
                }
                return;
            case 3:
                DialogC3769s.m5765d((DialogC3769s) this.f891f);
                return;
            case 4:
                AbstractC0415g.m895a((BarcodeView) ((C0019e1) this.f891f).f109e);
                return;
            case AbstractC3122c.f15761f /* 5 */:
                C0502b c0502b = ((C0501a) this.f891f).f1786a;
                c0502b.f1789b = false;
                c0502b.m1084a();
                return;
            case AbstractC3122c.f15759d /* 6 */:
                BriefVpnReplaceService briefVpnReplaceService = (BriefVpnReplaceService) this.f891f;
                int i7 = BriefVpnReplaceService.f1536h;
                briefVpnReplaceService.m981a(true);
                return;
            case 7:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) this.f891f;
                int i8 = BriefVpnReplaceService.f1536h;
                byte[] bArr = new byte[32767];
                try {
                    FileInputStream fileInputStream = new FileInputStream(parcelFileDescriptor.getFileDescriptor());
                    do {
                        try {
                            if (!Thread.currentThread().isInterrupted()) {
                            }
                            fileInputStream.close();
                            return;
                        } finally {
                        }
                    } while (fileInputStream.read(bArr) >= 0);
                    fileInputStream.close();
                    return;
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                    return;
                } catch (Exception unused2) {
                    return;
                }
            case 8:
                Runnable runnable2 = (Runnable) this.f891f;
                try {
                    Process.setThreadPriority(C1100ms.f6005v1);
                } catch (Throwable th) {
                    AbstractC1793a0.m2985m(th);
                }
                runnable2.run();
                return;
            case AbstractC3122c.f15758c /* 9 */:
                View view = (View) this.f891f;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case AbstractC3122c.f15760e /* 10 */:
                C1740n.m2792a((C1740n) this.f891f);
                return;
            case 11:
                C2462z c2462z = (C2462z) this.f891f;
                C0031h1 c0031h1 = c2462z.f13734b;
                c2462z.f13746n = null;
                C2705e c2705e = c2462z.f13745m;
                View view2 = c2462z.f13733a;
                if (!view2.isFocused() && (findFocus = view2.getRootView().findFocus()) != null && findFocus.onCheckIsTextEditor()) {
                    c2705e.m4305g();
                    return;
                }
                Object[] objArr = c2705e.f14517e;
                int i9 = c2705e.f14519g;
                Boolean bool2 = null;
                for (int i10 = 0; i10 < i9; i10++) {
                    EnumC2461y enumC2461y = (EnumC2461y) objArr[i10];
                    int ordinal = enumC2461y.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2 && ordinal != 3) {
                                throw new RuntimeException();
                            }
                            if (!AbstractC3367j.m5096a(bool, Boolean.FALSE)) {
                                if (enumC2461y == EnumC2461y.f13730g) {
                                    z7 = true;
                                } else {
                                    z7 = false;
                                }
                                bool2 = Boolean.valueOf(z7);
                            }
                        } else {
                            bool = Boolean.FALSE;
                        }
                    } else {
                        bool = Boolean.TRUE;
                    }
                    bool2 = bool;
                }
                c2705e.m4305g();
                if (AbstractC3367j.m5096a(bool, Boolean.TRUE)) {
                    ((InputMethodManager) c0031h1.f153g.getValue()).restartInput((View) c0031h1.f152f);
                }
                if (bool2 != null) {
                    if (bool2.booleanValue()) {
                        ((C0019e1) ((C0019e1) c0031h1.f154h).f109e).mo49u();
                    } else {
                        ((C0019e1) ((C0019e1) c0031h1.f154h).f109e).mo43o();
                    }
                }
                if (AbstractC3367j.m5096a(bool, Boolean.FALSE)) {
                    ((InputMethodManager) c0031h1.f153g.getValue()).restartInput((View) c0031h1.f152f);
                    return;
                }
                return;
            case 12:
                C2569s c2569s = (C2569s) this.f891f;
                synchronized (c2569s.f13955h) {
                    try {
                        if (c2569s.f13959l != null) {
                            try {
                                C0692f m4092c = c2569s.m4092c();
                                int i11 = m4092c.f2251f;
                                if (i11 == 2) {
                                    synchronized (c2569s.f13955h) {
                                    }
                                }
                                if (i11 == 0) {
                                    try {
                                        int i12 = AbstractC0498e.f1779a;
                                        Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                        C0129l c0129l = c2569s.f13954g;
                                        Context context = c2569s.f13952e;
                                        c0129l.getClass();
                                        C0692f[] c0692fArr = {m4092c};
                                        AbstractC2710c abstractC2710c = AbstractC0276d.f1019a;
                                        AbstractC3393k.m5137h("TypefaceCompat.createFromFontInfo");
                                        try {
                                            Typeface mo612f = AbstractC0276d.f1019a.mo612f(context, c0692fArr);
                                            Trace.endSection();
                                            MappedByteBuffer m2965E = AbstractC1793a0.m2965E(c2569s.f13952e, m4092c.f2246a);
                                            if (m2965E != null && mo612f != null) {
                                                try {
                                                    Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                                    C2572v c2572v = new C2572v(mo612f, AbstractC2072e.m3340r(m2965E));
                                                    Trace.endSection();
                                                    synchronized (c2569s.f13955h) {
                                                        try {
                                                            AbstractC2064e abstractC2064e = c2569s.f13959l;
                                                            if (abstractC2064e != null) {
                                                                abstractC2064e.mo3254B(c2572v);
                                                            }
                                                        } finally {
                                                        }
                                                    }
                                                    c2569s.m4091a();
                                                    return;
                                                } finally {
                                                    int i13 = AbstractC0498e.f1779a;
                                                }
                                            }
                                            throw new RuntimeException("Unable to open file.");
                                        } finally {
                                        }
                                    } finally {
                                    }
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i11 + ")");
                            } catch (Throwable th2) {
                                synchronized (c2569s.f13955h) {
                                    try {
                                        AbstractC2064e abstractC2064e2 = c2569s.f13959l;
                                        if (abstractC2064e2 != null) {
                                            abstractC2064e2.mo3253A(th2);
                                        }
                                        c2569s.m4091a();
                                        return;
                                    } finally {
                                    }
                                }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            case 13:
                C3728t c3728t3 = (C3728t) this.f891f;
                c3728t3.f17710E0 = false;
                MotionEvent motionEvent = c3728t3.f17776w0;
                AbstractC3367j.m5097b(motionEvent);
                if (motionEvent.getActionMasked() == 10) {
                    c3728t3.m5734I(motionEvent);
                    return;
                }
                throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
            case 14:
                C0053n c0053n = (C0053n) this.f891f;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                try {
                    c0053n.mo52a();
                    return;
                } finally {
                }
            case AbstractC3122c.f15762g /* 15 */:
                C3653a0 c3653a0 = (C3653a0) this.f891f;
                Trace.beginSection("measureAndLayout");
                try {
                    c3653a0.f17454d.m5747v(true);
                    Trace.endSection();
                    Trace.beginSection("checkForSemanticsChanges");
                    try {
                        c3653a0.m5641g();
                        Trace.endSection();
                        c3653a0.f17449L = false;
                        return;
                    } finally {
                    }
                } finally {
                }
            default:
                ViewOnAttachStateChangeListenerC3864c viewOnAttachStateChangeListenerC3864c = (ViewOnAttachStateChangeListenerC3864c) this.f891f;
                boolean m5877h = viewOnAttachStateChangeListenerC3864c.m5877h();
                C3728t c3728t4 = viewOnAttachStateChangeListenerC3864c.f18104e;
                if (m5877h) {
                    Trace.beginSection("ContentCapture:changeChecker");
                    try {
                        c3728t4.m5747v(true);
                        C2221w c2221w = viewOnAttachStateChangeListenerC3864c.f18115p;
                        int[] iArr = c2221w.f12706b;
                        long[] jArr = c2221w.f12705a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i14 = 0;
                            while (true) {
                                long j6 = jArr[i14];
                                if ((((~j6) << 7) & j6 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i15 = 8 - ((~(i14 - length)) >>> 31);
                                    int i16 = 0;
                                    while (i16 < i15) {
                                        if ((255 & j6) < 128) {
                                            int i17 = iArr[(i14 << 3) + i16];
                                            if (!viewOnAttachStateChangeListenerC3864c.m5876g().m3611a(i17)) {
                                                c3728t2 = c3728t4;
                                                viewOnAttachStateChangeListenerC3864c.f18107h.add(new C3865d(i17, viewOnAttachStateChangeListenerC3864c.f18114o, EnumC3866e.f18124f, null));
                                                viewOnAttachStateChangeListenerC3864c.f18111l.mo2505v(C1694m.f10482a);
                                                j6 >>= 8;
                                                i16++;
                                                c3728t4 = c3728t2;
                                            }
                                        }
                                        c3728t2 = c3728t4;
                                        j6 >>= 8;
                                        i16++;
                                        c3728t4 = c3728t2;
                                    }
                                    c3728t = c3728t4;
                                    if (i15 == 8) {
                                    }
                                } else {
                                    c3728t = c3728t4;
                                }
                                if (i14 != length) {
                                    i14++;
                                    c3728t4 = c3728t;
                                }
                            }
                        } else {
                            c3728t = c3728t4;
                        }
                        Trace.beginSection("ContentCapture:sendAppearEvents");
                        viewOnAttachStateChangeListenerC3864c.m5879j(c3728t.getSemanticsOwner().m1055a(), viewOnAttachStateChangeListenerC3864c.f18116q);
                        Trace.endSection();
                        viewOnAttachStateChangeListenerC3864c.m5875e(viewOnAttachStateChangeListenerC3864c.m5876g());
                        viewOnAttachStateChangeListenerC3864c.m5883n();
                        viewOnAttachStateChangeListenerC3864c.f18117r = false;
                        return;
                    } catch (Throwable th3) {
                        throw th3;
                    } finally {
                    }
                }
                return;
        }
    }
}
