package com.courseori.server.helper;

import com.courseori.server.foodcategory.entity.FoodCategory;
import com.courseori.server.image.entity.ImageUrl;
import com.courseori.server.item.dto.ItemDto;
import com.courseori.server.item.entity.Item;
import com.courseori.server.location.entity.Location;
import com.courseori.server.member.entity.Member;
import com.courseori.server.member.role.Roles;
import com.courseori.server.participants.Participants;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class StubData {

    static Date createdAt = new Date();
    static Date modifiedAt = new Date();
    static Date deadline = new Date();
    static Location pickupLocation = new Location("더큰내일센터", "제주도 연북로", "2층 우도 회의실", 1, (float)123.1234, (float)123.1234);
    static List<Participants> participantsList = new ArrayList<>();
    static ImageUrl imageUrl = new ImageUrl("http://test.com", 1);
    static Roles roles = new Roles("ROLE_USER");
    static Member member = new Member("User1", "test@email.com", "password", "010-1111-1111", pickupLocation, imageUrl, "Card", roles);

    static FoodCategory foodCategory = new FoodCategory("Category1");

    public static Item getSinglePost() {

        Item item = new Item(member, "Title1", foodCategory, deadline, pickupLocation,  "Restaurant1", "http://test-url.com", "Body1", imageUrl);

        return item;
    }

    public static ItemDto.Response getSingleResponseBody() {

        ItemDto.Response response = new ItemDto.Response(1L, 1L, "Title1", foodCategory, createdAt, modifiedAt, deadline, pickupLocation, "Restaurant1", "http://test-url.com", participantsList, "Body1", imageUrl);

        return response;
    }

    public static List<ItemDto.Response> getMultiResponseBody() {

        ItemDto.Response response1 = new ItemDto.Response(1L, 1L, "Title1", foodCategory, createdAt, modifiedAt, deadline, pickupLocation, "Restaurant1", "http://test-url.com", participantsList,"Body1", imageUrl);
        ItemDto.Response response2 = new ItemDto.Response(2L, 2L, "Title2", foodCategory, createdAt, modifiedAt, deadline, pickupLocation, "Restaurant2", "http://test-url.com", participantsList,"Body2", imageUrl);
        ItemDto.Response response3 = new ItemDto.Response(3L, 3L, "Title3", foodCategory, createdAt, modifiedAt, deadline, pickupLocation, "Restaurant1", "http://test-url.com", participantsList,"Body3", imageUrl);
        ItemDto.Response response4 = new ItemDto.Response(4L, 4L, "Title4", foodCategory, createdAt, modifiedAt, deadline, pickupLocation, "Restaurant1", "http://test-url.com", participantsList,"Body4", imageUrl);
        ItemDto.Response response5 = new ItemDto.Response(5L, 5L, "Title5", foodCategory, createdAt, modifiedAt, deadline, pickupLocation, "Restaurant1", "http://test-url.com", participantsList,"Body5", imageUrl);
        ItemDto.Response response6 = new ItemDto.Response(6L, 6L, "Title6", foodCategory, createdAt, modifiedAt, deadline, pickupLocation, "Restaurant1", "http://test-url.com", participantsList,"Body6", imageUrl);
        ItemDto.Response response7 = new ItemDto.Response(7L, 7L, "Title7", foodCategory, createdAt, modifiedAt, deadline, pickupLocation, "Restaurant1", "http://test-url.com", participantsList,"Body7", imageUrl);
        ItemDto.Response response8 = new ItemDto.Response(8L, 8L, "Title8", foodCategory, createdAt, modifiedAt, deadline, pickupLocation, "Restaurant1", "http://test-url.com", participantsList,"Body8", imageUrl);
        ItemDto.Response response9 = new ItemDto.Response(9L, 9L, "Title9", foodCategory, createdAt, modifiedAt, deadline, pickupLocation, "Restaurant1", "http://test-url.com", participantsList,"Body9", imageUrl);
        ItemDto.Response response10 = new ItemDto.Response(10L, 10L, "Title10", foodCategory, createdAt, modifiedAt, deadline, pickupLocation, "Restaurant1", "http://test-url.com", participantsList,"Body10", imageUrl);

        List<ItemDto.Response> responseList = List.of(response1, response2, response3, response4, response5, response6, response7, response8, response9, response10);

        return responseList;

    }
}