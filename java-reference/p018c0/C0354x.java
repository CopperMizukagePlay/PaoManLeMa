package p018c0;

import android.graphics.Rect;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p001a0.C0019e1;
import p001a0.C0043k1;
import p001a0.C0053n;
import p009b0.AbstractC0262d;
import p034e0.C0622o0;
import p050g2.C1602n0;
import p066i3.AbstractC2067b;
import p087l2.C2447k;
import p087l2.C2459w;
import p096m3.C2560j;
import p102n1.AbstractC2710c;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3368k;
import p170w1.InterfaceC3679g2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.x */
/* loaded from: classes.dex */
public final class C0354x {

    /* renamed from: a */
    public final View f1194a;

    /* renamed from: b */
    public final C0349s f1195b;

    /* renamed from: e */
    public C0043k1 f1198e;

    /* renamed from: f */
    public C0622o0 f1199f;

    /* renamed from: g */
    public InterfaceC3679g2 f1200g;

    /* renamed from: l */
    public Rect f1205l;

    /* renamed from: m */
    public final C0351u f1206m;

    /* renamed from: c */
    public AbstractC3368k f1196c = C0329a.f1141h;

    /* renamed from: d */
    public InterfaceC3279c f1197d = C0329a.f1142i;

    /* renamed from: h */
    public C2459w f1201h = new C2459w("", C1602n0.f10302b, 4);

    /* renamed from: i */
    public C2447k f1202i = C2447k.f13698g;

    /* renamed from: j */
    public final ArrayList f1203j = new ArrayList();

    /* renamed from: k */
    public final Object f1204k = AbstractC2710c.m4326I(new C0053n(4, this));

    public C0354x(View view, C0333c c0333c, C0349s c0349s) {
        this.f1194a = view;
        this.f1195b = c0349s;
        this.f1206m = new C0351u(c0333c, c0349s);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x004d  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InputConnectionC0356z m792a(EditorInfo editorInfo) {
        int i7;
        int i8;
        int i9;
        C2459w c2459w = this.f1201h;
        String str = c2459w.f13723a.f10239f;
        long j6 = c2459w.f13724b;
        C2447k c2447k = this.f1202i;
        int i10 = c2447k.f13703e;
        int i11 = c2447k.f13702d;
        boolean z7 = c2447k.f13699a;
        if (i10 == 1) {
            if (!z7) {
                i7 = 0;
                editorInfo.imeOptions = i7;
                C0355y.f1207a.m793a(editorInfo, c2447k.f13704f);
                if (i11 != 1) {
                    if (i11 == 2) {
                        editorInfo.imeOptions |= Integer.MIN_VALUE;
                    } else {
                        if (i11 == 3) {
                            i8 = 2;
                        } else if (i11 == 4) {
                            i8 = 3;
                        } else if (i11 == 5) {
                            i8 = 17;
                        } else if (i11 == 6) {
                            i8 = 33;
                        } else if (i11 == 7) {
                            i8 = 129;
                        } else if (i11 == 8) {
                            i8 = 18;
                        } else if (i11 == 9) {
                            i8 = 8194;
                        } else {
                            throw new IllegalStateException("Invalid Keyboard Type");
                        }
                        editorInfo.inputType = i8;
                        if (!z7 && (i8 & 1) == 1) {
                            editorInfo.inputType = 131072 | i8;
                            if (c2447k.f13703e == 1) {
                                editorInfo.imeOptions |= 1073741824;
                            }
                        }
                        i9 = editorInfo.inputType;
                        if ((i9 & 1) == 1) {
                            int i12 = c2447k.f13700b;
                            if (i12 == 1) {
                                editorInfo.inputType = i9 | 4096;
                            } else if (i12 == 2) {
                                editorInfo.inputType = i9 | 8192;
                            } else if (i12 == 3) {
                                editorInfo.inputType = i9 | 16384;
                            }
                            if (c2447k.f13701c) {
                                editorInfo.inputType |= 32768;
                            }
                        }
                        int i13 = C1602n0.f10303c;
                        editorInfo.initialSelStart = (int) (j6 >> 32);
                        editorInfo.initialSelEnd = (int) (j6 & 4294967295L);
                        AbstractC2067b.m3299x(editorInfo, str);
                        editorInfo.imeOptions |= 33554432;
                        if (!AbstractC0262d.f995a && i11 != 7 && i11 != 8) {
                            AbstractC2067b.m3300y(editorInfo, true);
                            C0343m.f1164a.m728a(editorInfo);
                        } else {
                            AbstractC2067b.m3300y(editorInfo, false);
                        }
                        C0352v c0352v = AbstractC0353w.f1193a;
                        if (C2560j.m4082d()) {
                            C2560j.m4081a().m4087g(editorInfo);
                        }
                        InputConnectionC0356z inputConnectionC0356z = new InputConnectionC0356z(this.f1201h, new C0019e1(this), this.f1202i.f13701c, this.f1198e, this.f1199f, this.f1200g);
                        this.f1203j.add(new WeakReference(inputConnectionC0356z));
                        return inputConnectionC0356z;
                    }
                }
                i8 = 1;
                editorInfo.inputType = i8;
                if (!z7) {
                    editorInfo.inputType = 131072 | i8;
                    if (c2447k.f13703e == 1) {
                    }
                }
                i9 = editorInfo.inputType;
                if ((i9 & 1) == 1) {
                }
                int i132 = C1602n0.f10303c;
                editorInfo.initialSelStart = (int) (j6 >> 32);
                editorInfo.initialSelEnd = (int) (j6 & 4294967295L);
                AbstractC2067b.m3299x(editorInfo, str);
                editorInfo.imeOptions |= 33554432;
                if (!AbstractC0262d.f995a) {
                }
                AbstractC2067b.m3300y(editorInfo, false);
                C0352v c0352v2 = AbstractC0353w.f1193a;
                if (C2560j.m4082d()) {
                }
                InputConnectionC0356z inputConnectionC0356z2 = new InputConnectionC0356z(this.f1201h, new C0019e1(this), this.f1202i.f13701c, this.f1198e, this.f1199f, this.f1200g);
                this.f1203j.add(new WeakReference(inputConnectionC0356z2));
                return inputConnectionC0356z2;
            }
            i7 = 6;
            editorInfo.imeOptions = i7;
            C0355y.f1207a.m793a(editorInfo, c2447k.f13704f);
            if (i11 != 1) {
            }
            i8 = 1;
            editorInfo.inputType = i8;
            if (!z7) {
            }
            i9 = editorInfo.inputType;
            if ((i9 & 1) == 1) {
            }
            int i1322 = C1602n0.f10303c;
            editorInfo.initialSelStart = (int) (j6 >> 32);
            editorInfo.initialSelEnd = (int) (j6 & 4294967295L);
            AbstractC2067b.m3299x(editorInfo, str);
            editorInfo.imeOptions |= 33554432;
            if (!AbstractC0262d.f995a) {
            }
            AbstractC2067b.m3300y(editorInfo, false);
            C0352v c0352v22 = AbstractC0353w.f1193a;
            if (C2560j.m4082d()) {
            }
            InputConnectionC0356z inputConnectionC0356z22 = new InputConnectionC0356z(this.f1201h, new C0019e1(this), this.f1202i.f13701c, this.f1198e, this.f1199f, this.f1200g);
            this.f1203j.add(new WeakReference(inputConnectionC0356z22));
            return inputConnectionC0356z22;
        }
        if (i10 == 0) {
            i7 = 1;
        } else if (i10 == 2) {
            i7 = 2;
        } else if (i10 == 6) {
            i7 = 5;
        } else if (i10 == 5) {
            i7 = 7;
        } else if (i10 == 3) {
            i7 = 3;
        } else if (i10 == 4) {
            i7 = 4;
        } else {
            if (i10 != 7) {
                throw new IllegalStateException("invalid ImeAction");
            }
            i7 = 6;
        }
        editorInfo.imeOptions = i7;
        C0355y.f1207a.m793a(editorInfo, c2447k.f13704f);
        if (i11 != 1) {
        }
        i8 = 1;
        editorInfo.inputType = i8;
        if (!z7) {
        }
        i9 = editorInfo.inputType;
        if ((i9 & 1) == 1) {
        }
        int i13222 = C1602n0.f10303c;
        editorInfo.initialSelStart = (int) (j6 >> 32);
        editorInfo.initialSelEnd = (int) (j6 & 4294967295L);
        AbstractC2067b.m3299x(editorInfo, str);
        editorInfo.imeOptions |= 33554432;
        if (!AbstractC0262d.f995a) {
        }
        AbstractC2067b.m3300y(editorInfo, false);
        C0352v c0352v222 = AbstractC0353w.f1193a;
        if (C2560j.m4082d()) {
        }
        InputConnectionC0356z inputConnectionC0356z222 = new InputConnectionC0356z(this.f1201h, new C0019e1(this), this.f1202i.f13701c, this.f1198e, this.f1199f, this.f1200g);
        this.f1203j.add(new WeakReference(inputConnectionC0356z222));
        return inputConnectionC0356z222;
    }
}
