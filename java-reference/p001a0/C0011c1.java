package p001a0;

import android.view.KeyEvent;
import p073j2.AbstractC2168e;
import p102n1.AbstractC2710c;
import p102n1.C2708a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: a0.c1 */
/* loaded from: classes.dex */
public final class C0011c1 {

    /* renamed from: a */
    public final /* synthetic */ int f77a;

    public /* synthetic */ C0011c1(int i7) {
        this.f77a = i7;
    }

    /* JADX WARN: Code restructure failed: missing block: B:105:0x01a7, code lost:
    
        if (p102n1.C2708a.m4318a(p073j2.AbstractC2168e.m3517d(r10.getKeyCode()), p001a0.AbstractC0063p1.f304g) != false) goto L126;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x027e, code lost:
    
        if (p102n1.C2708a.m4318a(r0, p001a0.AbstractC0063p1.f314q) != false) goto L197;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int m27a(KeyEvent keyEvent) {
        int i7;
        int i8 = 20;
        switch (this.f77a) {
            case 0:
                int i9 = C0015d1.f94l;
                if (!keyEvent.isCtrlPressed() || !keyEvent.isShiftPressed()) {
                    boolean z7 = true;
                    if (keyEvent.isCtrlPressed()) {
                        long m4345s = AbstractC2710c.m4345s(keyEvent);
                        if (!C2708a.m4318a(m4345s, AbstractC0063p1.f299b)) {
                            z7 = C2708a.m4318a(m4345s, AbstractC0063p1.f314q);
                        }
                        if (!z7) {
                            if (!C2708a.m4318a(m4345s, AbstractC0063p1.f301d)) {
                                if (!C2708a.m4318a(m4345s, AbstractC0063p1.f303f)) {
                                    if (C2708a.m4318a(m4345s, AbstractC0063p1.f298a)) {
                                        return 26;
                                    }
                                    if (!C2708a.m4318a(m4345s, AbstractC0063p1.f302e)) {
                                        if (C2708a.m4318a(m4345s, AbstractC0063p1.f304g)) {
                                            return 46;
                                        }
                                        return 0;
                                    }
                                    return 47;
                                }
                                return 19;
                            }
                            return 18;
                        }
                        return 17;
                    }
                    if (!keyEvent.isCtrlPressed()) {
                        if (keyEvent.isShiftPressed()) {
                            long m3517d = AbstractC2168e.m3517d(keyEvent.getKeyCode());
                            if (C2708a.m4318a(m3517d, AbstractC0063p1.f306i)) {
                                return 27;
                            }
                            if (C2708a.m4318a(m3517d, AbstractC0063p1.f307j)) {
                                return 28;
                            }
                            if (C2708a.m4318a(m3517d, AbstractC0063p1.f308k)) {
                                return 29;
                            }
                            if (C2708a.m4318a(m3517d, AbstractC0063p1.f309l)) {
                                return 30;
                            }
                            if (C2708a.m4318a(m3517d, AbstractC0063p1.f310m)) {
                                return 31;
                            }
                            if (C2708a.m4318a(m3517d, AbstractC0063p1.f311n)) {
                                return 32;
                            }
                            if (C2708a.m4318a(m3517d, AbstractC0063p1.f312o)) {
                                return 39;
                            }
                            if (!C2708a.m4318a(m3517d, AbstractC0063p1.f313p)) {
                                break;
                            } else {
                                return 40;
                            }
                        } else {
                            long m3517d2 = AbstractC2168e.m3517d(keyEvent.getKeyCode());
                            if (C2708a.m4318a(m3517d2, AbstractC0063p1.f306i)) {
                                return 1;
                            }
                            if (C2708a.m4318a(m3517d2, AbstractC0063p1.f307j)) {
                                return 2;
                            }
                            if (C2708a.m4318a(m3517d2, AbstractC0063p1.f308k)) {
                                return 11;
                            }
                            if (C2708a.m4318a(m3517d2, AbstractC0063p1.f309l)) {
                                return 12;
                            }
                            if (C2708a.m4318a(m3517d2, AbstractC0063p1.f310m)) {
                                return 13;
                            }
                            if (C2708a.m4318a(m3517d2, AbstractC0063p1.f311n)) {
                                return 14;
                            }
                            if (C2708a.m4318a(m3517d2, AbstractC0063p1.f312o)) {
                                return 7;
                            }
                            if (C2708a.m4318a(m3517d2, AbstractC0063p1.f313p)) {
                                return 8;
                            }
                            if (C2708a.m4318a(m3517d2, AbstractC0063p1.f315r)) {
                                return 44;
                            }
                            if (C2708a.m4318a(m3517d2, AbstractC0063p1.f316s)) {
                                return 20;
                            }
                            if (C2708a.m4318a(m3517d2, AbstractC0063p1.f317t)) {
                                return 21;
                            }
                            if (!C2708a.m4318a(m3517d2, AbstractC0063p1.f318u)) {
                                if (!C2708a.m4318a(m3517d2, AbstractC0063p1.f319v)) {
                                    if (!C2708a.m4318a(m3517d2, AbstractC0063p1.f320w)) {
                                        if (C2708a.m4318a(m3517d2, AbstractC0063p1.f321x)) {
                                            return 45;
                                        }
                                    }
                                    return 17;
                                }
                                return 19;
                            }
                            return 18;
                        }
                    }
                    return 0;
                }
                break;
                break;
            default:
                if (keyEvent.isShiftPressed() && keyEvent.isAltPressed()) {
                    long m3517d3 = AbstractC2168e.m3517d(keyEvent.getKeyCode());
                    if (C2708a.m4318a(m3517d3, AbstractC0063p1.f306i)) {
                        i7 = 41;
                    } else if (C2708a.m4318a(m3517d3, AbstractC0063p1.f307j)) {
                        i7 = 42;
                    } else if (C2708a.m4318a(m3517d3, AbstractC0063p1.f308k)) {
                        i7 = 33;
                    } else {
                        if (C2708a.m4318a(m3517d3, AbstractC0063p1.f309l)) {
                            i7 = 34;
                        }
                        i7 = 0;
                    }
                } else {
                    if (keyEvent.isAltPressed()) {
                        long m3517d4 = AbstractC2168e.m3517d(keyEvent.getKeyCode());
                        if (C2708a.m4318a(m3517d4, AbstractC0063p1.f306i)) {
                            i7 = 9;
                        } else if (C2708a.m4318a(m3517d4, AbstractC0063p1.f307j)) {
                            i7 = 10;
                        } else if (C2708a.m4318a(m3517d4, AbstractC0063p1.f308k)) {
                            i7 = 15;
                        } else if (C2708a.m4318a(m3517d4, AbstractC0063p1.f309l)) {
                            i7 = 16;
                        }
                    }
                    i7 = 0;
                }
                if (i7 == 0) {
                    C0019e1 c0019e1 = AbstractC0023f1.f119a;
                    c0019e1.getClass();
                    if (keyEvent.isShiftPressed() && keyEvent.isCtrlPressed()) {
                        long m3517d5 = AbstractC2168e.m3517d(keyEvent.getKeyCode());
                        if (C2708a.m4318a(m3517d5, AbstractC0063p1.f306i)) {
                            i8 = 35;
                        } else if (C2708a.m4318a(m3517d5, AbstractC0063p1.f307j)) {
                            i8 = 36;
                        } else if (C2708a.m4318a(m3517d5, AbstractC0063p1.f308k)) {
                            i8 = 38;
                        } else {
                            if (C2708a.m4318a(m3517d5, AbstractC0063p1.f309l)) {
                                i8 = 37;
                            }
                            i8 = 0;
                        }
                    } else if (keyEvent.isCtrlPressed()) {
                        long m3517d6 = AbstractC2168e.m3517d(keyEvent.getKeyCode());
                        if (C2708a.m4318a(m3517d6, AbstractC0063p1.f306i)) {
                            i8 = 4;
                        } else if (C2708a.m4318a(m3517d6, AbstractC0063p1.f307j)) {
                            i8 = 3;
                        } else if (C2708a.m4318a(m3517d6, AbstractC0063p1.f308k)) {
                            i8 = 6;
                        } else if (C2708a.m4318a(m3517d6, AbstractC0063p1.f309l)) {
                            i8 = 5;
                        } else if (!C2708a.m4318a(m3517d6, AbstractC0063p1.f300c)) {
                            if (C2708a.m4318a(m3517d6, AbstractC0063p1.f317t)) {
                                i8 = 23;
                            } else if (C2708a.m4318a(m3517d6, AbstractC0063p1.f316s)) {
                                i8 = 22;
                            } else {
                                if (C2708a.m4318a(m3517d6, AbstractC0063p1.f305h)) {
                                    i8 = 43;
                                }
                                i8 = 0;
                            }
                        }
                    } else if (keyEvent.isShiftPressed()) {
                        long m3517d7 = AbstractC2168e.m3517d(keyEvent.getKeyCode());
                        if (C2708a.m4318a(m3517d7, AbstractC0063p1.f312o)) {
                            i8 = 41;
                        } else {
                            if (C2708a.m4318a(m3517d7, AbstractC0063p1.f313p)) {
                                i8 = 42;
                            }
                            i8 = 0;
                        }
                    } else {
                        if (keyEvent.isAltPressed()) {
                            long m3517d8 = AbstractC2168e.m3517d(keyEvent.getKeyCode());
                            if (C2708a.m4318a(m3517d8, AbstractC0063p1.f316s)) {
                                i8 = 24;
                            } else if (C2708a.m4318a(m3517d8, AbstractC0063p1.f317t)) {
                                i8 = 25;
                            }
                        }
                        i8 = 0;
                    }
                    if (i8 == 0) {
                        return ((C0011c1) c0019e1.f109e).m27a(keyEvent);
                    }
                    return i8;
                }
                return i7;
        }
    }
}
