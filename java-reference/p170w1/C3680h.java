package p170w1;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.os.Parcel;
import android.text.Annotation;
import android.text.SpannableString;
import android.util.Base64;
import java.util.List;
import p035e1.C0665l0;
import p035e1.C0677s;
import p050g2.C1583e;
import p050g2.C1587g;
import p050g2.C1588g0;
import p060h5.C1813u;
import p080k2.C2298i;
import p080k2.C2299j;
import p080k2.C2300k;
import p132r2.C3027a;
import p132r2.C3038l;
import p132r2.C3042p;
import p132r2.InterfaceC3041o;
import p140s2.C3105o;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.h */
/* loaded from: classes.dex */
public final class C3680h implements InterfaceC3658b1 {

    /* renamed from: a */
    public final ClipboardManager f17534a;

    public C3680h(Context context) {
        Object systemService = context.getSystemService("clipboard");
        AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
        this.f17534a = (ClipboardManager) systemService;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, w1.g1] */
    /* renamed from: a */
    public final void m5679a(C1587g c1587g) {
        List list;
        int i7;
        byte b8;
        List list2 = c1587g.f10240g;
        List list3 = C1813u.f10860e;
        if (list2 == null) {
            list = list3;
        } else {
            list = list2;
        }
        String str = c1587g.f10239f;
        if (!list.isEmpty()) {
            SpannableString spannableString = new SpannableString(str);
            ?? obj = new Object();
            obj.f17533a = Parcel.obtain();
            if (list2 == null) {
                list2 = list3;
            }
            int size = list2.size();
            int i8 = 0;
            while (i8 < size) {
                C1583e c1583e = (C1583e) list2.get(i8);
                C1588g0 c1588g0 = (C1588g0) c1583e.f10229a;
                int i9 = c1583e.f10230b;
                int i10 = c1583e.f10231c;
                obj.f17533a.recycle();
                obj.f17533a = Parcel.obtain();
                InterfaceC3041o interfaceC3041o = c1588g0.f10242a;
                long j6 = c1588g0.f10253l;
                long j7 = c1588g0.f10249h;
                long j8 = c1588g0.f10243b;
                int i11 = i8;
                long mo4717b = interfaceC3041o.mo4717b();
                List list4 = list2;
                int i12 = size;
                long j9 = C0677s.f2209g;
                if (!C0677s.m1454c(mo4717b, j9)) {
                    obj.m5672c((byte) 1);
                    i7 = i10;
                    obj.m5675f(c1588g0.f10242a.mo4717b());
                } else {
                    i7 = i10;
                }
                long j10 = C3105o.f15708c;
                byte b9 = 2;
                if (!C3105o.m4794a(j8, j10)) {
                    obj.m5672c((byte) 2);
                    obj.m5674e(j8);
                }
                C2300k c2300k = c1588g0.f10244c;
                if (c2300k != null) {
                    obj.m5672c((byte) 3);
                    obj.f17533a.writeInt(c2300k.f13237e);
                }
                C2298i c2298i = c1588g0.f10245d;
                if (c2298i != null) {
                    int i13 = c2298i.f13229a;
                    obj.m5672c((byte) 4);
                    if (i13 == 0 || i13 != 1) {
                        b8 = 0;
                    } else {
                        b8 = 1;
                    }
                    obj.m5672c(b8);
                }
                C2299j c2299j = c1588g0.f10246e;
                if (c2299j != null) {
                    int i14 = c2299j.f13230a;
                    obj.m5672c((byte) 5);
                    if (i14 != 0) {
                        if (i14 == 65535) {
                            b9 = 1;
                        } else if (i14 != 1) {
                            if (i14 == 2) {
                                b9 = 3;
                            }
                        }
                        obj.m5672c(b9);
                    }
                    b9 = 0;
                    obj.m5672c(b9);
                }
                String str2 = c1588g0.f10248g;
                if (str2 != null) {
                    obj.m5672c((byte) 6);
                    obj.f17533a.writeString(str2);
                }
                if (!C3105o.m4794a(j7, j10)) {
                    obj.m5672c((byte) 7);
                    obj.m5674e(j7);
                }
                C3027a c3027a = c1588g0.f10250i;
                if (c3027a != null) {
                    float f7 = c3027a.f15585a;
                    obj.m5672c((byte) 8);
                    obj.m5673d(f7);
                }
                C3042p c3042p = c1588g0.f10251j;
                if (c3042p != null) {
                    obj.m5672c((byte) 9);
                    obj.m5673d(c3042p.f15611a);
                    obj.m5673d(c3042p.f15612b);
                }
                if (!C0677s.m1454c(j6, j9)) {
                    obj.m5672c((byte) 10);
                    obj.m5675f(j6);
                }
                C3038l c3038l = c1588g0.f10254m;
                if (c3038l != null) {
                    obj.m5672c((byte) 11);
                    obj.f17533a.writeInt(c3038l.f15607a);
                }
                C0665l0 c0665l0 = c1588g0.f10255n;
                if (c0665l0 != null) {
                    obj.m5672c((byte) 12);
                    obj.m5675f(c0665l0.f2177a);
                    long j11 = c0665l0.f2178b;
                    obj.m5673d(Float.intBitsToFloat((int) (j11 >> 32)));
                    obj.m5673d(Float.intBitsToFloat((int) (j11 & 4294967295L)));
                    obj.m5673d(c0665l0.f2179c);
                }
                spannableString.setSpan(new Annotation("androidx.compose.text.SpanStyle", Base64.encodeToString(obj.f17533a.marshall(), 0)), i9, i7, 33);
                i8 = i11 + 1;
                list2 = list4;
                size = i12;
            }
            str = spannableString;
        }
        this.f17534a.setPrimaryClip(ClipData.newPlainText("plain text", str));
    }
}
