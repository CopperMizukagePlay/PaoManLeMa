package com.paoman.lema;

import android.R;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.IBinder;
import p035e1.AbstractC0656h;
import p039e5.AbstractC1374vn;
import p039e5.C1333ud;
import p039e5.RunnableC1343un;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* loaded from: classes.dex */
public final class KeepAliveService extends Service {

    /* renamed from: e */
    public MediaSession f1563e;

    /* renamed from: f */
    public boolean f1564f;

    /* renamed from: a */
    public final Notification m988a(boolean z7, boolean z8) {
        Notification.Builder builder;
        String str;
        String str2;
        Notification.Action build;
        MediaSession.Token token;
        if (Build.VERSION.SDK_INT >= 26) {
            builder = AbstractC0656h.m1368b(this);
        } else {
            builder = new Notification.Builder(this);
        }
        Notification.Builder smallIcon = builder.setSmallIcon(R.drawable.stat_sys_upload_done);
        if (z7) {
            str = "静音音频保活运行中";
        } else {
            str = "测速保活运行中";
        }
        Notification.Builder contentTitle = smallIcon.setContentTitle(str);
        if (z7) {
            str2 = "通知栏媒体控件用于维持静音播放会话";
        } else {
            str2 = "用于降低测速任务在后台被系统回收的概率";
        }
        contentTitle.setContentText(str2).setOngoing(true).setShowWhen(false);
        if (z7) {
            if (this.f1563e == null) {
                MediaSession mediaSession = new MediaSession(this, "SpeedSilentKeepAlive");
                mediaSession.setCallback(new C1333ud(this));
                mediaSession.setActive(true);
                this.f1563e = mediaSession;
            }
            if (z8) {
                build = new Notification.Action.Builder(R.drawable.ic_media_pause, "暂停", m990c("com.paoman.lema.keepalive.MEDIA_PAUSE")).build();
            } else {
                build = new Notification.Action.Builder(R.drawable.ic_media_play, "播放", m990c("com.paoman.lema.keepalive.MEDIA_PLAY")).build();
            }
            AbstractC3367j.m5097b(build);
            Notification.Action build2 = new Notification.Action.Builder(R.drawable.ic_menu_close_clear_cancel, "停止", m990c("com.paoman.lema.keepalive.STOP")).build();
            AbstractC3367j.m5099d(build2, "build(...)");
            Notification.Builder addAction = builder.addAction(build).addAction(build2);
            Notification.MediaStyle mediaStyle = new Notification.MediaStyle();
            MediaSession mediaSession2 = this.f1563e;
            if (mediaSession2 != null) {
                token = mediaSession2.getSessionToken();
            } else {
                token = null;
            }
            addAction.setStyle(mediaStyle.setMediaSession(token).setShowActionsInCompactView(0, 1));
        }
        Notification build3 = builder.build();
        AbstractC3367j.m5099d(build3, "build(...)");
        return build3;
    }

    /* renamed from: b */
    public final void m989b() {
        if (Build.VERSION.SDK_INT < 26) {
            return;
        }
        Object systemService = getSystemService("notification");
        AbstractC3367j.m5098c(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        AbstractC0656h.m1375i();
        ((NotificationManager) systemService).createNotificationChannel(AbstractC0656h.m1392z());
    }

    /* renamed from: c */
    public final PendingIntent m990c(String str) {
        int hashCode = str.hashCode();
        Intent intent = new Intent(this, (Class<?>) KeepAliveService.class);
        intent.setAction(str);
        PendingIntent service = PendingIntent.getService(this, hashCode, intent, 201326592);
        AbstractC3367j.m5099d(service, "getService(...)");
        return service;
    }

    /* renamed from: d */
    public final void m991d() {
        m989b();
        if (this.f1563e == null) {
            MediaSession mediaSession = new MediaSession(this, "SpeedSilentKeepAlive");
            mediaSession.setCallback(new C1333ud(this));
            mediaSession.setActive(true);
            this.f1563e = mediaSession;
        }
        if (AbstractC1374vn.f8208a.compareAndSet(false, true)) {
            Thread thread = new Thread(new RunnableC1343un(0), "SpeedSilentKeepAlive");
            thread.setDaemon(true);
            thread.start();
            AbstractC1374vn.f8210c = thread;
        }
        m993f(true);
    }

    /* renamed from: e */
    public final void m992e() {
        this.f1564f = false;
        AbstractC1374vn.m2372a();
        m993f(false);
        MediaSession mediaSession = this.f1563e;
        if (mediaSession != null) {
            mediaSession.setActive(false);
        }
        MediaSession mediaSession2 = this.f1563e;
        if (mediaSession2 != null) {
            mediaSession2.release();
        }
        this.f1563e = null;
    }

    /* renamed from: f */
    public final void m993f(boolean z7) {
        int i7;
        float f7;
        MediaSession mediaSession = this.f1563e;
        if (mediaSession != null) {
            PlaybackState.Builder actions = new PlaybackState.Builder().setActions(7L);
            if (z7) {
                i7 = 3;
            } else {
                i7 = 2;
            }
            if (z7) {
                f7 = 1.0f;
            } else {
                f7 = 0.0f;
            }
            mediaSession.setPlaybackState(actions.setState(i7, -1L, f7).build());
        }
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        m992e();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i7, int i8) {
        String str;
        boolean z7;
        if (intent != null) {
            str = intent.getAction();
        } else {
            str = null;
        }
        boolean z8 = false;
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -2083089244) {
                if (hashCode != -357756431) {
                    if (hashCode == 1794143929 && str.equals("com.paoman.lema.keepalive.MEDIA_PAUSE")) {
                        this.f1564f = false;
                        AbstractC1374vn.m2372a();
                        m993f(false);
                        startForeground(2001, m988a(true, false));
                        return 1;
                    }
                } else if (str.equals("com.paoman.lema.keepalive.MEDIA_PLAY")) {
                    this.f1564f = true;
                    m991d();
                    boolean z9 = this.f1564f;
                    if (z9 && AbstractC1374vn.f8208a.get()) {
                        z8 = true;
                    }
                    startForeground(2001, m988a(z9, z8));
                    return 1;
                }
            } else if (str.equals("com.paoman.lema.keepalive.STOP")) {
                m992e();
                stopForeground(1);
                stopSelf();
                return 2;
            }
        }
        m989b();
        if (intent != null && intent.getBooleanExtra("silent_audio_keep_alive", false)) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.f1564f = z7;
        if (z7) {
            m991d();
        } else {
            m992e();
        }
        boolean z10 = this.f1564f;
        if (z10 && AbstractC1374vn.f8208a.get()) {
            z8 = true;
        }
        startForeground(2001, m988a(z10, z8));
        return 1;
    }
}
