package p087l2;

import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p001a0.C0019e1;
import p050g2.C1602n0;
import p060h5.AbstractC1805m;
import p066i3.AbstractC2067b;
import p068i5.AbstractC2080d;
import p144t.AbstractC3122c;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: l2.s */
/* loaded from: classes.dex */
public final class InputConnectionC2455s implements InputConnection {

    /* renamed from: a */
    public final C0019e1 f13709a;

    /* renamed from: b */
    public final boolean f13710b;

    /* renamed from: c */
    public int f13711c;

    /* renamed from: d */
    public C2459w f13712d;

    /* renamed from: e */
    public int f13713e;

    /* renamed from: f */
    public boolean f13714f;

    /* renamed from: g */
    public final ArrayList f13715g = new ArrayList();

    /* renamed from: h */
    public boolean f13716h = true;

    public InputConnectionC2455s(C2459w c2459w, C0019e1 c0019e1, boolean z7) {
        this.f13709a = c0019e1;
        this.f13710b = z7;
        this.f13712d = c2459w;
    }

    /* renamed from: a */
    public final void m4023a(InterfaceC2443g interfaceC2443g) {
        this.f13711c++;
        try {
            this.f13715g.add(interfaceC2443g);
        } finally {
            m4024b();
        }
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [t5.c, u5.k] */
    /* renamed from: b */
    public final boolean m4024b() {
        int i7 = this.f13711c - 1;
        this.f13711c = i7;
        if (i7 == 0) {
            ArrayList arrayList = this.f13715g;
            if (!arrayList.isEmpty()) {
                ((C2462z) this.f13709a.f109e).f13737e.mo23f(AbstractC1805m.m3036D0(arrayList));
                arrayList.clear();
            }
        }
        if (this.f13711c > 0) {
            return true;
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        boolean z7 = this.f13716h;
        if (z7) {
            this.f13711c++;
            return true;
        }
        return z7;
    }

    /* renamed from: c */
    public final void m4025c(int i7) {
        sendKeyEvent(new KeyEvent(0, i7));
        sendKeyEvent(new KeyEvent(1, i7));
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i7) {
        boolean z7 = this.f13716h;
        if (z7) {
            return false;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        this.f13715g.clear();
        this.f13711c = 0;
        this.f13716h = false;
        ArrayList arrayList = ((C2462z) this.f13709a.f109e).f13741i;
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
        boolean z7 = this.f13716h;
        if (z7) {
            return false;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitContent(InputContentInfo inputContentInfo, int i7, Bundle bundle) {
        boolean z7 = this.f13716h;
        if (z7) {
            return false;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z7 = this.f13716h;
        if (z7) {
            return this.f13710b;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i7) {
        boolean z7 = this.f13716h;
        if (z7) {
            m4023a(new C2432a(String.valueOf(charSequence), i7));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i7, int i8) {
        boolean z7 = this.f13716h;
        if (z7) {
            m4023a(new C2440e(i7, i8));
            return true;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i7, int i8) {
        boolean z7 = this.f13716h;
        if (z7) {
            m4023a(new C2442f(i7, i8));
            return true;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        return m4024b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, l2.g] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        boolean z7 = this.f13716h;
        if (z7) {
            m4023a(new Object());
            return true;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i7) {
        C2459w c2459w = this.f13712d;
        return TextUtils.getCapsMode(c2459w.f13723a.f10239f, C1602n0.m2589e(c2459w.f13724b), i7);
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i7) {
        boolean z7 = true;
        int i8 = 0;
        if ((i7 & 1) == 0) {
            z7 = false;
        }
        this.f13714f = z7;
        if (z7) {
            if (extractedTextRequest != null) {
                i8 = extractedTextRequest.token;
            }
            this.f13713e = i8;
        }
        return AbstractC2067b.m3274B(this.f13712d);
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i7) {
        if (C1602n0.m2586b(this.f13712d.f13724b)) {
            return null;
        }
        return AbstractC2080d.m3403p(this.f13712d).f10239f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i7, int i8) {
        return AbstractC2080d.m3406s(this.f13712d, i7).f10239f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i7, int i8) {
        return AbstractC2080d.m3407t(this.f13712d, i7).f10239f;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i7) {
        boolean z7 = this.f13716h;
        if (z7) {
            z7 = false;
            switch (i7) {
                case R.id.selectAll:
                    m4023a(new C2458v(0, this.f13712d.f13723a.f10239f.length()));
                    break;
                case R.id.cut:
                    m4025c(277);
                    return false;
                case R.id.copy:
                    m4025c(278);
                    return false;
                case R.id.paste:
                    m4025c(279);
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
        boolean z7 = this.f13716h;
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
                ((C2462z) this.f13709a.f109e).f13738f.mo23f(new C2446j(i8));
            }
            i8 = 1;
            ((C2462z) this.f13709a.f109e).f13738f.mo23f(new C2446j(i8));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z7 = this.f13716h;
        if (z7) {
            return true;
        }
        return z7;
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
        C2436c c2436c;
        boolean z12;
        boolean z13 = this.f13716h;
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
                    c2436c = ((C2462z) this.f13709a.f109e).f13744l;
                    synchronized (c2436c.f13667c) {
                        try {
                            c2436c.f13670f = z10;
                            c2436c.f13671g = z11;
                            c2436c.f13672h = z14;
                            c2436c.f13673i = z9;
                            if (z7) {
                                c2436c.f13669e = true;
                                if (c2436c.f13674j != null) {
                                    c2436c.m4010a();
                                }
                            }
                            c2436c.f13668d = z8;
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
            c2436c = ((C2462z) this.f13709a.f109e).f13744l;
            synchronized (c2436c.f13667c) {
            }
        } else {
            return z13;
        }
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, g5.d] */
    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z7 = this.f13716h;
        if (z7) {
            ((BaseInputConnection) ((C2462z) this.f13709a.f109e).f13742j.getValue()).sendKeyEvent(keyEvent);
            return true;
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i7, int i8) {
        boolean z7 = this.f13716h;
        if (z7) {
            m4023a(new C2456t(i7, i8));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i7) {
        boolean z7 = this.f13716h;
        if (z7) {
            m4023a(new C2457u(String.valueOf(charSequence), i7));
        }
        return z7;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i7, int i8) {
        boolean z7 = this.f13716h;
        if (z7) {
            m4023a(new C2458v(i7, i8));
            return true;
        }
        return z7;
    }
}
