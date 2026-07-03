package p170w1;

import android.os.Parcel;
import p035e1.C0677s;
import p068i5.AbstractC2080d;
import p140s2.C3105o;
import p140s2.C3106p;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.g1 */
/* loaded from: classes.dex */
public final class C3678g1 {

    /* renamed from: a */
    public Parcel f17533a;

    /* renamed from: a */
    public long m5670a() {
        int i7 = C0677s.f2210h;
        long readLong = this.f17533a.readLong();
        long j6 = 63 & readLong;
        if (j6 < 16) {
            return readLong;
        }
        return (readLong & (-64)) | (j6 + 1);
    }

    /* renamed from: b */
    public long m5671b() {
        long j6;
        Parcel parcel = this.f17533a;
        byte readByte = parcel.readByte();
        if (readByte == 1) {
            j6 = 4294967296L;
        } else if (readByte == 2) {
            j6 = 8589934592L;
        } else {
            j6 = 0;
        }
        if (C3106p.m4798a(j6, 0L)) {
            return C3105o.f15708c;
        }
        return AbstractC2080d.m3413z(parcel.readFloat(), j6);
    }

    /* renamed from: c */
    public void m5672c(byte b8) {
        this.f17533a.writeByte(b8);
    }

    /* renamed from: d */
    public void m5673d(float f7) {
        this.f17533a.writeFloat(f7);
    }

    /* renamed from: e */
    public void m5674e(long j6) {
        long m4795b = C3105o.m4795b(j6);
        byte b8 = 0;
        if (!C3106p.m4798a(m4795b, 0L)) {
            if (C3106p.m4798a(m4795b, 4294967296L)) {
                b8 = 1;
            } else if (C3106p.m4798a(m4795b, 8589934592L)) {
                b8 = 2;
            }
        }
        m5672c(b8);
        if (!C3106p.m4798a(C3105o.m4795b(j6), 0L)) {
            m5673d(C3105o.m4796c(j6));
        }
    }

    /* renamed from: f */
    public void m5675f(long j6) {
        long j7 = 63 & j6;
        if (Long.compare(Long.MIN_VALUE ^ j7, -9223372036854775792L) >= 0) {
            j6 = (j6 & (-64)) | (j7 - 1);
        }
        this.f17533a.writeLong(j6);
    }
}
