package p151t6;

import p006a7.C0129l;
import p006a7.C0130m;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: t6.b */
/* loaded from: classes.dex */
public final class C3287b {

    /* renamed from: d */
    public static final C0130m f16132d;

    /* renamed from: e */
    public static final C0130m f16133e;

    /* renamed from: f */
    public static final C0130m f16134f;

    /* renamed from: g */
    public static final C0130m f16135g;

    /* renamed from: h */
    public static final C0130m f16136h;

    /* renamed from: i */
    public static final C0130m f16137i;

    /* renamed from: a */
    public final C0130m f16138a;

    /* renamed from: b */
    public final C0130m f16139b;

    /* renamed from: c */
    public final int f16140c;

    static {
        C0130m c0130m = C0130m.f528h;
        f16132d = C0129l.m278g(":");
        f16133e = C0129l.m278g(":status");
        f16134f = C0129l.m278g(":method");
        f16135g = C0129l.m278g(":path");
        f16136h = C0129l.m278g(":scheme");
        f16137i = C0129l.m278g(":authority");
    }

    public C3287b(C0130m c0130m, C0130m c0130m2) {
        AbstractC3367j.m5100e(c0130m, "name");
        AbstractC3367j.m5100e(c0130m2, "value");
        this.f16138a = c0130m;
        this.f16139b = c0130m2;
        this.f16140c = c0130m2.mo286c() + c0130m.mo286c() + 32;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3287b)) {
            return false;
        }
        C3287b c3287b = (C3287b) obj;
        if (AbstractC3367j.m5096a(this.f16138a, c3287b.f16138a) && AbstractC3367j.m5096a(this.f16139b, c3287b.f16139b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f16139b.hashCode() + (this.f16138a.hashCode() * 31);
    }

    public final String toString() {
        return this.f16138a.m293j() + ": " + this.f16139b.m293j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3287b(String str, String str2) {
        this(C0129l.m278g(str), C0129l.m278g(str2));
        AbstractC3367j.m5100e(str, "name");
        AbstractC3367j.m5100e(str2, "value");
        C0130m c0130m = C0130m.f528h;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3287b(C0130m c0130m, String str) {
        this(c0130m, C0129l.m278g(str));
        AbstractC3367j.m5100e(c0130m, "name");
        AbstractC3367j.m5100e(str, "value");
        C0130m c0130m2 = C0130m.f528h;
    }
}
