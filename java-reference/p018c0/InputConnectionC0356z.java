package p018c0;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import android.view.inputmethod.PreviewableHandwritingGesture;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.function.IntConsumer;
import p001a0.C0005b;
import p001a0.C0019e1;
import p001a0.C0043k1;
import p034e0.C0622o0;
import p050g2.C1602n0;
import p060h5.AbstractC1805m;
import p068i5.AbstractC2080d;
import p087l2.C2432a;
import p087l2.C2440e;
import p087l2.C2442f;
import p087l2.C2446j;
import p087l2.C2456t;
import p087l2.C2457u;
import p087l2.C2458v;
import p087l2.C2459w;
import p087l2.InterfaceC2443g;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;
import p159u6.AbstractC3393k;
import p170w1.InterfaceC3679g2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.z */
/* loaded from: classes.dex */
public final class InputConnectionC0356z implements InputConnection {

    /* renamed from: a */
    public final C0019e1 f1208a;

    /* renamed from: b */
    public final boolean f1209b;

    /* renamed from: c */
    public final C0043k1 f1210c;

    /* renamed from: d */
    public final C0622o0 f1211d;

    /* renamed from: e */
    public final InterfaceC3679g2 f1212e;

    /* renamed from: f */
    public int f1213f;

    /* renamed from: g */
    public C2459w f1214g;

    /* renamed from: h */
    public int f1215h;

    /* renamed from: i */
    public boolean f1216i;

    /* renamed from: j */
    public final ArrayList f1217j = new ArrayList();

    /* renamed from: k */
    public boolean f1218k = true;

    public InputConnectionC0356z(C2459w c2459w, C0019e1 c0019e1, boolean z7, C0043k1 c0043k1, C0622o0 c0622o0, InterfaceC3679g2 interfaceC3679g2) {
        this.f1208a = c0019e1;
        this.f1209b = z7;
        this.f1210c = c0043k1;
        this.f1211d = c0622o0;
        this.f1212e = interfaceC3679g2;
        this.f1214g = c2459w;
    }

    /* renamed from: a */
    public final void m794a(InterfaceC2443g interfaceC2443g) {
        this.f1213f++;
        try {
            this.f1217j.add(interfaceC2443g);
        } finally {
            m795b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [t5.c, u5.k] */
    /* renamed from: b */
    public final boolean m795b() {
        int i7 = this.f1213f - 1;
        this.f1213f = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f1217j;
            if (!arrayList.isEmpty()) {
                ((C0354x) this.f1208a.f109e).f1196c.mo23f(AbstractC1805m.m3036D0(arrayList));
                arrayList.clear();
            }
        }
        if (this.f1213f > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z7 = this.f1218k;
        if (z7) {
            this.f1213f++;
            return true;
        }
        return z7;
    }

    /* renamed from: c */
    public final void m796c(int i7) {
        sendKeyEvent(new KeyEvent(0, i7));
        sendKeyEvent(new KeyEvent(1, i7));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        boolean z7 = this.f1218k;
        if (z7) {
            return false;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f1217j.clear();
        this.f1213f = 0;
        this.f1218k = false;
        ArrayList arrayList = ((C0354x) this.f1208a.f109e).f1203j;
        int size = arrayList.size();
        for (int i7 = 0; i7 < size; i7++) {
            if (AbstractC3367j.m5096a(((WeakReference) arrayList.get(i7)).get(), this)) {
                arrayList.remove(i7);
                return;
            }
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z7 = this.f1218k;
        if (z7) {
            return false;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        boolean z7 = this.f1218k;
        if (z7) {
            return false;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z7 = this.f1218k;
        if (z7) {
            return this.f1209b;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        boolean z7 = this.f1218k;
        if (z7) {
            m794a(new C2432a(String.valueOf(charSequence), i7));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        boolean z7 = this.f1218k;
        if (z7) {
            m794a(new C2440e(i7, i8));
            return true;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        boolean z7 = this.f1218k;
        if (z7) {
            m794a(new C2442f(i7, i8));
            return true;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m795b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l2.g] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z7 = this.f1218k;
        if (z7) {
            m794a(new Object());
            return true;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        C2459w c2459w = this.f1214g;
        return TextUtils.getCapsMode(c2459w.f13723a.f10239f, C1602n0.m2589e(c2459w.f13724b), i7);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z7 = true;
        int i8 = 0;
        if ((i7 & 1) == 0) {
            z7 = false;
        }
        this.f1216i = z7;
        if (z7) {
            if (extractedTextRequest != null) {
                i8 = extractedTextRequest.token;
            }
            this.f1215h = i8;
        }
        return AbstractC3393k.m5134e(this.f1214g);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        if (C1602n0.m2586b(this.f1214g.f13724b)) {
            return null;
        }
        return AbstractC2080d.m3403p(this.f1214g).f10239f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i8) {
        return AbstractC2080d.m3406s(this.f1214g, i7).f10239f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i8) {
        return AbstractC2080d.m3407t(this.f1214g, i7).f10239f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        boolean z7 = this.f1218k;
        if (z7) {
            z7 = false;
            switch (i7) {
                case R.id.selectAll:
                    m794a(new C2458v(0, this.f1214g.f13723a.f10239f.length()));
                    break;
                case R.id.cut:
                    m796c(277);
                    return false;
                case R.id.copy:
                    m796c(278);
                    return false;
                case R.id.paste:
                    m796c(279);
                    return false;
                default:
                    return false;
            }
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i7) {
        int i8;
        boolean z7 = this.f1218k;
        if (z7) {
            z7 = true;
            if (i7 != 0) {
                switch (i7) {
                    case 2:
                        i8 = 2;
                        break;
                    case 3:
                        i8 = 3;
                        break;
                    case 4:
                        i8 = 4;
                        break;
                    case AbstractC3122c.f15761f /* 5 */:
                        i8 = 6;
                        break;
                    case AbstractC3122c.f15759d /* 6 */:
                        i8 = 7;
                        break;
                    case 7:
                        i8 = 5;
                        break;
                    default:
                        Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i7);
                        break;
                }
                ((C0354x) this.f1208a.f109e).f1197d.mo23f(new C2446j(i8));
            }
            i8 = 1;
            ((C0354x) this.f1208a.f109e).f1197d.mo23f(new C2446j(i8));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void performHandwritingGesture(HandwritingGesture handwritingGesture, Executor executor, IntConsumer intConsumer) {
        if (Build.VERSION.SDK_INT >= 34) {
            C0336f.f1157a.m693a(this.f1210c, this.f1211d, handwritingGesture, this.f1212e, executor, intConsumer, new C0005b(6, this));
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z7 = this.f1218k;
        if (z7) {
            return true;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean previewHandwritingGesture(PreviewableHandwritingGesture previewableHandwritingGesture, CancellationSignal cancellationSignal) {
        if (Build.VERSION.SDK_INT >= 34) {
            return C0336f.f1157a.m694b(this.f1210c, this.f1211d, previewableHandwritingGesture, cancellationSignal);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z7) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // android.view.inputmethod.InputConnection
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean requestCursorUpdates(int i7) {
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        C0351u c0351u;
        boolean z12;
        boolean z13 = this.f1218k;
        if (z13) {
            boolean z14 = false;
            if ((i7 & 1) != 0) {
                z7 = true;
            } else {
                z7 = false;
            }
            if ((i7 & 2) != 0) {
                z8 = true;
            } else {
                z8 = false;
            }
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 33) {
                if ((i7 & 16) != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((i7 & 8) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((i7 & 4) != 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (i8 >= 34 && (i7 & 32) != 0) {
                    z14 = true;
                }
                if (!z10 && !z11 && !z12 && !z14) {
                    if (i8 >= 34) {
                        z9 = true;
                        z14 = true;
                    } else {
                        z9 = z14;
                        z14 = true;
                    }
                    z10 = z14;
                } else {
                    z9 = z14;
                    z14 = z12;
                    c0351u = ((C0354x) this.f1208a.f109e).f1206m;
                    synchronized (c0351u.f1177c) {
                        try {
                            c0351u.f1180f = z10;
                            c0351u.f1181g = z11;
                            c0351u.f1182h = z14;
                            c0351u.f1183i = z9;
                            if (z7) {
                                c0351u.f1179e = true;
                                if (c0351u.f1184j != null) {
                                    c0351u.m791a();
                                }
                            }
                            c0351u.f1178d = z8;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    return true;
                }
            } else {
                z9 = false;
                z10 = true;
            }
            z11 = z10;
            c0351u = ((C0354x) this.f1208a.f109e).f1206m;
            synchronized (c0351u.f1177c) {
            }
        } else {
            return z13;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, g5.d] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z7 = this.f1218k;
        if (z7) {
            ((BaseInputConnection) ((C0354x) this.f1208a.f109e).f1204k.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i8) {
        boolean z7 = this.f1218k;
        if (z7) {
            m794a(new C2456t(i7, i8));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        boolean z7 = this.f1218k;
        if (z7) {
            m794a(new C2457u(String.valueOf(charSequence), i7));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        boolean z7 = this.f1218k;
        if (z7) {
            m794a(new C2458v(i7, i8));
            return true;
        }
        return z7;
    }
}
