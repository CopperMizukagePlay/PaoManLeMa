package p024c6;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p158u5.AbstractC3367j;
import p166v5.InterfaceC3594a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c6.d */
/* loaded from: classes.dex */
public final class C0437d implements Iterator, InterfaceC3594a {

    /* renamed from: e */
    public final CharSequence f1490e;

    /* renamed from: f */
    public int f1491f;

    /* renamed from: g */
    public int f1492g;

    /* renamed from: h */
    public int f1493h;

    /* renamed from: i */
    public int f1494i;

    public C0437d(CharSequence charSequence) {
        AbstractC3367j.m5100e(charSequence, "string");
        this.f1490e = charSequence;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i7;
        int i8 = this.f1491f;
        if (i8 != 0) {
            if (i8 != 1) {
                return false;
            }
            return true;
        }
        int i9 = 2;
        if (this.f1494i < 0) {
            this.f1491f = 2;
            return false;
        }
        CharSequence charSequence = this.f1490e;
        int length = charSequence.length();
        int length2 = charSequence.length();
        for (int i10 = this.f1492g; i10 < length2; i10++) {
            char charAt = charSequence.charAt(i10);
            if (charAt == '\n' || charAt == '\r') {
                if (charAt != '\r' || (i7 = i10 + 1) >= charSequence.length() || charSequence.charAt(i7) != '\n') {
                    i9 = 1;
                }
                length = i10;
                this.f1491f = 1;
                this.f1494i = i9;
                this.f1493h = length;
                return true;
            }
        }
        i9 = -1;
        this.f1491f = 1;
        this.f1494i = i9;
        this.f1493h = length;
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.f1491f = 0;
            int i7 = this.f1493h;
            int i8 = this.f1492g;
            this.f1492g = this.f1494i + i7;
            return this.f1490e.subSequence(i8, i7).toString();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
