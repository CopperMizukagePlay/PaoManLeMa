package p096m3;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;
import p006a7.C0129l;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.z */
/* loaded from: classes.dex */
public final class C2576z implements Spannable {

    /* renamed from: e */
    public boolean f13979e = false;

    /* renamed from: f */
    public Spannable f13980f;

    public C2576z(Spannable spannable) {
        this.f13980f = spannable;
    }

    /* renamed from: a */
    public final void m4106a() {
        C0129l c0129l;
        Spannable spannable = this.f13980f;
        if (!this.f13979e) {
            if (Build.VERSION.SDK_INT < 28) {
                c0129l = new C0129l(24);
            } else {
                c0129l = new C0129l(24);
            }
            if (c0129l.mo283i(spannable)) {
                this.f13980f = new SpannableString(spannable);
            }
        }
        this.f13979e = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i7) {
        return this.f13980f.charAt(i7);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.f13980f.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.f13980f.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f13980f.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f13980f.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f13980f.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i7, int i8, Class cls) {
        return this.f13980f.getSpans(i7, i8, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f13980f.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i7, int i8, Class cls) {
        return this.f13980f.nextSpanTransition(i7, i8, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        m4106a();
        this.f13980f.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i7, int i8, int i9) {
        m4106a();
        this.f13980f.setSpan(obj, i7, i8, i9);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i7, int i8) {
        return this.f13980f.subSequence(i7, i8);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f13980f.toString();
    }
}
