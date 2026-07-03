package p006a7;

import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a7.c */
/* loaded from: classes.dex */
public final class C0119c extends Thread {
    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        ReentrantLock reentrantLock;
        C0123f m217b;
        while (true) {
            try {
                reentrantLock = C0123f.f506h;
                reentrantLock.lock();
                try {
                    m217b = AbstractC0117b.m217b();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            } catch (InterruptedException unused) {
                continue;
            }
            if (m217b == C0123f.f510l) {
                C0123f.f510l = null;
                reentrantLock.unlock();
                return;
            } else {
                reentrantLock.unlock();
                if (m217b != null) {
                    m217b.mo235k();
                }
            }
        }
    }
}
