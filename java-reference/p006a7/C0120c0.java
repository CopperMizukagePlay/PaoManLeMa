package p006a7;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.c0 */
/* loaded from: classes.dex */
public class C0120c0 {

    /* renamed from: d */
    public static final C0118b0 f496d = new Object();

    /* renamed from: a */
    public boolean f497a;

    /* renamed from: b */
    public long f498b;

    /* renamed from: c */
    public long f499c;

    /* renamed from: a */
    public C0120c0 mo226a() {
        this.f497a = false;
        return this;
    }

    /* renamed from: b */
    public C0120c0 mo227b() {
        this.f499c = 0L;
        return this;
    }

    /* renamed from: c */
    public long mo228c() {
        if (this.f497a) {
            return this.f498b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* renamed from: d */
    public C0120c0 mo223d(long j6) {
        this.f497a = true;
        this.f498b = j6;
        return this;
    }

    /* renamed from: e */
    public boolean mo229e() {
        return this.f497a;
    }

    /* renamed from: f */
    public void mo224f() {
        if (!Thread.currentThread().isInterrupted()) {
            if (this.f497a && this.f498b - System.nanoTime() <= 0) {
                throw new InterruptedIOException("deadline reached");
            }
            return;
        }
        throw new InterruptedIOException("interrupted");
    }

    /* renamed from: g */
    public C0120c0 mo225g(long j6, TimeUnit timeUnit) {
        AbstractC3367j.m5100e(timeUnit, "unit");
        if (j6 >= 0) {
            this.f499c = timeUnit.toNanos(j6);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j6).toString());
    }

    /* renamed from: h */
    public long mo230h() {
        return this.f499c;
    }
}
