package p164v3;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v3.h */
/* loaded from: classes.dex */
public final class C3584h {

    /* renamed from: a */
    public final int f17215a;

    /* renamed from: b */
    public final int f17216b;

    /* renamed from: c */
    public final long f17217c;

    /* renamed from: d */
    public final long f17218d;

    public C3584h(int i7, int i8, long j6, long j7) {
        this.f17215a = i7;
        this.f17216b = i8;
        this.f17217c = j6;
        this.f17218d = j7;
    }

    /* renamed from: a */
    public static C3584h m5572a(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            C3584h c3584h = new C3584h(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return c3584h;
        } finally {
        }
    }

    /* renamed from: b */
    public final void m5573b(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.f17215a);
            dataOutputStream.writeInt(this.f17216b);
            dataOutputStream.writeLong(this.f17217c);
            dataOutputStream.writeLong(this.f17218d);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof C3584h)) {
            C3584h c3584h = (C3584h) obj;
            if (this.f17216b == c3584h.f17216b && this.f17217c == c3584h.f17217c && this.f17215a == c3584h.f17215a && this.f17218d == c3584h.f17218d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.f17216b), Long.valueOf(this.f17217c), Integer.valueOf(this.f17215a), Long.valueOf(this.f17218d));
    }
}
