package p058h2;

import java.text.CharacterIterator;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h2.c */
/* loaded from: classes.dex */
public final class C1766c implements CharacterIterator {

    /* renamed from: e */
    public final CharSequence f10774e;

    /* renamed from: f */
    public final int f10775f;

    /* renamed from: g */
    public int f10776g = 0;

    public C1766c(CharSequence charSequence, int i7) {
        this.f10774e = charSequence;
        this.f10775f = i7;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int i7 = this.f10776g;
        if (i7 == this.f10775f) {
            return (char) 65535;
        }
        return this.f10774e.charAt(i7);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.f10776g = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.f10775f;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.f10776g;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int i7 = this.f10775f;
        if (i7 == 0) {
            this.f10776g = i7;
            return (char) 65535;
        }
        int i8 = i7 - 1;
        this.f10776g = i8;
        return this.f10774e.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int i7 = this.f10776g + 1;
        this.f10776g = i7;
        int i8 = this.f10775f;
        if (i7 >= i8) {
            this.f10776g = i8;
            return (char) 65535;
        }
        return this.f10774e.charAt(i7);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int i7 = this.f10776g;
        if (i7 <= 0) {
            return (char) 65535;
        }
        int i8 = i7 - 1;
        this.f10776g = i8;
        return this.f10774e.charAt(i8);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int i7) {
        if (i7 <= this.f10775f && i7 >= 0) {
            this.f10776g = i7;
            return current();
        }
        throw new IllegalArgumentException("invalid position");
    }
}
