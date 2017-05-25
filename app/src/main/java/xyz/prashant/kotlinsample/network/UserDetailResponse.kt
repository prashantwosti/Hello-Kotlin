package xyz.prashant.kotlinsample.network

import com.google.gson.annotations.SerializedName

/**
 * Created by prashantwosti on 5/22/2017.
 */

data class UserDetailResponse(@SerializedName("login") val login: String,
                              @SerializedName("id") val id: Long,
                              @SerializedName("avatar_url") val avatarUrl: String,
                              @SerializedName("gravatar_id") val gravatarId: String,
                              @SerializedName("url") val url: String,
                              @SerializedName("html_url") val htmlUrl: String,
                              @SerializedName("followers_url") val followersUrl: String,
                              @SerializedName("following_url") val followingUrl: String,
                              @SerializedName("gists_url") val gistsUrl: String,
                              @SerializedName("starred_url") val starredUrl: String,
                              @SerializedName("subscriptions_url") val subscriptionsUrl: String,
                              @SerializedName("organizations_url") val organizationsUrl: String,
                              @SerializedName("repos_url") val reposUrl: String,
                              @SerializedName("events_url") val eventsUrl: String,
                              @SerializedName("received_events_url") val receivedEventsUrl: String,
                              @SerializedName("type") val type: String,
                              @SerializedName("site_admin") val siteAdmin: Boolean,
                              @SerializedName("name") val name: String,
                              @SerializedName("company") val company: Any,
                              @SerializedName("blog") val blog: String,
                              @SerializedName("location") val location: String,
                              @SerializedName("email") val email: Any,
                              @SerializedName("hireable") val hireable: Boolean,
                              @SerializedName("bio") val bio: String,
                              @SerializedName("public_repos") val publicRepos: Long,
                              @SerializedName("public_gists") val publicGists: Long,
                              @SerializedName("followers") val followers: Long,
                              @SerializedName("following") val following: Long,
                              @SerializedName("created_at") val createdAt: String,
                              @SerializedName("updated_at") val updatedAt: String) {

    override fun toString(): String {
        return "Response {" + "\n" +
                "login='$login', " + "\n" +
                "id=$id, " + "\n" +
                "avatarUrl='$avatarUrl', " + "\n" +
                "gravatarId='$gravatarId', " + "\n" +
                "url='$url', " + "\n" +
                "htmlUrl='$htmlUrl', " + "\n" +
                "followersUrl='$followersUrl', " + "\n" +
                "followingUrl='$followingUrl', " + "\n" +
                "gistsUrl='$gistsUrl', " + "\n" +
                "starredUrl='$starredUrl', " + "\n" +
                "subscriptionsUrl='$subscriptionsUrl', " + "\n" +
                "organizationsUrl='$organizationsUrl', " + "\n" +
                "reposUrl='$reposUrl', " + "\n" +
                "eventsUrl='$eventsUrl', " + "\n" +
                "receivedEventsUrl='$receivedEventsUrl', " + "\n" +
                "type='$type', " + "\n" +
                "siteAdmin=$siteAdmin, " + "\n" +
                "name='$name', " + "\n" +
                "company=$company, " + "\n" +
                "blog='$blog', " + "\n" +
                "location='$location', " + "\n" +
                "email=$email, " + "\n" +
                "hireable=$hireable, " + "\n" +
                "bio='$bio', " + "\n" +
                "publicRepos=$publicRepos, " + "\n" +
                "publicGists=$publicGists, " + "\n" +
                "followers=$followers, " + "\n" +
                "following=$following, " + "\n" +
                "createdAt='$createdAt', " + "\n" +
                "updatedAt='$updatedAt" +
                "'}"
    }
}
