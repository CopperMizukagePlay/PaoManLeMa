package p096m3;

import java.nio.ByteBuffer;
import p068i5.AbstractC2083g;
import p104n3.C2716a;
import p104n3.C2717b;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m3.w */
/* loaded from: classes.dex */
public final class C2573w {

    /* renamed from: d */
    public static final ThreadLocal f13970d = new ThreadLocal();

    /* renamed from: a */
    public final int f13971a;

    /* renamed from: b */
    public final C2572v f13972b;

    /* renamed from: c */
    public volatile int f13973c = 0;

    public C2573w(C2572v c2572v, int i7) {
        this.f13972b = c2572v;
        this.f13971a = i7;
    }

    /* renamed from: a */
    public final int m4104a(int i7) {
        C2716a m4105b = m4105b();
        int m3415a = m4105b.m3415a(16);
        if (m3415a != 0) {
            ByteBuffer byteBuffer = (ByteBuffer) m4105b.f12319h;
            int i8 = m3415a + m4105b.f12316e;
            return byteBuffer.getInt((i7 * 4) + byteBuffer.getInt(i8) + i8 + 4);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [i5.g, java.lang.Object] */
    /* renamed from: b */
    public final C2716a m4105b() {
        ThreadLocal threadLocal = f13970d;
        C2716a c2716a = (C2716a) threadLocal.get();
        C2716a c2716a2 = c2716a;
        if (c2716a == null) {
            ?? abstractC2083g = new AbstractC2083g();
            threadLocal.set(abstractC2083g);
            c2716a2 = abstractC2083g;
        }
        C2717b c2717b = (C2717b) this.f13972b.f13966e;
        int m3415a = c2717b.m3415a(6);
        if (m3415a != 0) {
            int i7 = m3415a + c2717b.f12316e;
            int i8 = (this.f13971a * 4) + ((ByteBuffer) c2717b.f12319h).getInt(i7) + i7 + 4;
            int i9 = ((ByteBuffer) c2717b.f12319h).getInt(i8) + i8;
            ByteBuffer byteBuffer = (ByteBuffer) c2717b.f12319h;
            c2716a2.f12319h = byteBuffer;
            if (byteBuffer != null) {
                c2716a2.f12316e = i9;
                int i10 = i9 - byteBuffer.getInt(i9);
                c2716a2.f12317f = i10;
                c2716a2.f12318g = ((ByteBuffer) c2716a2.f12319h).getShort(i10);
                return c2716a2;
            }
            c2716a2.f12316e = 0;
            c2716a2.f12317f = 0;
            c2716a2.f12318g = 0;
        }
        return c2716a2;
    }

    public final String toString() {
        int i7;
        int i8;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", id:");
        C2716a m4105b = m4105b();
        int m3415a = m4105b.m3415a(4);
        if (m3415a != 0) {
            i7 = ((ByteBuffer) m4105b.f12319h).getInt(m3415a + m4105b.f12316e);
        } else {
            i7 = 0;
        }
        sb.append(Integer.toHexString(i7));
        sb.append(", codepoints:");
        C2716a m4105b2 = m4105b();
        int m3415a2 = m4105b2.m3415a(16);
        if (m3415a2 != 0) {
            int i9 = m3415a2 + m4105b2.f12316e;
            i8 = ((ByteBuffer) m4105b2.f12319h).getInt(((ByteBuffer) m4105b2.f12319h).getInt(i9) + i9);
        } else {
            i8 = 0;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            sb.append(Integer.toHexString(m4104a(i10)));
            sb.append(" ");
        }
        return sb.toString();
    }
}
