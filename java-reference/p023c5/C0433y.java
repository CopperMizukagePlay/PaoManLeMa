package p023c5;

import android.graphics.Rect;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.y */
/* loaded from: classes.dex */
public final class C0433y {

    /* renamed from: a */
    public final C0430v f1472a;

    /* renamed from: b */
    public final int f1473b;

    /* renamed from: c */
    public final int f1474c;

    /* renamed from: d */
    public Rect f1475d;

    /* renamed from: e */
    public boolean f1476e;

    public C0433y(byte[] bArr, int i7, int i8, int i9, int i10) {
        this.f1472a = new C0430v(bArr, i7, i8);
        this.f1474c = i10;
        this.f1473b = i9;
        if (i7 * i8 <= bArr.length) {
            return;
        }
        throw new IllegalArgumentException("Image data does not match the resolution. " + i7 + "x" + i8 + " > " + bArr.length);
    }
}
